public class BmiService {

    public double BmiCalculator(double weight, double height) {
        double bmi = weight / (height * height);

        return bmi;
    }
}
