package com.bigdata.bigdataserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int id;
    private String name;
    private int confirmed;
    private int asymptomatic;
    private int suspect;
    private int severe;
    private int abroad;
    private int cure;
    private int death;

}
