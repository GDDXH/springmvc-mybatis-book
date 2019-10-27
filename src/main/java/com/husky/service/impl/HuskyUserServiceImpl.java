package com.husky.service.impl;

import com.husky.dao.HuskyUserDao;
import com.husky.model.HuskyUser;
import com.husky.service.HuskyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HuskyUserServiceImpl implements HuskyUserService {
    @Resource
    private HuskyUserDao huskyUserDao;
    public List<HuskyUser> findAll(){
        return huskyUserDao.findAll();
    }
}
