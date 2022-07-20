public class Calculator {

    public static void main (String[] args) {
        int a = 5;
        int b = 10;
        char sign = '^';
        int result = (b - a);
        if (sign == '+') {
            result = (b + a);
        } else if (sign == '%') {
            result = (b % a);
        } else if (sign == '^') {
            result = b*b;
                for (int i=1; i<=a; i++){
                    result = result *b;
                }
            } System.out.println("число  " + b  + sign + " число " + a + " = " + result);
        }
}