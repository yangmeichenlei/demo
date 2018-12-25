package com.media.test.hbase.model;

import com.media.common.hadoop.hbase.HbaseColumn;
import com.media.common.hadoop.hbase.HbaseTable;

@HbaseTable(tableName="user")
public class Demo {

    @HbaseColumn(family="rowkey", qualifier="rowkey")
    private String id;

    @HbaseColumn(family="info", qualifier="name")
    private String name;
    
    @HbaseColumn(family="info", qualifier="age")
    private String age;

    @HbaseColumn(family="info", qualifier="sex")
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
