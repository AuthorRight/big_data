/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Add_daily {

    private int addcon;
    private int addsus;
    private int adddeath;
    private int addcure;
    private String wjw_addsus;
    private String addcon_new;
    private String adddeath_new;
    private String addcure_new;
    private String wjw_addsus_new;
    private String addecon_new;
    private String addhecon_new;
    private String addjwsr;
    private String addasymptom;

}