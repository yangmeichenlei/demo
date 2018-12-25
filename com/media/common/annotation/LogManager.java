package com.media.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogManager {

    String content() default "";
    /**
     * 操作类型（默认操作为传入参数是一个数据对象，如果为装有数组的对象一般为批量删除则输入delete）
     * @return
     */
    String type() default "";
    String tableName() default "";//表名字
    String pkName() default "";//表中的主键名字
    /**
     * 传入参数中如果是对象那么为传入对象的逐渐id（针对新增，修改，单个删除）
     * 如果是传入一个装有数据的id列表对象，那么为列表字段名
     * @return
     */
    String classIdName() default "";//参数Id名字
}
