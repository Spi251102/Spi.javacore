package com.company;
import java.util.Random;
public class Cau5 {
    public void cau5()
    {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("Số ngẫu nhiên từ 0 đến 99: "+num);
        int uoc=0;
        if(num<2)
            System.out.println("Số "+ num +" không phải là số nguyên tố");
        else
        {
            for (int i=2;i<=Math.sqrt(num);i++)
                if(num%i==0)
                    uoc ++;
            if(uoc == 0)
                System.out.println("Số "+ num +" là số nguyên tố");
            else System.out.println("Số "+ num +" không phải là số nguyên tố");
        }
    }
}
