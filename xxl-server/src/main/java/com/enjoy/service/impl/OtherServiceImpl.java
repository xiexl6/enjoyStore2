package com.enjoy.service.impl;

import com.enjoy.service.OtherService;

public class OtherServiceImpl implements OtherService {

    @Override
    public String getDetail(String id) {
        System.out.println("otherService 被调用一次："+id);
        return "OtherServiceImpl is in service";
    }
}
