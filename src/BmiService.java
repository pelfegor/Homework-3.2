public class BmiService {

    public double BmiCalculator(double w, double h) {
        double bmi = w / (h * h);

        return bmi;
    }
}
