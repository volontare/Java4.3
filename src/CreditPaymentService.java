public class CreditPaymentService {
        public double calculate(int period) {
            long sum = 1_000_000;
            double rate = 0.0999;
            double rate1 = rate/12;
            double index = rate1 + (rate1/(Math.pow((rate1+1), period)-1));
            double payment = index*sum;
            return payment;
        }
}

