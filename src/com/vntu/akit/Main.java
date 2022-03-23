package com.vntu.akit;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            File file = new File("Cost.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println("80");  // kilometers
            pw.println("30");  // kilometers
            pw.println("56");  // Price per kilometer
            pw.close();

            br = new BufferedReader(new FileReader("Cost.txt"));
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
            Scanner scanner = new Scanner(new File("Cost.txt"));
            int [] array= new int [100];
            int i = 0;
            while(scanner.hasNextInt()){
                array[i++] = scanner.nextInt();
            }
            int CostFirstRoute = array[0];
            int CostSecondRoute = array[1];
            double CostOfRoute = array[2];
           double FirstRoute = CostFirstRoute * CostOfRoute;
           double SecondRoute = CostSecondRoute * CostOfRoute;
//            Train train = new Train();
            Train train1 = new Train(86,"Kiev", "Odessa");
            train1.print();
            {
                System.out.println();
                System.out.println("Ціна за 1км маршруту: " + CostOfRoute);
                System.out.println("Ціна за маршрут №1: " + FirstRoute);
                System.out.println("Ціна за маршрут №2: " + SecondRoute);
            }
        }
    }
}
