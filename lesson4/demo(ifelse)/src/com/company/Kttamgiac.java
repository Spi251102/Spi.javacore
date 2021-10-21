package com.company;

public class Kttamgiac {
    double a;
    double b;
    double c;

    public void bacanhtamgiac(double a,double b,double c)
    {
        if(a<0||b<0||c<0)
        {
            System.out.println("a,b va c khong phai 3 canh cua 1 tam giac! ");
        }

        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("a,b va c la 3 canh cua 1 tam giac! ");
        }
        else
            System.out.println("a,b va c khong phai 3 canh cua 1 tam giac! ");
    }
}
