package com.company;
import java.util.Scanner;
public class Main {

    public static  void main(String[] args)
    {
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
                Kttamgiac BT1 = new Kttamgiac();
                System.out.println("Nhập 3 cạnh tam giác: ");
                System.out.print("a= ");
                BT1.a = sc.nextInt();
                System.out.print("b= ");
                BT1.b = sc.nextInt();
                System.out.print("c= ");
                BT1.c = sc.nextInt();
                BT1.bacanhtamgiac(BT1.a, BT1.b, BT1.c);
                break;
            case 2:
                DiemTB BT2 = new DiemTB();
                System.out.println("\nNhập điểm các môn: ");
                System.out.print("Toán: ");
                BT2.toan = sc.nextDouble();
                System.out.print("Văn: ");
                BT2.van = sc.nextDouble();
                System.out.print("Lý: ");
                BT2.ly = sc.nextDouble();
                System.out.print("Hóa: ");
                BT2.hoa = sc.nextDouble();
                BT2.DTB(BT2.toan, BT2.van, BT2.ly, BT2.hoa);
                break;
            case 3:
                Phuongtrinhbac2 BT3 = new Phuongtrinhbac2();
                System.out.println("\nNhập hệ số a,b và c:");
                System.out.print("a= ");
                BT3.a = sc.nextDouble();
                System.out.print("b= ");
                BT3.b = sc.nextDouble();
                System.out.print("c= ");
                BT3.c = sc.nextDouble();
                System.out.println("Ta có phương trình bậc 2:");
                System.out.printf("%.2f*x^2 + %.2f*x + %.2f = 0\n",BT3.a,BT3.b,BT3.c);
                BT3.ptb2(BT3.a, BT3.b, BT3.c);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này.");
        }







    }
}
