public class VariablesTheme {
    public static <decInt> void main (String[] args) {
        int cores = 6;
        int ram = 8;
        int speedCPU = 3;
        String cpu = "Intel Core i5-9500";
        int x = 100;
        int y = 200;
        int discount = 11;
        int DisX = x * discount / 100;
        int DisY = y * discount / 100;
        int sumDiscount = DisX +DisY;
        int sumAll = ( x + y ) - sumDiscount;
        String str1 =new String(new char[] {' ' ,' ' ,' ' ,' ', 'J',' ' ,' ' ,' ' ,' ','a',' ' ,' ', ' ','v', ' ' ,
                ' ' ,' ', ' ', ' ', 'v', ' ' ,' ' ,' ', 'a'});
        String str2 =new String(new char[] {' ' ,' ' ,' ' ,' ', 'J', ' ' ,' ' ,' ','a', ' ', 'a', ' ' ,' ',' ' , 'v',
                ' ' ,' ' ,' ', 'v', ' ' ,' ', ' ', 'a', ' ' , 'a'});
        String str3 =new String(new char[] {'J' ,' ' ,' ' ,' ', 'J', ' ' ,' ' ,'a','a', 'a','a', 'a', ' ' , ' ' ,' ',
                'V', ' ', 'V',' ' ,' ', ' ', 'a','a', 'a','a', 'a'});
        String str4 =new String(new char[] {' ' ,'J' ,' ' ,'J', ' ', ' ', 'a', ' ' ,' ' ,' ' ,' ', ' ', 'a', ' ' , ' ' ,
                ' ', 'V', ' ', ' ', ' ', 'a', ' ' ,' ' ,' ' ,' ', ' ', 'a', });
        int firstInt = Integer.MAX_VALUE;
        byte firstByte = Byte.MAX_VALUE;
        short firstShort = Short.MAX_VALUE;
        long firstLong = Long.MAX_VALUE;
        int decInt = firstInt, incInt = firstInt;
        decInt--;
        incInt++;
        byte decByte = firstByte, incByte = firstByte;
        decByte--;
        incByte++;
        short decShort = firstShort, incShort = firstShort;
        decShort--;
        incShort++;
        long decLong = firstLong, incLong = firstLong;
        decLong--;
        incLong++;
        int a1 = 1;
        int b1 = 2;
        int tmp = 1;
        int c = 35;
        int d = 38;
        int e = 64;
        int f = 94;
        int g = 95;
        int number = 345;
        int k,l,m;
        m = number%10;
        l = ((number%100) - m)/10;
        k = (number - l*10 - m)/100;
        char space = ' ';
        char slashR = '/';
        int slashL  = 92;
        char underL = '_';
        char brOpen = '(';
        char brClose = ')';
        String line1 =new String(new char[] {space, space, space, space, space,  slashR,  (char)slashL});
        String line2 =new String(new char[] {space, space, space, space,  slashR, space, space, (char)slashL});
        String line3 =new String(new char[] {space, space, space, slashR, space, space, space, space, (char)slashL});
        String line4 =new String(new char[] {space, space, slashR, underL,brOpen, space, space, brClose, space,
                (char)slashL});
        String line5 =new String(new char[] {space, slashR, underL, underL, underL, underL, slashR, (char)slashL,
        underL, underL, (char)slashL});
        int numberN = 123;
        int q,p,r;
        r = numberN%10;
        p = ((numberN%100) - r)/10;
        q = (numberN - p*10 - r)/100;
        int totalSecs = 86399;
        int hours, minutes,seconds;
        hours = totalSecs / 3600;
        minutes = (totalSecs % 3600) / 60;
        seconds = totalSecs % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        System.out.println("Мой компьютер " + cpu + cores +"-х яденрный" + " с оперативной памятью " + ram + "Гб" +
                " и частотой процессора " + speedCPU + "ГГц");
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        System.out.println("Cуммa скидки " + sumDiscount + " рублей. " + "Общая стоимость товаров со скидкой "
                + sumAll);
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println(str1); // System.out.println(new String(new char[] {' ',' ','J','l','q'}))
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        System.out.println("Integer: первоначальное значение " + firstInt + " значение после инкремента " + incInt
                + " значение после декремента "+ decInt);
        System.out.println("Byte: первоначальное значение " + firstByte + " значение после инкремента " + incByte
                + " значение после декремента "+ decByte);
        System.out.println("Short: первоначальное значение " + firstShort + " значение после инкремента " + incShort
                + " значение после декремента "+ decShort);
        System.out.println("Long: первоначальное значение " + firstLong + " значение после инкремента " + incLong
                + " значение после декремента "+ decLong);
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("Способ 1. С помощью третьей переменной: ");
        System.out.println("Исходные значения: a1 = " + a1 + " b1 = " + b1);
        a1 = tmp;
        a1 = b1;
        b1 = tmp;
        System.out.println("После применения способа 1: a1 = " + a1 + " b1 = " + b1);
        System.out.println("Способ 2. С помощью арифметических операций: ");
        System.out.println("Исходные значения: a1 = " + a1 + " b1 = " + b1);
        //a1 = a1 + b1;
        a1 += b1;
        b1 = a1 - b1;
        //a1 = a1 - b1;
        a1 -= b1;
        System.out.println("После применения способа 2: a1 = " + a1 + " b1 = " + b1);
        System.out.println("Способ 3. С помощью побитовой операции ^: ");
        System.out.println("Исходные значения: a1 = " + a1 + " b1 = " + b1);
        a1 = (a1 ^ b1);
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("После применения способа 2: a1 = " + a1 + " b1 = " + b1);
        System.out.println("\n6. Вывод символов и их кодов");
        System.out.println("Десятичный код: " + c + ", Знак ASCII: " + (char) c);
        System.out.println("Десятичный код: " + d + ", Знак ASCII: " + (char) d);
        System.out.println("Десятичный код: " + e + ", Знак ASCII: " + (char) e);
        System.out.println("Десятичный код: " + f + ", Знак ASCII: " + (char) f);
        System.out.println("Десятичный код: " + g + ", Знак ASCII: " + (char) g);
        System.out.println("\n7. Произведение и сумма цифр числа");
        System.out.println("Дано число N = " + number + ". Cумма цифр числа N = " + (k+l+m) + ". Произведение цифр " +
                "числа N " + (k*l*m));
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        System.out.println("Число " + numberN + " содержит: " + r + " сотни; "+ p +" десятка; " + q + " единицу.");
        System.out.println("\n10. Отображение количества сотен, десятков и единиц числа");
        System.out.println("Преобразование " + totalSecs + " секунд: " + timeString);
    }
}