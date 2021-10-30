package com.company;

public class Cau3 {
    public void cau3()
    {
        int tongsonguyento = 0;
        int snt =2;
        System.out.print("10 so nguyen to dau tien la: ");
        while ( tongsonguyento < 10)
        {
            int temp = snt;
            for (int i=2;i<=Math.sqrt(snt);i++)
            {
                if(snt%i == 0)
                {
                    snt++;
                    continue;
                }
            }
            if( temp == snt)
            {
                System.out.print(snt+"\t");
                snt ++;
                tongsonguyento ++;
            }
        }

        System.out.println();
        snt =2;
        System.out.print("Các số nguyên tố bé hơn 10 là: ");
        while ( snt < 10)
        {
            int temp = snt;
            for (int i=2;i<=Math.sqrt(snt);i++)
            {
                if(snt%i == 0)
                {
                    snt++;
                    continue;
                }
            }
            if( temp == snt)
            {
                System.out.print(snt+"\t");
                snt ++;
            }
        }
    }
}
