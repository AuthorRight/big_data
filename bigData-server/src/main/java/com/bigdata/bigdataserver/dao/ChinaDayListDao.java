package com.bigdata.bigdataserver.dao;

import com.bigdata.bigdataserver.vo.ChinaDayList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChinaDayListDao {

    public void insert(ChinaDayList chinaDayList);
}
