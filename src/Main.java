public class Main {
    public static void main(String[] args) {

        int amount = 600; // начальная сумма
        int deposit = 1500; // сумма пополнения
        int cashback = 100; // на какую сумму будет начисляться 1 бонусный рубль

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / cashback;
        } else {
            bonus = 0;
        }
        int total = amount + deposit + bonus; // итоговая сумма на счете после пополнения

        System.out.println(deposit + " Сумма пополнения");
        System.out.println(total + " Всего средств на счете");
        System.out.println(bonus + " Бонусов начислено");
    }
}