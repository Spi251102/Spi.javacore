public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.cannang = 69;
        person1.chieucao = 1.7;

        System.out.println("\n person1 có chỉ số BMI kiểu void là: ");
        person1.tinhBMIvoid();

        System.out.println("\n person1 có chỉ số BMI kiểu double là: "+person1.tinhBMIdouble());

        System.out.println("\n person1 có chỉ số BMI kiểu double và truyền tham số là: "+ person1.tinhBMI(69,1.7));

    }
}
