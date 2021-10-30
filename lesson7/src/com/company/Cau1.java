package com.company;
import java.util.Scanner;
public class Cau1 {

    public void cau1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
                if(j<=i)
                    System.out.print("*\t");
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++) {
                if (n % 2 != 0 && j == (n + 1) / 2)
                    System.out.print("*");
                else if (n % 2 == 0)
                    System.out.println();
            }
            System.out.println();
        }

        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
