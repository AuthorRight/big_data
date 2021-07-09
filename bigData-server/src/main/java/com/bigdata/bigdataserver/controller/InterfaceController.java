package com.bigdata.bigdataserver.controller;

import com.bigdata.bigdataserver.pojo.Chinadaylist;
import com.bigdata.bigdataserver.pojo.Chinatotal;
import com.bigdata.bigdataserver.service.ChinaDayListService;
import com.bigdata.bigdataserver.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InterfaceController {
    @Resource
    InterfaceService interfaceService;

    @RequestMapping("/getData")
    @ResponseBody
    public Chinatotal getData(){
        return interfaceService.queryByChinatotal();
    }

    @RequestMapping("/getList")
    @ResponseBody
    public List<Chinadaylist> getList() {
        List<Chinadaylist> chinadaylists = interfaceService.queryByChinadaylist();
        return chinadaylists;
    }
}
