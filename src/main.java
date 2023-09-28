public class main {
    // За каждые 20 рублей,потраченные на билет,начисляется 1 миля.Дробные мили не начисляются.

    public static void main(String[] args) {

        int ticketPrice = 2648; // Цена билета.
        int perMiles = 20; // Количество рублей за 1 милю.

        int bonusMiles = ticketPrice / perMiles; // Формула расчета бонусных миль.

        System.out.println("Начислено:" + bonusMiles + "Бонусных миль");
    }
}
