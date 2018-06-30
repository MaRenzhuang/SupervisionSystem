package com.chtc.supervision.service;

import com.chtc.supervision.entity.Semester;

import java.util.Set;

public interface ISemesterService {

    public Set<String> findAllSemester();

    public Semester findSemster(String startYear, String endYear, int i);

    public Semester save(Semester semster);
}
