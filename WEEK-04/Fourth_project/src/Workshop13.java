/**
 * Created by viktor on 2016.11.13..
 */
/**
 * File I/O: Scan a Directory
 *
 * There are situations where you'll need to find stuff in a directory.  In this challenge, you're asking the
 * user to tell you where to look and handling the error if the user tells you something wrong.
 *
 * What we mentors want to see is a function that will list the contents (files and directories) that are
 * beneath a particular path; handle the error if it does not exist.
 *
 * PATH/FILE?
 * C:\Temppp
 * SORRY  C:\Tempppp is not a directory or does not exist.
 * Bye!

 //// Or if the directory exists:
 * PATH/FILE?
 * C:\Temp
 * Tosh.txt
 * Wailer.txt
 * Cliff.txt
 *
 * Bye!

 * Note that you are writing a program that starts and then exits.  You are not doing a loop (as we've not covered
 * closing objects).
 * You are having to create a File (so there'll be a defined object as you saw in the previous Workshop).
 * Once you have created the File, you need to check if it's a directory
 * If it's a directory, then you need to set an array of files in the directory
 * Then you need a foreach
 */

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop13 {

    static File randomDir;    //Declare something here (see Workshop12)

    public static void main(String[] args) {

        System.out.println("PATH/FILE?");

        Scanner userInput = new Scanner(System.in);

        String strDirectoryPath = userInput.next();

        printDirectoryContents(strDirectoryPath);

    }


    private static void printDirectoryContents(String pathToList) {

        randomDir = new File(pathToList);

        if (randomDir.isDirectory()) {

            String[] filesInDir = randomDir.list();

            System.out.println("Files in Random Directory\n");
            // Use the enhanced for loop to cycle through the files
            for (String fileName : filesInDir) {
                System.out.println(fileName + "\n");
            }
        }
        else {
            System.out.println("SORRY  "+pathToList+" is not a directory or does not exist.");
        }
    }

}
