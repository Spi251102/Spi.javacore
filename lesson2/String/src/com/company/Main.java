package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        String s = "học lập trình java không khó";

        System.out.println(s);
        System.out.println("Độ dài của chuỗi là: "+s.length());

        System.out.println("\nChuỗi sau khi in hoa tất cả kí tự k là: ");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='k')
                System.out.print("K");
            else System.out.print(s.charAt(i));
        }

        System.out.println("\n\nChuỗi sau khi in hoa tất cả kí tự k là: ");
        System.out.println(s.replace('k','K'));

        System.out.println("\n\nIndex của ký tự j trong chuỗi là:"+s.indexOf('j'));

        Weekdays monday = Weekdays.Monday;
        System.out.println("\nThứ 2: "+monday);
    }

}