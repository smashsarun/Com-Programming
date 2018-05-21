
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static int countWords(String fileName)
            throws FileNotFoundException, WrongWordException {
        Scanner scKeyboard = new Scanner(System.in);
        int numOfWords = 0;
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            String word = scFile.next();
            if (word.equalsIgnoreCase("your")) {
                throw new WrongWordException("your word is wrong");
            }
            numOfWords++;
        }

        return numOfWords;
    }

    public static int countLine(String fileName) throws FileNotFoundException {
        int numOfLine = 0;
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNextLine()) {
//            System.out.println(scFile.nextLine());
            String Line = scFile.nextLine();
            numOfLine++;
        }

        return numOfLine;
    }

//    public static int countChar(String fileName) throws FileNotFoundException {
//        int numOfChar = 0;
//        Scanner scFile = new Scanner(new File(fileName));
//        while (scFile.hasNext()) {
//            System.out.println(scFile.next());
//            //Not Complete
//        }
//
//        return numOfChar;
//    }
    public static void main(String[] args) {
        int words = -1;
        int line = -1;
        try {
            line = countLine("words.txt");
            words = countWords("words.txt");

        } catch (FileNotFoundException ff) {
            System.out.println(ff);
        } catch (WrongWordException ww) {
            System.out.println(ww);
        } finally {
            System.out.println("line in file: " + line);
            System.out.println("words in file: " + words);

        }
    }
}
