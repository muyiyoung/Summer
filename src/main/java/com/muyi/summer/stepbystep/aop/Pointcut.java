package com.muyi.summer.stepbystep.aop;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: muyi-macpro
 * @Time: 2018/3/4 下午11:14
 * @Description:
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
