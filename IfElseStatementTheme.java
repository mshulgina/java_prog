public class IfElseStatementTheme {
    public static void main (String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык");
        int age = 47;
        String male = "мужской";
        String female = "женский";
        String gender = male;
        double height = 1.20;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }
        if (gender == male) {
            System.out.println("Пол: " + male);
        } else {
            System.out.println("Пол: " + female);
        }
        if (height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }
        String name = "Вика";
        String firstName = String.valueOf(name.charAt(0));
        if (firstName.equals("А")) {
            System.out.println("Имя начинается на А");
        } else if (firstName.equals("В")) {
            System.out.println("Имя начинается на В");
        } else {
            System.out.println("Имя начинается не на А и не на В");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 6;
        int num2 = 6;
        System.out.println("Исходные значения: " + num1 + " и " + num2);
        if (num1 > num2) {
            System.out.println(num1 + " - максимальное число; " + num2 + " - минимальное значение");
        } else if (num2 > num1) {
            System.out.println(num2 + " - максимальное число; " + num1 + " - минимальное значение");
        } else if (num1 == num2) {
            System.out.println("Исходные значения равны");
        }

        System.out.println("\n3. Работа с числом");
        int number = -1;
        System.out.println("Исходное число: " + number);
        if (number == 0) {
            try {
            } finally {
            }
        } else if ((number % 2) == 0) {
            System.out.println("Число " + number + " четное ");
        } else if ((number % 1) == 0) {
            System.out.println("Число " + number + " нечетное ");
        }
        if (number < 0) {
            System.out.println("Число " + number + " отрицательное ");
        } else if (number > 0) {
            System.out.println("Число " + number + " положительное");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 443;
        int number2 = 123;
        int one1, hundred1, ten1, one2, ten2, hundred2;
        one1 = number1 % 10;
        ten1 = number1 / 100;
        hundred1 = number1 / 10 % 10;
        one2 = number2 % 10;
        ten2 = number2 / 10 % 10;
        hundred2 = number2 / 100;
        System.out.println("Исходные числа: " + number1 + " и " + number2);
        if (one1 == one2) {
            System.out.println("Числа содержат одинаковые единицы: " + one1);
        }
        if (hundred1 == ten2) {
            System.out.println("Числа содержат одинаковые десятки: " + hundred1);
        } if (ten1 == hundred2) {
            System.out.println("Числа содержат одинаковые сотни: " + ten1);
        }
        
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char cod = '\u0057';
        System.out.println("Переменная char" + cod + ". Десятичный код: " + (int) cod + ", Знак ASCII: " + (char) cod);
        if ((int) cod >= 48 & (int) cod <= 57) {
            System.out.println((char) cod + " - цифра");
        } else if ((int) cod >= 65 & (int) cod <= 90) {
            System.out.println((char) cod + " - большая буква");
        } else if ((int) cod >= 97 & (int) cod <= 122) {
            System.out.println((char) cod + " - маленькая буква");
        } else {
            System.out.println((char) cod + " - не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int sum = 310000;
        double percent;
        double accrual;
        double sum_after;
        if (sum < 100000) {
            percent = 5.0;
        } else if (sum >= 100000 & sum <= 300000) {
            percent = 7.0;
        } else {
            percent = 10.0;
        }
        accrual = sum * percent / 100;
        sum_after = sum + accrual;
        System.out.println("Сумма вклада " + sum + " рублей");
        System.out.println("Начисленный процент  " + accrual + " рублей");
        System.out.println("Итоговая сумма с " + percent + " % равна " + sum_after + " рублей");

        System.out.println("\n7. Определение оценки по предметам");
        int proc_hist = 59;
        int proc_prog = 91;
        int result1;
        int result2;
        int average_result;
        int average_proc;
        if (proc_hist <= 60) {
            result1 = 2;
        } else if (proc_hist > 60 & proc_hist <= 72) {
            result1 = 3;
        } else if (proc_hist > 73 & proc_hist <= 90) {
            result1 = 4;
        } else {
            result1 = 5;
        }
        System.out.println (result1 + " - история");
        if (proc_prog <= 60) {
            result2 = 2;
        } else if (proc_hist > 60 & proc_hist <= 72) {
            result2 = 3;
        } else if (proc_hist > 73 & proc_hist <= 90) {
            result2 = 4;
        } else {
            result2 = 5;
        }
        System.out.println (result2 + " - программирование");
        average_result = (result1 + result2) / 2;
        System.out.println ("Средний балл оценок по предметам " + average_result);
        average_proc = (proc_hist +proc_prog) / 2;
        System.out.println ("средний % по предметам " + average_proc);

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int profit_average = 13000;
        int cost_price = 9000;
        char plus = '+';
        int average_year = profit_average - cost_price - rent;
        if (average_year < 0) {
            System.out.println ("Прибыль за год: " + average_year);
        } else {
            System.out.println("Прибыль за год: " + plus + average_year);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum_bank = 567;
        int one, ten, hundred;
        one = sum_bank%10;
        hundred = sum_bank/100;
        ten = sum_bank/10%10;
        int counting = hundred * 100 + ten * 10 + one;
        System.out.println("Сумма выдачи " + sum_bank + " содержит: " + hundred + " сотен; "+ ten +" десятков; " + one + " единиц купюр.");
        if (ten > 5) {
            one += (ten - 5) * 10;
            ten = 5;
            System.out.println("Банкомат может выдать " + sum_bank + " из купюр: " + hundred + " сотен; "+ ten +" десятков; " + one + " единиц купюр.");

        } else {
            System.out.println("Банкомат может выдать " + sum_bank + " из купюр: " + hundred + " сотен; "+ ten +" десятков; " + one + " единиц купюр.");
        }
        System.out.println("Посчитанная исходная сумма: " + counting);
    }
}