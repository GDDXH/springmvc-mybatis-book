package com.husky.test;

import com.husky.dao.HuskyUserDao;
import com.husky.model.HuskyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class HuskyUserDaoTest extends BaseJunit4Test {
    @Resource
    private HuskyUserDao huskyUserDao;
    @Test
    public void testFindAll(){
        List<HuskyUser> userList =huskyUserDao.findAll();
        System.out.println(userList.size());
    }
}
