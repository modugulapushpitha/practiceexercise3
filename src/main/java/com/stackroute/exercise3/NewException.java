package com.stackroute.exercise3;

public class NewException {
    public static void main(String[] args){
        try{
            throw new Exception("New Exception found");
        }
        catch (Exception e){
            System.out.println("New exception catched");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
