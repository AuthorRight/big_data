package com.bigdata.bigdataserver.controller;

import com.bigdata.bigdataserver.pojo.Patient;
import com.bigdata.bigdataserver.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping("/searchAll")
    @ResponseBody
    public List<Patient> searchAll() {
        List<Patient> patientList = patientService.searchAll();
        return patientList;
    }


}
