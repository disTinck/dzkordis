package com.ora.qh.duapr.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ora.qh.order.orderInfoFSV;
import org.springframework.stereotype.Component;

import java.util.Map;

@Service
@Component
public class orderInfoFSVImpl implements orderInfoFSV {
    @Override
    public String allOrderInfoQuery(Map paramMap) {

        return "ok";
    }

    @Override
    public String orderInfoQueryById(Map paramMap) {
        return null;
    }

    @Override
    public String orderCountByUser(Map paramMap) {
        return null;
    }
}
