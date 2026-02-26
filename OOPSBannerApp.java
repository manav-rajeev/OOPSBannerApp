public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character banner character
         * @param pattern 7-line pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     */
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
    }

    /**
     * Utility method to create P pattern
     */
    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    /**
     * Utility method to create S pattern
     */
    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] characters = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };

        // Build banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}