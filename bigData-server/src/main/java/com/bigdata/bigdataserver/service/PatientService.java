package com.bigdata.bigdataserver.service;

import com.bigdata.bigdataserver.pojo.Patient;
import com.bigdata.bigdataserver.pojo.ProvinceValue;

import java.util.List;

public interface PatientService {

    List<Patient> searchAll();

    List<ProvinceValue> addByProvince();

}
