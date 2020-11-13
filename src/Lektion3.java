import java.sql.SQLOutput;

public class Lektion3 {

    // Basiske datatyper er int(-2.147.483.648 - 2.147.483.647), float(-2.147.483.648 - 2.147.483.647); double(9,223,372,036,856,775,808 - 9,223,372,036,856,775,807)

    public static void main(String[] args) {

        // I denne lektion skal der erklæres og tildeles værdier til 3 forskellige variabler af henholdsvis typen int, double og char.
        int myVar;
        myVar = 5;

        int myVar2 = 56;
        int myVar3 = 524783591;

        double myDouble;
        myDouble = 52.45;

        double myDouble2 = 74.50;
        double myDouble3 = 2.25;

        char myChar;
        myChar = 'd';

        char myChar2 = 'r';
        char myChar3 = 'k';

        // Her udskrives værdien af alle variablerne lagt sammen
        System.out.println("Summen af alle variabler = " + myVar + myVar2 + myVar3 + myDouble + myDouble2 + myDouble3 + myChar + myChar2 + myChar3);

    }
}
