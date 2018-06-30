package com.chtc.supervision.service;

import com.chtc.supervision.dto.CourseDTO;
import com.chtc.util.CourseQueryUtil;
import com.chtc.util.DataRequest;
import com.chtc.util.DataTableReturnObject;
import org.springframework.web.multipart.MultipartFile;

public interface ICourseService {

    public String addCourseManual(CourseDTO course);

    public String queryCourseByCode(String code);

    public String addCourseByFile(MultipartFile excel_file);

    public DataTableReturnObject getCoursePageMode(DataRequest dr, CourseQueryUtil courseQuery);

    public CourseDTO queryCourseById(String id);

    public String updateCourse(CourseDTO course);

    public String deleteCourse(String[] ids);

    public DataTableReturnObject getCourseToMobile(DataRequest dr, String searchCourseInfo);
}
