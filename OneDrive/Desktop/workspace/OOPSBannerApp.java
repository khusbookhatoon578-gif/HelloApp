public class OOPSBannerApp {

    /**
     * Class to store character and its pattern
     */
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    /**
     * Creates character pattern objects
     */
    public static CharacterPattern[] createCharacterPatterns() {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPattern[] patterns = {
                new CharacterPattern('O', O),
                new CharacterPattern('P', P),
                new CharacterPattern('S', S)
        };

        return patterns;
    }

    /**
     * Gets the pattern of a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPattern[] patterns) {

        for (CharacterPattern cp : patterns) {
            if (cp.character == ch) {
                return cp.pattern;
            }
        }

        return new String[7];
    }

    /**
     * Prints the banner message
     */
    public static void printMessage(String message, CharacterPattern[] patterns) {

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, patterns);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPattern[] patterns = createCharacterPatterns();

        String message = "OOPS";

        printMessage(message, patterns);
    }
}