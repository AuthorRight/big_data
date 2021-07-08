package com.bigdata.bigdataserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import com.bigdata.bigdataserver.pojo.Chinatotal;
import com.bigdata.bigdataserver.service.InterfaceService;
import com.bigdata.bigdataserver.vo.ChinaTotal;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.xml.ws.spi.http.HttpHandler;

/**
 * @Author: QK
 * @Date: 2021/7/8 17:17
 */
@Service
public class InterfaceServiceImpl implements InterfaceService {
    @Resource
    RestTemplate restTemplate;

    @Override
    public Chinatotal queryByChinatotal() {
        String jsonString =this.getJSONString();
        Integer code =(Integer) JSONPath.read(jsonString,"$.code");
        if(code == 10000){
            JSONObject chinatotalJO =(JSONObject)JSONPath.read(jsonString,"$.data.chinaTotal");
            Chinatotal chinatotal = JSON.parseObject(chinatotalJO.toString(), Chinatotal.class);
            return  chinatotal;
        }
        return  null;
    }



    private String getJSONString(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-sgent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity <Resource> httpEntity =new HttpEntity<>(headers);
        String url ="https://c.m.163.com/ug/api/wuhan/app/data/list-total";
        String jsonString =restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class).getBody();
        return  jsonString;
    }
}
