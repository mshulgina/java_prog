public class IfElseStatementTheme {
    public static void main(String[] args) {
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
        int m1 = 6;
        int m2 = 6;
        System.out.println("Исходные значения: " + m1 + " и " + m2);
        if (m1 > m2) {
            System.out.println(m1 + " - максимальное число; " + m2 + " - минимальное значение");
        } else if (m2 > m1) {
            System.out.println(m2 + " - максимальное число; " + m1 + " - минимальное значение");
        } else if (m1 == m2) {
            System.out.println("Исходные значения равны");
        }

        System.out.println("\n3. Работа с числом");
        int n = -1;
        System.out.println("Исходное число: " + n);
        if (n == 0) {
            try {
            } finally {
            }
        } else if ((n % 2) == 0) {
            System.out.println("Число " + n + " четное ");
        } else if ((n % 1) == 0) {
            System.out.println("Число " + n + " нечетное ");
        }
        if (n < 0) {
            System.out.println("Число " + n + " отрицательное ");
        } else if (n > 0) {
            System.out.println("Число " + n + " положительное");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 123;
        int a1, b1, c1, a2, b2, c2;
        a1 = num1 % 10;
        b1 = num1 / 10 % 10;
        c1 = num1 / 100;
        a2 = num2 % 10;
        b2 = num2 / 10 % 10;
        c2 = num2 / 100;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        if (a1 == a2) {
            System.out.println("В первом разряде цифра " + a1 + " есть в обоих числах");
        } else {
            try {
            } finally {
            }
        }
        if (b1 == b2) {
            System.out.println("Во втором разряде цифра " + b1 + " есть в обоих числах");
        } else {
            try {
            } finally {
            }
        }
        if (c1 == c2) {
            System.out.println("В третьем разряде цифра " + c1 + " есть в обоих числах");
        } else {
            try {
            } finally {
            }
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symb; //?

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
        int q,p,r;
        r = sum_bank%10;
        p = sum_bank/100;
        q = sum_bank/10%10;
        int counting = p * 100 + q * 10 + r;
        System.out.println("Сумма выдачи " + sum_bank + " содержит: " + p + " сотен; "+ q +" десятков; " + r + " единиц купюр.");
        if (q > 5) {
            r += (q - 5) * 10;
            q = 5;
            System.out.println("Банкомат может выдать " + sum_bank + " из купюр: " + p + " сотен; "+ q +" десятков; " + r + " единиц купюр.");

        } else {
            System.out.println("Банкомат может выдать " + sum_bank + " из купюр: " + p + " сотен; "+ q +" десятков; " + r + " единиц купюр.");
        }
        System.out.println("Посчитанная исходная сумма: " + counting);
    }
}