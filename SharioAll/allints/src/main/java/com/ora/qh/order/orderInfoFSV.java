package com.ora.qh.order;

import java.util.Map;

public interface orderInfoFSV {

    public String allOrderInfoQuery(Map paramMap);

    public String orderInfoQueryById(Map paramMap);

    public String orderCountByUser(Map paramMap);

}
