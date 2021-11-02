package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Cau1 BT1 = new Cau1();
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        BT1.nhap(A,n);
        BT1.xuat(A,n);
        System.out.println();
        BT1.minmax(A,n);

        Cau2 BT2 = new Cau2();
        String MS[] = new String[n];
        String tenPT[] = new String[n];
        int vmax[]  = new int[n];
        BT2.nhap(MS,tenPT,vmax,n);
        BT2.xuat(MS,tenPT,vmax,n);
    }
}