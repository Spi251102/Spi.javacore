public class Person {
    double cannang;
    double chieucao;
    double BMI;
    public void tinhBMIvoid()
    {
        double BMI = cannang/(chieucao * chieucao);
        System.out.println(BMI);

    }

    public double tinhBMIdouble()
    {
        double BMI = cannang/(chieucao * chieucao);
        return BMI;
    }

    public double tinhBMI(double cannang,double chieucao)
    {
        double BMI = cannang/(chieucao * chieucao);
        return BMI;
    }



}
