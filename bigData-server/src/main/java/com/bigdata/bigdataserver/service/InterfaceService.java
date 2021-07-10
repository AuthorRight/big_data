package com.bigdata.bigdataserver.service;


import com.bigdata.bigdataserver.pojo.Children;
import com.bigdata.bigdataserver.pojo.Chinadaylist;
import com.bigdata.bigdataserver.pojo.Chinatotal;
import com.bigdata.bigdataserver.pojo.Areatree;
import com.bigdata.bigdataserver.vo.Province;

import java.util.List;

/**
 * @Author: QK
 * @Date: 2021/7/8 17:13
 */
public interface InterfaceService {
    //查询全国总的数据
    public Chinatotal queryByChinatotal();

    //查询每天的数据
    public List<Chinadaylist> queryByChinadaylist();

    //查询区域数据
    public List<Areatree> queryByAreatree();

    //查询省份数据
    public List<Children> queryByProvince();
}
