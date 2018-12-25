package com.media.common.hadoop.MapReduce;

import org.apache.hadoop.mapreduce.Reducer;

/**
 * hadoop 统一基类，后续会重写Mapper相关方法
 * Created by lihaiqiang on 2018/08/23.
 */
public class BaseReducer<KEYIN, VALUEIN, KEYOUT, VALUEOUT> extends Reducer<KEYIN, VALUEIN, KEYOUT, VALUEOUT> {
}
