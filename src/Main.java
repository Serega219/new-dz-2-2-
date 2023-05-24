public class Main {
    public static void main(String[] args) {
        int startamount = 1000; // начальная сумма на счету
        int debitamount = 5000; // сумма пополнения

        int points; // количество бонусных рублей
        if (debitamount > 1000) { // проверяем, что сумма пополнения больше тысячи
            points = (debitamount / 100) * 1; // вычисляем бонус как один процент от количества полных ста рублей
        } else {
            points = 0; // иначе бонус равен нулю
            System.out.println("сумма пополнения меньше тысячи"); // выводим сообщение
        }
        startamount += debitamount + points; // прибавляем к начальной сумме сумму пополнения и бонус
        System.out.println("итоговая сумма на счету: " + startamount); // выводим итоговую сумму
        System.out.println("количество бонусных рублей.: " + points); // выводим количество бонусных рублей
    }
}