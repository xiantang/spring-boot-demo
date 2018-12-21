package com.example.springinaction.chapter3;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
// web应用中每一个会话创建一个ShoppingCart
// 在当前会话中这个bean 相当于单例
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
// ScopedProxyMode 实现了ShoppingChart接口
// 将调用委托实现给bean
public class ShoppingCart {
}
