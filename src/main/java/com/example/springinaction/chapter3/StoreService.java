package com.example.springinaction.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {
    private ShoppingCart shoppingChart;

    // ShoppingChart
    // 每个用户一个
    // 代理会对其进行懒解析
    // 调用委托给会话作用域内的真正的bean
    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingChart = shoppingCart;
    }
}

