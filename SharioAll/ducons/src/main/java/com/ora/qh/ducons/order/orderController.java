package com.ora.qh.ducons.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ora.qh.order.orderInfoFSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/order")
public class orderController {

    private static final Logger log = LoggerFactory.getLogger(orderController.class);

    @Reference
    private orderInfoFSV ordersv;

    @RequestMapping("/orderInfo")
    private String getOrderInfo(){

        String result = ordersv.allOrderInfoQuery(new HashMap());
        log.info("调用结果测试："+result);
        return null;
    }


}
