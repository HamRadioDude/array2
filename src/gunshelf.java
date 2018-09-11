import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class gunshelf {

    // i had a bunch of comments, but for some reason that git didnt re upload.  then i made some changes and kept this current code.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int itemnum = 0;                        // will be used to search for an  item number to change the quantity on hand
        String new_quan;                                              // will be used to update the qunatity on hand
        int user_input = 0;
        int repeat = 1;                                                                           // option 3 to exit.
        int result = 0;
        String[][] gun_store = {{"Springfield", "Glock", "Sig Sauer", "Ruger", "Smith & Wesson", "Mossberg"}, {"10", "11", "12", "13", "14", "19"}};
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime modified = LocalDateTime.now();
        String update_invtime;

        System.out.println("\nWelcome to Uncle Bucks Gun Shop. \nPlease select an option from below:");


        while (repeat != 3) {
            System.out.println("\n\n\t 1. View Inventory:\n\t 2. Change Quantity:\n\t 3. To Quit");
            user_input = in.nextInt();

            if (user_input == 1) {
                System.out.println("________________________________________________________");
                System.out.println("Item:   GUN BRAND             QUANTITY ON HAND");
                System.out.println("________________________________________________________\n");

                for (int i = 0; i < gun_store[0].length; i = i + 1) {
                    System.out.printf("\n" + (i + 1) + (":\t\t"));


                    for (int x = 0; x < gun_store.length; x = x + 1) {
                        System.out.printf("%-32s ", gun_store[x][i] + "  ");                                  //without this line being printf, the formatting was horrible.  (if it was pritnln)


                    }
                }

            } else if (user_input == 2) {
                System.out.println("Enter The Item number to be modified");
                itemnum = in.nextInt();
                System.out.println("Enter the updated inventory amount: ");
                new_quan = in.next();
                result = Integer.parseInt(new_quan);            // parseint to change string into integer and confirm the number is not a negative number
                if (itemnum <= gun_store[1].length && result >= 0) {
                    gun_store[1][itemnum - 1] = new_quan;
                    System.out.println("Sucessfully updated inventory at "+ modified);


                } else {
                    System.out.println("ERROR, that is not a valid item number");
                }                                                                           

            } else if (user_input == 3){
                    System.exit(0);
                }


              else if (user_input != 1 && user_input  != 2 && user_input != 3) {                                                             1
                System.out.println("ERROR, that is not a valid option");
            }
                    }

            }
        }


