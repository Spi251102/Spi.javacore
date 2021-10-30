package com.company;
import java.util.Scanner;
import java.util.Locale;

public class Cau2 {
    Scanner sc = new Scanner(System.in);
    public void chuanhoa()
    {

        //Chuẩn hóa sâu kí tự
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        name = name.trim().toLowerCase(Locale.ROOT);
        name = name.replaceAll("\\s+"," ");
        String[] temp = name.split(" ");
        name = "";
        for(int i=0;i< temp.length;i++)
        {
            name = name + String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                name = name + " ";
        }
        System.out.println(name);
    }

    public void chuoipalindrome()
    {
        //Kiểm tra chuỗi bất kì có phải chuỗi palindrome không
        System.out.print("Nhập chuỗi palindrome? : ");
        String strA = sc.nextLine();
        int palindrome=0;
        strA = strA.trim();
        for (int i=0;i<strA.length();i++)
            if(strA.charAt(i)!=strA.charAt(strA.length()-1-i))
                palindrome ++;
        if(palindrome == 0)
            System.out.println("Chuỗi vừa nhập là chuỗi palindrome");
        else System.out.println("Chuỗi vừa nhập không phải là chuỗi palindrome");
    }
}
