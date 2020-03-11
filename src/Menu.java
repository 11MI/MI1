import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) {

        System.out.println("Add new contact - Press '1'");
        System.out.println("Check contact book - Press '2'");
        System.out.println("Exit - Press '3'");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("Now you can add new contact");

            Scanner addingName = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter contact name");
            String contactName = addingName.nextLine();  // Read user input

            Scanner addingNumber = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter contact number");
            String contactNumber = addingNumber.nextLine();  // Read user input

            System.out.println("You added new contact: " + contactName + " " + "with number" + " " + contactNumber);
            // Output user input

            try {
                File contactBook = new File("C:\\Users\\Irochka\\IdeaProjects\\Contact book\\contactBook.txt");
                if (contactBook.createNewFile()) {
                    System.out.println("File created: " + contactBook.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            try {
                FileWriter myWriter = new FileWriter("C:\\Users\\Irochka\\IdeaProjects\\Contact book\\contactBook.txt");
                myWriter.write(contactName);
                myWriter.write(contactNumber);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
    }
}

//     else if (i==2) {
//            System.out.println ("Now you can find contact in contact book");
//
//
//   }
//     else if (i==3) {
//            System.out.println ("Contact book is closed");
//     }
//     else {
//            System.out.println ("Unknown error");
//     }
//    }
//}





