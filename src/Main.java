public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double cps = service.calculate(12, 1_000_000, 9.99);
        System.out.println(cps);

        double twentyFourMonths = service.calculate(24, 1_000_000, 9.99);
        System.out.println(twentyFourMonths);

        double thirtySixMonths = service.calculate(36, 1_000_000, 9.99);
        System.out.println(thirtySixMonths);
    }
}

