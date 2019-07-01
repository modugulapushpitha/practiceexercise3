package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumCheckTest {
    ConsecutiveNumCheck testobj;
    @Before
    public void setUp(){
        testobj=new ConsecutiveNumCheck();
    }
    @After
    public void turnDown(){
        testobj=null;
    }
    @Test
    public void testConsecutiveInput(){
        String result=testobj.numCheck("54,53,52,51,50");
        assertEquals("consecutive numbers",result);
    }
    @Test
    public void testFailurecase(){
        String result=testobj.numCheck("54,51,52,53,54");
        assertEquals("non consecutive numbers",result);
    }
    @Test
    public void testIntegerArray(){
        String result=testobj.numCheck("54,54,54,54");
        assertEquals("non consecutive numbers",result);
    }
    @Test
    public void testSinleInteger(){
        String result=testobj.numCheck("54");
        assertEquals("there must be atleast two numbers for comparision",result);
    }

}