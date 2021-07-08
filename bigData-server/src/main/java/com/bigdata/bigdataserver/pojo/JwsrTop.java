/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwsrTop {

    private String jwsrNum;
    private String name;
    private String ename;
    public void setJwsrNum(String jwsrNum) {
         this.jwsrNum = jwsrNum;
     }

}