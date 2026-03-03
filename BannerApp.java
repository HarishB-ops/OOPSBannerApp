public class BannerApp {

    public static String[] main(String[] args) {
        // Step 2: Then in main method, call the methods to get the patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        public static String[] getOPattern() {
        return new String[] {
            "  * * * ",
            " * *  * * ",
            "* *  * *",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " ** **",
            " ** **",
            " ***** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " ** ",
            "  *** ",
            "    ** ",
            " **** ",
            "       ", // Added padding to maintain consistent array length
            "       "
        };

        // Step 3: Finally, use a loop to print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + sPattern[i]);
        }
    }

    // 1. Define methods getOPattern(), getPPattern(), and getSPattern()
    //    that return String arrays representing the ASCII art for each letter

    // Example of method to create O pattern:
    // Step 1: Define the method
    
    }
}