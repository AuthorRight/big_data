package com.bigdata.bigdataserver;

import com.bigdata.bigdataserver.dao.ChinaTotalDao;
import com.bigdata.bigdataserver.vo.ChinaTotal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BigDataServerApplicationTests {


    @Autowired
    ChinaTotalDao chinaTotalDao;

    @Test
    public void testDao() {
        ChinaTotal chinaTotal = new ChinaTotal();
        chinaTotal.setTodayConfirm(5);
        chinaTotal.setTodaySuspect(6);
        chinaTotalDao.insert1(chinaTotal);
    }

}
