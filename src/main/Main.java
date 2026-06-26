import model.MorseTranslator;

public class Main {
    public static void main(String[] args) {

        MorseTranslator translator = new MorseTranslator();

        String test1 = "SOS";
        String test2 = "ČUVAJ SE RUSKE PODMORNICE";
        String test3 = "Sara voli loft kafić.";

        String rezultat1 = translator.translateTextToMorse(test1, " ");
        String rezutat2 = translator.translateTextToMorse(test2, "/");
        String rezutat3 = translator.translateTextToMorse(test3, "|");

        System.out.println("--- MORSI TEST ---");
        System.out.println("Unos 1: " + test1);
        System.out.println("Morse 1: " + rezultat1);
        System.out.println("---------------------------------");
        System.out.println("Unos 2: " + test2);
        System.out.println("Morse 2: " + rezutat2);
        System.out.println("---------------------------------");
        System.out.println("Unos 3: " + test3);
        System.out.println("Morse 3: " + rezutat3);

    }
}