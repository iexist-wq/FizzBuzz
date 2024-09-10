public class Multiples {
    public static void main(String[] args) {
        int c = 0;
        int i = 0;
        while ( i < 1000) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if (divisibleBy3) {

            c++;

        } else if (divisibleBy5) {

           c++;

        }
        i++;
        }
        System.out.println(c);
    }
}
