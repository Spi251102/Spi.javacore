package com.company;

public class DiemTB {
    double toan,van,ly,hoa,DTB;
    public void DTB(double toan,double van,double ly,double hoa)
    {
        DTB = (toan + van +ly +hoa)/4;
        if(DTB <4.5)
            System.out.println("Hạng yếu");
        else if(DTB < 6.5)
            System.out.println("Hạng trung bình");
        else if(DTB <8)
            System.out.println("Hạng khá");
        else System.out.println("Hạng giỏi");
    }

}
