/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Worldlist {

    private String name;
    private String value;
    private String susNum;
    private String deathNum;
    private String cureNum;
    private String econNum;

}