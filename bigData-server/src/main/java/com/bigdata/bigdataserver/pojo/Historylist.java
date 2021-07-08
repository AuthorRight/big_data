/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Historylist {

    private String date;
    private String cn_conNum;
    private String cn_deathNum;
    private String cn_cureNum;
    private String cn_susNum;
    private String cn_econNum;
    private String cn_heconNum;
    private String cn_deathRate;
    private String cn_cureRate;
    private String is_show;
    private String wjw_susNum;
    private String wuhan_conNum;
    private String wuhan_deathNum;
    private String wuhan_cureNum;
    private String wuhan_susNum;
    private String cn_conadd;
    private String cn_jwsrNum;
    private String cn_addjwsrNum;
    private String cn_asymptomNum;

}