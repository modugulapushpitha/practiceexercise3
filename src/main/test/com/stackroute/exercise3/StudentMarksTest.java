package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks testobj;
    @Before
    public void setUp(){
        testobj=new StudentMarks();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testGivenStudentInfoReturnSuccess(){
        String res=testobj.checkGrades(4,new int[]{40,20,80,99});
        assertEquals("student passed",res);
    }
    @Test
    public void testGivenStudentInfoReturnMsg(){
        String res=testobj.checkGrades(4,new int[]{-1,20,80,100});
        assertEquals("student not passed",res);
    }
    @Test
    public void testGivenStudentInfoFailureMsg(){
        String res=testobj.checkGrades(4,new int[]{-1,-20,1000,0});
        assertEquals("student not passed",res);
    }

}