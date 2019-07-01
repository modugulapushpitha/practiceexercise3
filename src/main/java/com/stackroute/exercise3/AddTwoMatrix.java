package com.stackroute.exercise3;

public class AddTwoMatrix {
    public int[][] addition(int rows, int colums, int a[][], int b[][]) {
        int[][] sum= new int[rows][colums];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < colums; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

}
