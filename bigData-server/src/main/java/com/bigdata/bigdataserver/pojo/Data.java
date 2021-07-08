/**
  * Copyright 2021 bejson.com 
  */
package com.bigdata.bigdataserver.pojo;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Data {

    private String times;
    private Date mtime;
    private Date cachetime;
    private String gntotal;
    private String deathtotal;
    private String sustotal;
    private String curetotal;
    private String econNum;
    private String heconNum;
    private String asymptomNum;
    private String jwsrNum;
    private Add_daily add_daily;
    private List<JwsrTop> jwsrTop;
    private List<List> list;
    private Othertotal othertotal;
    private List<Otherlist> otherlist;
    private List<Otherhistorylist> otherhistorylist;
    private List<Historylist> historylist;
    private List<Worldlist> worldlist;
    private CaseClearCityInfo caseClearCityInfo;

}