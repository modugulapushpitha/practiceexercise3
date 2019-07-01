package com.stackroute.exercise3;

public class StudentMarks {
    public String checkGrades(int numOfStudents,int[] stuGrades){
        String output="";
        for(int i=0;i<numOfStudents;i++){
            if(stuGrades[i]>0&&stuGrades[i]<=100){
                output="student passed";
            }
            else{
                output="student not passed";
            }
        }
        return output;
    }

}
/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/
