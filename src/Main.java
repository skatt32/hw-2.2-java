public class Main {
    public static void main(String[] args) {

        int bonus = 50; // бонусные рубли

        int onTheAccount = 250; // начальный счет
        int replenishment = 300; // бонусов нет
        int replenishment1 = 450; // бонусы начисляются
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        if (replenishment >400)
            replenishment= replenishment + bonus;
        if (replenishment1 >400)
            replenishment1= replenishment1 + bonus;

        System.out.println("Пополненный счет без начисленных бонусов");
        System.out.println(onTheAccount + replenishment);
        System.out.println("Пополненный счет с начисленными бонусами");
        System.out.println(onTheAccount + replenishment1);
    }
}