package Exercitii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExercity {
    public static void main(String[] args) {
       // extracted();
        readfromFile();
        readFromFile3();
    }

    private static void readfromFile() {
        try {
            File myObj = new File("file2.txt");
            Scanner myReader = new Scanner(myObj);
            int suma = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                suma = suma + Integer.valueOf(data);
                System.out.println();

            }
            System.out.println(suma);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error" + e);
            e.printStackTrace();
        }
    }

    private static void readFromFile3() {
        try {
            File myObj = new File("file3.txt");
            Scanner myReader1 = new Scanner(myObj);
            int sum = 0;
            while (myReader1.hasNextLine()) {
                String data1 = myReader1.nextLine();
                String[] data = data1.split(",");
                for (int i = 0; i<data.length; i++) {
                    String cuvant = data[i];
                    sum = sum + Integer.valueOf(cuvant);
                }
            }
            System.out.println(sum);
            myReader1.close();
        } catch (FileNotFoundException ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
    }

    private static void extracted() {
        try {
            FileWriter myWriter = new FileWriter("file2.txt");
            for (int i = 1; i <=4; i++) {
                myWriter.write("Files in Java\n");
            }

            myWriter.close();
            System.out.println("Wrote to the file");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }


}
