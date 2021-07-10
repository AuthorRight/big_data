package com.bigdata.bigdataserver.service.impl;

import com.bigdata.bigdataserver.dao.JwsrTopDao;
import com.bigdata.bigdataserver.service.JwsrTopService;
import com.bigdata.bigdataserver.vo.JwsrTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JwsrTopServiceImpl implements JwsrTopService {

    @Autowired
    JwsrTopDao jwsrTopDao;

    @Override
    public void insert(JwsrTop jwsrTop) {
        jwsrTopDao.insert(jwsrTop);
    }
}
