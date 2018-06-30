package com.chtc.supervision.service;

import com.chtc.supervision.entity.User;
import com.chtc.util.DataRequest;
import com.chtc.util.DataTableReturnObject;
import com.chtc.util.Json;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IUserService {
    public User findByUserName(String username);

    public DataTableReturnObject getUserPageMode(DataRequest dr, String searchUserInfo,String searchRoleName);

    public void resetUserPassword(String id);

    public User getUser(String id);

    public void saveOrUpdateUser(User user);

    public void deleteUser(String[] ids);

    public User getUser();
    
    public List<JSONObject> findUserByDepartmentId(String id);
    
    public User findByUserCode(String supervisionCode);

    public DataTableReturnObject getSupervisionPageMode(DataRequest dr, String keyName, String userCode, String departmentName);


    public User findUserByMobilePhone(String tel, String id);

    public User findUserByUserCode(String userCode, String id);

    public Json updatePassword(String userName, String newPassWord, String oldPassWord);

    public String addUserByFile(MultipartFile excel_file);
}
