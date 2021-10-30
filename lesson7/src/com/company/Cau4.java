package com.company;

public class Cau4 {
    public void cau4()
    {
        String strB = "You only live once but if you do it right once is enough";
        System.out.println("Chuỗi: "+strB);
        int dem = 0;
        System.out.print("Index của kí tụ o là: ");
        for (int i=0;i<strB.length();i++)
            if(strB.charAt(i)=='o')
            {
                dem++;
                System.out.print(i+"\t");
            }
        System.out.println("\nSố lần xuất hiện của kí tự o là: "+ dem);
    }
}
