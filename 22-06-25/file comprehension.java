import java.io.*;

public class RLECompression {
    public static void compress(String input, String output) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        int ch;
        while ((ch = br.read()) != -1) {
            int count = 1;
            int next = br.read();
            while (next == ch) {
                count++;
                next = br.read();
            }
            bw.write((char) ch + "" + count);
            if (next != -1)
                br.reset();
        }
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        compress("input.txt", "output.rle");
    }
}
