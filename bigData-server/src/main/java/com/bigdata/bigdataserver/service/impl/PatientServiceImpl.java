package com.bigdata.bigdataserver.service.impl;

import com.bigdata.bigdataserver.dao.PatientDao;
import com.bigdata.bigdataserver.pojo.Patient;
import com.bigdata.bigdataserver.pojo.ProvinceValue;
import com.bigdata.bigdataserver.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public List<Patient> searchAll() {
        return patientDao.queryAll();
    }

    @Override
    public List<ProvinceValue> addByProvince() {
        return patientDao.countByProvince();
    }


}
