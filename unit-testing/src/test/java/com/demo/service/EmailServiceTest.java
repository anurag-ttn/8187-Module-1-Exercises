package com.demo.service;


import com.demo.domain.Order;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class EmailServiceTest {
    static Order order1;
    @BeforeClass
    static public void init(){
        order1 = new Order(4,"rice",30);
    }


    @Test
    public void sendEmail_Test(){
        boolean actual = new EmailService().sendEmail(order1 , "string 1");
        boolean expecetd = true;
        Assert.assertEquals(expecetd,actual);
    }

    @Test(expected = RuntimeException.class)
    public void sendEmail2_Test(){
            new EmailService().sendEmail(order1);
    }

}