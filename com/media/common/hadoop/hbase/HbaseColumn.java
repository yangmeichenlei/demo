package com.media.common.hadoop.hbase;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * Created by lihaiqiang on 2018/08/23.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD })
@Inherited
public @interface HbaseColumn {

    String family() default "";

    String qualifier() default "";

    boolean timestamp() default false;
}
