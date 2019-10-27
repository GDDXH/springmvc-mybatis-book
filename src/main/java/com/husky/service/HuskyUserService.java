package com.husky.service;

import com.husky.model.HuskyUser;

import java.util.List;

public interface HuskyUserService {
    List<HuskyUser> findAll();
}
