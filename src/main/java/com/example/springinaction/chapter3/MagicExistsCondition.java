package com.example.springinaction.chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {


    @Override
    public boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata) {
        //ConditionContext
        //getRegistry() 返回的检查bean
        //getBeanFactory() 返回检查bean是否存在
        //getEnvironment() 检查环境变量

        Environment env = ctxt.getEnvironment();

        // 如果返回true 就会创建带有@Conditional注解的bean
        return env.containsProperty("magic");

    }
}
