public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightInM = 1.87;
        int Bmi = service.calculate(weightKg, heightInM);
        System.out.println("Индекс массы тела=" + Bmi);
    }
}


