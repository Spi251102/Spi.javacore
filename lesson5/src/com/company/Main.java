package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn lợi chọn: ");
        System.out.println("1- Bài tập 1");
        System.out.println("2- Bài tập 2");
        System.out.println("3- Bài tập 3");
        System.out.println("0- Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                bai1();
                break;

            case 2:
                System.out.print("Nhập chuỗi kí tự: ");
                String strA = sc.nextLine();
                System.out.print("Nhập chuỗi kí tự muốn tìm index: ");
                String strB = sc.nextLine();
                bai2(strA,strB);
                break;

            case 3:
                System.out.print("\nNhập chuỗi kí tự: ");
                String strC = sc.nextLine();
                bai3(strC);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này.");
        }
    }
    static void bai1()
    {
        String s1 = "Hello every one";
        int dem = 0;
        System.out.print("Index của kí tự e trong chuỗi \""+s1+"\" lần lượt là: ");
        for (int i =0;i<s1.length();i++)
            if(s1.charAt(i)=='e')
            {
                dem ++;
                System.out.print(i+"\t");
            }
        System.out.println("\nSố lần xuất hiện của kí tự e là: "+ dem);
    }
    static void bai2(String strA, String strB)
    {
        System.out.print("Index của chuỗi \""+strB +"\" trong chuỗi \""+strA+"\" là: ");
        System.out.println(strA.indexOf(strB));
    }
    static void bai3(String strC)
    {

        String[] strD = strC.split(" ");
        int index = 0;
        int lenmax = 0;
        for (int i=0;i<strD.length;i++)
        {
            int length = strD[i].length();
            if(length >lenmax)
            {
                lenmax = length;
                index = i;
            }
        }
        System.out.println("Từ: "+strD[index]+", từ thứ: "+(index+1)+", có độ dài lớn nhất là: "+lenmax);
    }

}
