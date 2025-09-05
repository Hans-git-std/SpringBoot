package org.hans.hanspr1.entity;

import jakarta.annotation.sql.DataSourceDefinition;

import java.util.List;
//@Data
public class Student {
    private int roll;
    private String name;
    private List<Teacher> subject;
}
