public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println("OOPS");
        System.out.println();

        printBanner();
    }

    public static void printBanner() {

        String[][] O = {
                {" ", "*****", " "},
                {"*", "     ", "*"},
                {"*", "     ", "*"},
                {"*", "     ", "*"},
                {"*", "     ", "*"},
                {"*", "     ", "*"},
                {" ", "*****", " "}
        };

        String[][] P = {
                {" ", "*****", " "},
                {"*", "     ", "*"},
                {"*", "     ", "*"},
                {" ", "*****", " "},
                {"*", "      ", " "},
                {"*", "      ", " "},
                {"*", "      ", " "}
        };

        String[][] S = {
                {" ", "*****", " "},
                {"*", "      ", " "},
                {"*", "      ", " "},
                {" ", "*****", " "},
                {" ", "      ", "*"},
                {" ", "      ", "*"},
                {" ", "*****", " "}
        };

        for (int i = 0; i < 7; i++) {

            String line = String.join(" ",
                    String.join(" ", O[i]),
                    String.join(" ", O[i]),
                    String.join(" ", P[i]),
                    String.join(" ", S[i])
            );

            System.out.println(line);
        }
    }
}
