package com.bigdata.bigdataserver.dao;

import com.bigdata.bigdataserver.pojo.Patient;
import com.bigdata.bigdataserver.pojo.ProvinceValue;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PatientDao {

    //查询全部病例
    List<Patient> queryAll();

    //按省份查询
    List<ProvinceValue> countByProvince();

}
