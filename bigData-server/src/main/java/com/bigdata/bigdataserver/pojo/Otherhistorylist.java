/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Otherhistorylist {

    private String certain;
    private String uncertain;
    private String die;
    private String recure;
    private String certain_inc;
    private String uncertain_inc;
    private String die_inc;
    private String recure_inc;
    private Date date;

}