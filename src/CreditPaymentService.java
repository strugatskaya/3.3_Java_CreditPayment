public class CreditPaymentService {

    public double calculate(int months, int loanAmount, double interestRate) {

        double cps = loanAmount * ((interestRate / 100 / months) + ((interestRate / 100 / months) / (((Math.pow(1 + (interestRate / 100 / months), months)) - 1))));
        return cps;

    }

}