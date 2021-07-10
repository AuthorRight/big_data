package com.bigdata.bigdataserver.dao;

import com.bigdata.bigdataserver.vo.JwsrTop;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JwsrTopDao {

    public void insert(JwsrTop jwsrTop);
}
