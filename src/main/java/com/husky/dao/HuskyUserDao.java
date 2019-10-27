package com.husky.dao;

import com.husky.model.HuskyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HuskyUserDao {
    List<HuskyUser> findAll();
}
