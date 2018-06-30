package com.chtc.supervision.service;

import com.chtc.supervision.entity.MajorDic;

import java.util.Set;

public interface IMajorService {

    public Set<MajorDic> findAllMajor();

    public void insertMajor();
}
