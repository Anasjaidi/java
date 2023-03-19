package com.love.sboot.models;
@lombok.Data
public class Data {
    private String name;
    private Integer age;

    private String[] todos;

    public Data() {
        todos = new String[100];
    }
//    private Data data;
}
