package com.springframework.stereotype;

import java.lang.annotation.*;

/**
 * Created by shenyiwei on 2019/4/16.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}
