package com.bigdata.bigdataserver.service.impl;

import com.bigdata.bigdataserver.dao.ChinaTotalDao;

import com.bigdata.bigdataserver.service.ChinaTotalService;
import com.bigdata.bigdataserver.vo.ChinaTotal;


import javax.annotation.Resource;

/**
 * @Author: QK
 * @Date: 2021/7/8 17:11
 */
public class ChinaTotalServiceImpl implements ChinaTotalService {
    @Resource
    ChinaTotalDao chinaTotalDao;

    @Override
    public void insert(ChinaTotal chinaTotal) {

    }
}
