public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Create String array for 7 banner lines
        String[] lines = new String[7];

        // Populate each line using String.join()

        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   * ", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   * ", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", " ***** ", " ***** ");
        lines[4] = String.join(" ", "*   *", "*   *", "*      ", "     *");
        lines[5] = String.join(" ", "*   *", "*   *", "*      ", "     *");
        lines[6] = String.join(" ", " *** ", " *** ", "*      ", " ***** ");

        // Enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}