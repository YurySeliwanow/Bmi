public class BmiService {
    public int calculate(int weightKg, double heightInM) {
        return (int) (weightKg / heightInM / heightInM);
    }
}
