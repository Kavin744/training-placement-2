public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
