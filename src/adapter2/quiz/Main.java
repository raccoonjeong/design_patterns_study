package adapter2.quiz;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            System.out.println(System.getProperty("user.dir"));
            f.readFromFile("src/adapter2/quiz/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src/adapter2/quiz/newfile.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
