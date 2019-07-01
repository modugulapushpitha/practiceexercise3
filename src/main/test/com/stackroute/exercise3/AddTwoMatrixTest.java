package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatrixTest {
AddTwoMatrix testobj;
@Before
public void setUp(){
    testobj=new AddTwoMatrix();
}
@After
public void tearDown(){
    testobj=null;
}
    @Test
    public void testAddition() {
    int[][] result=testobj.addition(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
    assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},result);

    }
    @Test
    public void testAdditionFailure() {
        int[][] result=testobj.addition(2,2,new int[][]{{1,2},{3,4}},new int[][]{{9,8},{7,6}});
        assertArrayEquals(new int[][]{{10,10},{10,10}},result);

    }
}