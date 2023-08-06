public class Main {
    public static void main(String[] args) {
        int initialScore = 100; //Исходный счет
        int replenishmentAmount = 1100; //Сумма пополнения
        int bonusAmount = replenishmentAmount / 100; //Количество бонусов
        int finalScore = replenishmentAmount + initialScore + bonusAmount;

        if (replenishmentAmount >= 1000) { bonusAmount = replenishmentAmount / 100;
            System.out.println("Бонусы =" + bonusAmount);
        } else {
            bonusAmount = 0;
            finalScore = replenishmentAmount + initialScore;
        }
        System.out.println("Исходный счет =" + initialScore);
        System.out.println("Сумма пополнения =" + replenishmentAmount);
        System.out.println("Итоговый счет =" + finalScore);
    }
}