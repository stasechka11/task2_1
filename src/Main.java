public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; // Стоимость авиа билета в рублях
        int oneMilePrice = 20; // Количество рублей для начисления одной бонусной мили

        int milesCount = ticketPrice / oneMilePrice;

        System.out.println(milesCount);
    }
}
