
package com.stackroute.exercise3;

public class ConsecutiveNumCheck {
    public String numCheck(String input){
        String output=null;
        String[] array=input.split(",");
        if(array.length>2) {
            for (int i = 0; i < array.length - 1; i++) {
                if (Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]) == 1 || Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]) == -1) {
                    output = "consecutive numbers";
                } else {
                    output = "non consecutive numbers";
                    break;
                }
            }
        }
        else {
            output="there must be atleast two numbers for comparision";
        }
        return output;

    }
}