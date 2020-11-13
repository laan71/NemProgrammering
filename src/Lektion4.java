public class Lektion4 {


    /* 1. Erklær en int variable og tildel den værdien 20.
            1. Foretag en operation med hver af de nævnte operatorer +, -, *, /, %.
            2. Tildel resultatet af HVER operation til en NY variabel så du til sidst ender med 6 int variabler.
            3. Udskriv værdien på alle 6 variabler, på formen (med et + eksembel): "20 + 5 = 25", hvor 25 er resultatet i den nye variabel
               20 er den oprindelige og 5 indtaster du selv.

       3. Foretag ovenstående øvelse med double i stedet for int. HUSK % virker IKKE på double. Husk at angive tallene som kommatal.

     */
    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        int plus = x + y;
        System.out.println("" + x + " + " + y + " = " + plus );

        int minus = x - y;
        System.out.println("" + x + " - " + y + " = " + minus );

        int gange = x * y;
        System.out.println("" + x + " * " + y + " = " + gange );

        int divider = x / y;
        System.out.println("" + x + " / " + y + " = " + divider );


        int modulus = x % y;
        System.out.println("" + x + " % " + y + " = " + modulus );

        double x2 = 20.0;
        double y2 = 10.0;

        double plus2 = x2 + y2;
        System.out.println("" + x2 + " + " + y2 + " = " + plus2 );

        double minus2 = x2 - y2;
        System.out.println("" + x2 + " - " + y2 + " = " + minus2 );

        double gange2 = x2 * y2;
        System.out.println("" + x2 + " * " + y2 + " = " + gange2 );

        double divider2 = x2 / y2;
        System.out.println("" + x2 + " / " + y2 + " = " + divider2 );

        double modulus2 = x % y;
        System.out.println("" + x2 + " % " + y2 + " = " + modulus2 );


    }
}