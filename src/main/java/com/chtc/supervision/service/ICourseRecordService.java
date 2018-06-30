package com.chtc.supervision.service;

import com.chtc.supervision.entity.CourseRecord;
import com.chtc.util.DataRequest;
import com.chtc.util.DataTableReturnObject;

import java.util.Date;
import java.util.List;

public interface ICourseRecordService {

    public void createCourseRecord(String id);

    public DataTableReturnObject getCourseRecordPageMode(DataRequest dr, String keyName, String code, String department);

    public List<CourseRecord> findAll(String department, String start, String end, String seNumber );

    public List<CourseRecord> findAll();

    public String findDepartmentNameById(String id);

    public List<CourseRecord> findByTeacherName(String teacherName);

    public DataTableReturnObject findAllCourseRecordsById(DataRequest dr, String searchCode, String searchName, String searchMajor);
}
