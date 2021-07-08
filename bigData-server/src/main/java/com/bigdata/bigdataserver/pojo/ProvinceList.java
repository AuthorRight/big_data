/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProvinceList {

    private String name;
    private String ename;
    private String value;
    private String conadd;
    private String hejian;
    private String econNum;
    private String susNum;
    private String deathNum;
    private String asymptomNum;
    private String cureNum;
    private String zerodays;
    private String jwsr;
    private String jwsrNum;
    private String showCurData;
    private Adddaily adddaily;
    private List<City> city;

}