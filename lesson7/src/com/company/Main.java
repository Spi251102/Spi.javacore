package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn lợi chọn: ");
        System.out.println("1- Bài tập 1");
        System.out.println("2- Bài tập 2");
        System.out.println("3- Bài tập 3");
        System.out.println("4- Bài tập 4");
        System.out.println("5- Bài tập 5");
        System.out.println("6- Bài tập 6");
        System.out.println("7- Bài tập 7");
        System.out.println("0- Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                Cau1 BT1 = new Cau1();
                BT1.cau1();
                break;

            case 2:
                Cau2 BT2 = new Cau2();
                BT2.chuanhoa();
                BT2.chuoipalindrome();
                break;

            case 3:
                Cau3 BT3 = new Cau3();
                BT3.cau3();
                break;

            case 4:
                Cau4 BT4 = new Cau4();
                BT4.cau4();
                break;

            case 5:
                Cau5 BT5 = new Cau5();
                BT5.cau5();
                break;

            case 6:
                Cau6 BT6 = new Cau6();
                BT6.checkEmail();
                break;

            case 7:
                Cau7 BT7 = new Cau7();
                BT7.cau7();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Không có lựa chọn này.");
                break;
        }
    }
}
