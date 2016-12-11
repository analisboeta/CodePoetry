/**
 * Created by <Boolegans_Code Cadet> Ana Lourenço on 01/11/16.
 */

public class ChopSuey {

    public static void main(String[] args) {


        singFirstVerse();

    }

    private static void singFirstVerse() {

        String[] wordsUnderstood = new String[]{"...MAKE-UP!", "...SHAKE-UP!", "... TABLE!", "...FABLE!"};

        System.out.println("WAKE UP!");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < wordsUnderstood.length; j++) {

                if (i == 1) {
                    System.out.println("(You want to!!)");
                }

                if (j == 3 && i == 1) {
                    continue;
                }

                System.out.println(gibberishGenerator() + "\n" + wordsUnderstood[j]);

            }

            System.out.println("\n");
        }

    }

    private static String gibberishGenerator() {


        final int GIBBERISH_VERSE_LENGTH = 10;
        String source = "abcdefghijklmnopqrstuvwxyz!#$%&?*";

        String gibberishVerse = "";

        for (int i = 0; i < GIBBERISH_VERSE_LENGTH; i++) {

            char strAux = source.charAt((int) (Math.floor(Math.random() * source.length())));

            gibberishVerse += strAux;

        }

        return gibberishVerse;
    }
}


