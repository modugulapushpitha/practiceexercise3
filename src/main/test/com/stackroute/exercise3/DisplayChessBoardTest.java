package com.stackroute.exercise3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayChessBoardTest {
    DisplayChessBoard testobj;
    @Before
    public void setUp(){
        testobj=new DisplayChessBoard();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testGivenInput(){
        String[][] result=testobj.boardDisplay(2,2);
        assertArrayEquals(new String[][]{{"WW","BB"},{"BB","WW"}},result);
    }
    @Test
    public void testFailureInput(){
        String[][] result=testobj.boardDisplay(2,1);
        assertArrayEquals(new String[][]{{"WW","BB"},{"BB","WW"}},result);
    }
    @Test
    public void testZeroInput(){
        String[][] result=testobj.boardDisplay(0,0);
        assertArrayEquals(new String[][]{},result);
    }

}