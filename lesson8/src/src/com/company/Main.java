package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học viên: ");
        int n = sc.nextInt();
        String id[] = new String[n];
        String name[] = new String[n];
        double DLT[] = new double[n];
        double DTH[] = new double[n];
        double DTB[] = new double[n];
        Student student = new Student();
        student.nhap(id,name,DLT,DTH,n);
        student.diemtrungbinh(DTB,DLT,DTH,n);
        student.xuat(id,name,DTB,n);
    }
}
