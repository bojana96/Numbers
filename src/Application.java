import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static int convertToNumber(String input) {
        int i=0;
        switch (input) {
            case "zero":
                i = 0;
                break;
            case "one":
                i = 1;
                break;
            case "two":
                i = 2;
                break;
            case "three":
                i=3;
                break;
            case "four":
                i=4;
                break;
            case "five":
                i=5;
                break;
            case "six":
                i=6;
                break;
            case "seven":
                i=7;
                break;
            case "eight":
                i=8;
                break;
            case "nine":
                i=9;
                break;

        }
        return i;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] parts=line.split(" ");
        Integer[] broj=new Integer[parts.length];
        for(int i=0;i<parts.length;i++){
            broj[i]=convertToNumber(parts[i]);
        }
        for(int i=0;i<broj.length;i++){
            System.out.print(broj[i]+"");
        }
    }
}
