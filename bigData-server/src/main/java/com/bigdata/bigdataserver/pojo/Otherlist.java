/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Otherlist {

    private String conNum;
    private String susNum;
    private String cureNum;
    private String deathNum;
    private String conadd;
    private String susadd;
    private String cureadd;
    private String deathadd;
    private String econNum;
    private String name;
    private String citycode;
    private String value;
    private int is_show_entrance;
    private int is_show_map;
}