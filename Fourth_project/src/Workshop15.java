/**
 * Created by viktor on 2016.11.13..
 */

import java.io.*;
import java.util.Scanner;

public class Workshop15 {
    public static void main(String[] args) {

        System.out.println("Enter the file path, or q to Quit");

        Scanner userInput = new Scanner(System.in);
        String filePath;

        System.out.print("File path: ");

        while(userInput.hasNextLine()){
            filePath = userInput.nextLine();
            if(filePath.equals("q"))
                break;
            printFileContent(filePath);
            System.out.print("File path: ");
        }
    }

    private static void printFileContent (String filePath) {

        System.out.println("Info Written to File\n");

        // Open a new connection to the file
        File listOfNames = new File(filePath);

        try {

            BufferedReader getInfo = new BufferedReader(
                    new FileReader(listOfNames));


            String custInfo = getInfo.readLine();


            while(custInfo != null){

                System.out.println(custInfo);

                custInfo = getInfo.readLine();
            }
        }

        // Can be thrown by FileReader
        catch (FileNotFoundException e) {
            System.out.println("The specified path does not exists!");
            System.exit(0);
        }

        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
    }


        // Implement this function
        // Open and read the file and print it's content to the standard output
        // If a specified path does not exist write "The specified path does not exists!"
    }
