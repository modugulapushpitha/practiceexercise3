package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels testobj;
    @Before
    public void setUp(){
        testobj=new RemoveVowels();
    }
    @After
    public void tearDown(){
        testobj=null;
    }

    @Test
    public void removeVowels() {
        String[] result=testobj.removeVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals("String array after removing vowels",new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }
    @Test
    public void testGivenNullInput() {
        String[] result=testobj.removeVowels(new String[]{"India","United States","Germany","Egypt",null});
        assertArrayEquals("null value not allowed",new String[]{"Ind","Untd Stts","Grmny","Egypt",},result);
    }
    @Test
    public void testRemoveVowels() {
        String[] result=testobj.removeVowels(new String[]{"a"});
        assertArrayEquals(new String[]{"a"},result);
    }
    @Test
    public void testRemoveVowelsGivenSingleString() {
        String[] result=testobj.removeVowels(new String[]{"aeiou"});
        assertArrayEquals(new String[]{"a"},result);
    }
}