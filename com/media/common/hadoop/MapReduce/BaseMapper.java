package com.media.common.hadoop.MapReduce;

import org.apache.hadoop.mapreduce.Mapper;

/**
 * hadoop 统一基类，后续会重写Mapper相关方法
 * Created by lihaiqiang on 2018/08/23.
 */
public class BaseMapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT> extends Mapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT> {
}
