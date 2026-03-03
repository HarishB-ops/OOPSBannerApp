/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * * This application retrieves and displays the "OOPS" banner using
 * a CharacterPatternMap class to encapsulate mappings.
 */
public class innerclass {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Static Method to Create and initialize CharacterPatternMap array
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", "** **", "** **", "** **", "** **", "** **", "  *** "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[]{
            "****** ", "** **", "** **", "****** ", "** ", "** ", "** "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[]{
            " ***** ", "** ", "** ", " ***** ", "     **", "     **", " ***** "
        });
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        // If not found, recursively return space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 7; // Height of the ASCII patterns
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add spacing between characters
            }
            System.out.println(line);
        }
    }

    /**
     * Main method - Entry point
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define the message to be displayed
        String message = "OOPS";
        
        // Print the banner message
        printMessage(message, charMaps);
    }
}