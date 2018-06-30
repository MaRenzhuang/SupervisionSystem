package com.chtc.supervision.service;

import com.chtc.supervision.entity.Department;
import org.json.JSONObject;

import java.util.List;

public interface IDepartmentService {
    public List<Department> findAllDepartment();
}
