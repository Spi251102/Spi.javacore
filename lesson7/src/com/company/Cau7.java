package com.company;
import java.util.Scanner;

public class Cau7 {

    static void cau7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số dòng: ");
        int col = sc.nextInt();
        int A[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print("A["+i+"]["+j+"]= ");
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        if(row != col)
            System.out.println("Đây không phải ma trận vuông nên không có đường chéo chính");
        else
        {
            int tong_duong_cheo_chinh = 0;
            for(int i=0;i<row;i++)
                tong_duong_cheo_chinh = tong_duong_cheo_chinh + A[i][i];
            System.out.println("Tổng đường chéo chính = "+tong_duong_cheo_chinh);
        }
    }
}
