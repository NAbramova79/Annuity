public class MonthlyPaymentService {
    public int calculate(int loan, double percent, int term) {
        double x = percent / (100 * 12); // месячная ставка процента
        double y = 1 / Math.pow((1 + x), term); // возведение в отрицательную степень
        double z = x / (1 - y);
        int result;
        result = (int) ((int) loan * z);
        return result;
    }
}
