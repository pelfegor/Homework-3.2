public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 73.5;
        double h = 1.73;
        double bmi = service.calculate(w , h);
        System.out.println(bmi);
    }
}
