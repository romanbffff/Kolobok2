package com.vntu.akit;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            File file = new File("Cost.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println("199");
            pw.println("270");
            pw.println("56");
            pw.close();

            br = new BufferedReader(new FileReader("Cost.txt"));
             String distance;
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
             Train train = new Train();
             // Train train1 = new Train(86,"Kiev", "Odessa");
            train.print();
        }
    }
}
