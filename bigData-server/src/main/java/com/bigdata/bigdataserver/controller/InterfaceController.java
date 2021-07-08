package com.bigdata.bigdataserver.controller;

import com.bigdata.bigdataserver.pojo.Chinatotal;
import com.bigdata.bigdataserver.service.InterfaceService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class InterfaceController {
    @Resource
    InterfaceService interfaceService;

    @RequestMapping("/getData")
    @ResponseBody
    public Chinatotal getData(){
        return interfaceService.queryByChinatotal();
    }

}
