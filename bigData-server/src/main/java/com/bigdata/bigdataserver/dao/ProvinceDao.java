package com.bigdata.bigdataserver.dao;

import com.bigdata.bigdataserver.vo.Province;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProvinceDao {
    public void insert(Province province);
}