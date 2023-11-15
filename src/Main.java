public class Main {
    public static void main(String[] args) {
        int limitBonus = 100; // 1 бонусный рубль
        int onTheAccount = 250; // начальный счет
        int replenishment = 300; // бонусов нет
        int replenishment1 = 1450; // бонусы начисляются
        int bonus;

        if (replenishment < 1000) {
            bonus = (replenishment / limitBonus);
        } else {
            bonus = 0;
        }
        if (replenishment1 >= 1000) {
            bonus = (replenishment1 / limitBonus);

        } else {
            bonus = 0;

        }

        System.out.println("Пополненный счет без начисленных бонусов");
        System.out.println(onTheAccount + replenishment);
        System.out.println("Пополненный счет с начисленными бонусами");
        System.out.println(onTheAccount + replenishment1 + bonus);

    }
}