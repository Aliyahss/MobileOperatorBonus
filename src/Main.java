public class Main {
    public static void main(String[] args) {
        int initialScore = 250; //Исходный счет
        int replenishmentAmount = 1700; //Сумма пополнения
        int bonusAmount = replenishmentAmount / 100; //Количество бонусов
        int finalScore = replenishmentAmount + initialScore + bonusAmount; //Итоговый счет
        if (replenishmentAmount > 1000) {
            System.out.println("Бонусы =" + bonusAmount);
        }
        System.out.println("Исходный счет =" + initialScore);
        System.out.println("Сумма пополнения =" + replenishmentAmount);
        System.out.println("Итоговый счет =" + finalScore);
    }
}