package com.mfzhang.component.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 自定义注解-自定义衣服限定器,
 * 元注解是@Qualifier
 *
 * @author mingfei.zhang
 * @date 2016年9月16日-上午9:47:26
 */
@Target(value={ElementType.FIELD,ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface AbcClothesQualifier {

}
