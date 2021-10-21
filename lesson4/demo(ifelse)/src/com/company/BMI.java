package com.company;

public class BMI {
        double weight;
        double height;
        double BMI;

        public void BMI(double weight,double height)
        {
            double BMI = weight/Math.pow(height,2);
            if(BMI < 18.5)
                System.out.println("Gầy");
            else if(BMI<24.9)
                System.out.println("Bình thường");
            else if(BMI <29.9)
                System.out.println("Hơi béo");
            else System.out.println("Béo phì");

        }


}
