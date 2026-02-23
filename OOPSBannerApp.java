public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Build banner using returned patterns
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    O[i], O[i], P[i], S[i]
            );
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper method for letter O
    public static String[] getOPattern() {
        return new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Static helper method for letter P
    public static String[] getPPattern() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static helper method for letter S
    public static String[] getSPattern() {
        return new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}