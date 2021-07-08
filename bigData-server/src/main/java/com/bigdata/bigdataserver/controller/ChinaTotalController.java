package com.bigdata.bigdataserver.controller;


import com.bigdata.bigdataserver.pojo.Chinatotal;
import com.bigdata.bigdataserver.service.ChinaTotalService;
import com.bigdata.bigdataserver.service.InterfaceService;
import com.bigdata.bigdataserver.vo.ChinaTotal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: QK
 * @Date: 2021/7/8 17:28
 */
@Controller
public class ChinaTotalController {
    @Resource
    ChinaTotalService chinaTotalService;
    @Resource
    InterfaceService interfaceService;

    @RequestMapping("/getchinaTotal")
    @ResponseBody
    public ChinaTotal getChinaTotal(){
        Chinatotal china =interfaceService.queryByChinatotal();
        ChinaTotal chinaTotal =new ChinaTotal();
        chinaTotal.setId(0);
        chinaTotal.setTodayConfirm(china.getToday().getConfirm());
        chinaTotal.setTodaySuspect(china.getToday().getSuspect());
        chinaTotalService.insert(chinaTotal);
        return chinaTotal;
    }
}
