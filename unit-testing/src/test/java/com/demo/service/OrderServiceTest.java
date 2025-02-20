package com.demo.service;


import com.demo.domain.Order;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    static Order order1;
    static OrderService os1;
    @BeforeClass
    public static void init(){
        order1 = new Order(10,"item 2",20);
        os1 = new OrderService();
    }

    @Test
    public void placeOrder_Test(){
        boolean expected = true;
        boolean actual = os1.placeOrder(order1,"item2");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void placeOrder_Test1(){
        boolean expected = true;
        boolean actual = os1.placeOrder(new Order(12,"item 3",30),"item3");
        Assert.assertEquals(expected,actual);
    }


}
