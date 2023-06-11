// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MonthlyPaymentService service = new MonthlyPaymentService();
        int loan = 1_000_000; // Сумма кредита в рублях
        double percent = 9.99; // Годовая ставка процента
        int term = 12; // Срок кредита в месяцах
        int monthlyPayment = service.calculate (loan, percent, term);

        System.out.println("Ежемесячный платеж составит: ");
        System.out.println((int)monthlyPayment);
    }
}