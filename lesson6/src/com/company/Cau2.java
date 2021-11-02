package com.company;
import java.util.Scanner;
public class Cau2 {

    static void nhap(String MS[], String tenPT[],int vmax[], int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            System.out.printf("Nhập mã số xe %d: ",i+1);
            MS[i] = sc.nextLine();
            System.out.printf("Nhập tên xe %d:",i+1);
            tenPT[i] = sc.nextLine();
            System.out.printf("Nhập vận tốc tối đa: ");
            vmax[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static void xuat(String MS[], String tenPT[],int vmax[], int n)
    {
        System.out.println("Thông tin xe: ");
        System.out.println("======================================================");
        System.out.println("|STT  |Mã số xe  |Tên xe              |Vận tốc tối đa|");
        for (int i=0;i<n;i++)
        {
            System.out.printf("\n|%-5d|%-10s|%-20s|%-14d|",(i+1),MS[i],tenPT[i],vmax[i]);
        }
        System.out.println("\n======================================================");

    }
}
