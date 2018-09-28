package com.huawei.paas.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectldhy {

        ProjectldhyDelegate projectldhyDelegate = new ProjectldhyDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectldhyDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}