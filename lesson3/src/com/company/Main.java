package com.company;
import java.util.Random;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("Số ngẫu nhiên từ 0 đến 99: "+num);
        String  chanle = num%2==0?"chẵn":"lẻ";
        System.out.printf("%d là số %s",num,chanle);

        int a=3;
        int b=4;
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("\n\nCạnh huyền của tam giác vuông có 2 cạnh góc vuông lần lượt là %d và %d = %.2f",a,b,c);

        System.out.println("\n\nNhập x và y: ");
        System.out.print("x= ");
        int x = sc.nextInt();
        System.out.print("y= ");
        int y = sc.nextInt();
        System.out.printf("Tổng %d + %d = %d",x,y,x+y);
        System.out.printf("\nHiệu %d - %d = %d",x,y,x-y);
        System.out.printf("\nTích %d*%d = %d",x,y,x*y);
        double t = (double) x/y;
        System.out.printf("\nThương %d/%d = %.2f",x,y,t);

    }
}
