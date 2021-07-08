package com.bigdata.bigdataserver;

import com.bigdata.bigdataserver.dao.PatientDao;
import com.bigdata.bigdataserver.pojo.Patient;
import com.bigdata.bigdataserver.pojo.ProvinceValue;
import com.bigdata.bigdataserver.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BigDataServerApplicationTests {

    @Autowired
    PatientDao patientDao;

    @Test
    public void testDao() {
        List<Patient> patientList = patientDao.queryAll();
        System.out.println(patientList);
    }

    @Test
    public void testByProvince() {
        List<ProvinceValue> provinceValueList = patientDao.countByProvince();
        System.out.println(provinceValueList);
    }

    @Autowired
    PatientService patientService;

    @Test
    public void testService() {
        List<Patient> patientList = patientService.searchAll();
        System.out.println(patientList);
    }

}
