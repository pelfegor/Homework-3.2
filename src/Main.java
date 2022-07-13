public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 73.5;
        double height = 1.73;
        double bmi = service.BmiCalculator(weight , height);
        System.out.println(bmi);
    }
}
