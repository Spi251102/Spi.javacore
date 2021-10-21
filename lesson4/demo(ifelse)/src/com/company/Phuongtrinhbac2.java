package com.company;

public class Phuongtrinhbac2 {
    double a,b,c;
    public void ptb2(double a,double b,double c)
    {
        if(a==0)
        {
            if(b!=0)
            {
                System.out.printf("Phuong trinh co nghiem duy nhat x=-c/b= %.2f",-c/b);
            }
            else
            {
                if(c==0)
                    System.out.println("Phuong trinh dung voi moi gia tri cua x");

                else System.out.println("Phuong trinh vo nghiem");
            }
        }
        else
        {
            double denta=Math.pow(b,2)-4*a*c;
            if (denta>0)
            {
                double x1=(-b+Math.sqrt(denta))/(2*a);
                double x2=(-b-Math.sqrt(denta))/(2*a);
                System.out.printf("Phuong trinh bac 2 co 2 nghiem phan biet x1 va x2 lan luot: %.2f và %.2f \n",x1,x2);
            }
            else if(denta==0)
            {
                double x=-b/2*a;
                System.out.printf("Phuong trinh bac 2 co nghiem kep x= %.2f \n",x);
            }
            else System.out.println("Phuong trinh vo nghiem");
        }
    }
}
