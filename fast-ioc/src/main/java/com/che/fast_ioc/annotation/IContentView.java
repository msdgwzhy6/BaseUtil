package com.che.fast_ioc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface IContentView {
    //默认字段，使用时：@IView(R.id.tv)
    int value();

    //其它字段，使用时：@IView(id=R.id.tv)
//    int id() default 0;
}
