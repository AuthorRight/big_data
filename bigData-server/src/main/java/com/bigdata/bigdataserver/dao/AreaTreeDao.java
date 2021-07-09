package com.bigdata.bigdataserver.dao;

import com.bigdata.bigdataserver.vo.AreaTree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaTreeDao {
    public void insert(AreaTree areaTree);
}
