package com.chtc.supervision.service;

import com.chtc.supervision.entity.CourseComment;
import com.chtc.util.DataRequest;
import com.chtc.util.DataTableReturnObject;
import com.chtc.util.Json;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ICourseCommentService {

    public Json createCourseComment(String id,HttpServletRequest request);

    public CourseComment getCourseComment(String id);

    public void saveCourseComment(CourseComment courseComment);

    public void submitComment(String id);

    public Json updateCheckedState(String[] arr, int state);

    public String deleteCourseComment(String[] ids);

    public Map<String, String> findCourseCommentByID(String id);

    public DataTableReturnObject findAllCourseCommentsById(DataRequest dr, String id);

    public DataTableReturnObject getCourseCommentPage(DataRequest dr, String searchRecordInfo, int state);

    public List<CourseComment> findByTime(Date startTime, Date endTime,String createBy);

}
