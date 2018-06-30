package com.chtc.supervision.service;

import com.chtc.supervision.entity.Department;
import com.chtc.supervision.entity.Task;
import com.chtc.supervision.entity.User;
import com.chtc.util.DataRequest;
import com.chtc.util.DataTableReturnObject;

import java.util.List;

public interface ITaskService {

    public DataTableReturnObject getTaskByUserId(String userId, DataRequest dataRequest);

    public Task save(Task task);

    public List<Task> findBySemesterId(String id);

    public void delete(String id);

    public Task findTaskByUserId(String id);

    public void updateTaskFinishTimes(String userId);
}
