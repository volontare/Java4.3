public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        double payment1 = payment.calculate(12);
        System.out.println(payment1);

        double payment2 = payment.calculate(24);
        System.out.println(payment2);

        double payment3 = payment.calculate(36);
        System.out.println(payment3);
    }
}
