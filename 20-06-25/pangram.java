public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alpha = new boolean[26];
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                alpha[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (boolean b : alpha) {
            if (!b) isPangram = false;
        }

        System.out.println("Is Pangram? " + isPangram);
    }
}
