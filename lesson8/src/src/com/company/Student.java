package com.company;
import java.util.Scanner;
public class Student {
    static void nhap(String id[], String name[],double DLT[],double DTH[],int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            System.out.println("\nHọc viên "+(1+i));
            System.out.print("Nhập ID: ");
            id[i] = sc.nextLine();
            System.out.print("Nhập tên học viên: ");
            name[i] = sc.nextLine();
            System.out.print("Nhập điểm lý thuyết: ");
            DLT[i] = sc.nextDouble();
            System.out.print("Nhập điểm thực hành: ");
            DTH[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    static void xuat(String id[], String name[],double DTB[],int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.println("Học viên "+(i+1)+": "+name[i]+" có ID: "+id[i]+" có điểm trung bình là: "+ DTB[i]);
        }
    }

    static void diemtrungbinh(double DTB[],double DLT[],double DTH[],int n)
    {
        for (int i=0;i<n;i++)
        {
            DTB[i] = (DLT[i] + DTH[i])/2;
        }
    }
}
