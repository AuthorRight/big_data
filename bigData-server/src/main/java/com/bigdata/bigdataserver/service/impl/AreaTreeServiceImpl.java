package com.bigdata.bigdataserver.service.impl;

import com.bigdata.bigdataserver.dao.AreaTreeDao;
import com.bigdata.bigdataserver.service.AreaTreeService;
import com.bigdata.bigdataserver.vo.AreaTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaTreeServiceImpl implements AreaTreeService {

    @Autowired
    AreaTreeDao areaTreeDao;

    @Override
    public void insert(AreaTree areaTree) {
        areaTreeDao.insert(areaTree);
    }
}
