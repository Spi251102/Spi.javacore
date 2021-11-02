package com.company;
import java.util.Scanner;
public class Cau1 {
    static void nhap(int A[], int n)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.printf("A[%d]= ",i);
            A[i] = sc.nextInt();
        }
    }

    static void xuat(int A[],int n)
    {
        for(int d: A)
            System.out.print(d+"\t");
    }

    static void minmax(int A[],int n)
    {
        int max = A[0];
        int min = A[0];
        for(int i=0;i<n;i++)
            if(min > A[i])
                min = A[i];
        for(int i=0;i<n;i++)
            if(max < A[i])
                max = A[i];
        System.out.println("Giá trị lớn nhất của mảng là: "+max+" và giá trị nhỏ nhất của mảng là: "+min);
    }
}
