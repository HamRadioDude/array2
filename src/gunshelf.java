import java.util.Scanner;

public class gunshelf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int itemnum = 0;
        String new_quan;
        int user_input = 0;
        int repeat = 1;
        int result = 0;
        String[][] gun_store = {{"Springfield", "Glock", "Sig Sauer", "Ruger", "Smith & Wesson", "Mossberg"}, {"10", "11", "12", "13", "14", "19"}};


        System.out.println("\nWelcome to Uncle Bucks Gun Shop. \nPlease select an option from below:");


        while (repeat != 0) {
            System.out.println("\n\t 1. View Inventory:\n\t 2. Change Quantity:\n\t 3. Search ");
            user_input = in.nextInt();

            if (user_input == 1) {
                System.out.println("________________________________________________________");
                System.out.println("*Item*********GUN BRAND***************QUANTITY ON HAND");
                System.out.println("________________________________________________________");
                for (int i = 0; i < gun_store[0].length; i = i + 1) {
                    System.out.println("\n" + (i + 1) + (":"));


                    for (int x = 0; x < gun_store.length; x = x + 1) {
                        System.out.printf("%-22s ", gun_store[x][i] + "  ");


                    }
                }

            } else if (user_input == 2) {
                System.out.println("Enter The Item number to be modified");
                itemnum = in.nextInt();
                System.out.println("Enter the updated inventory amount: ");
                new_quan = in.next();
                result = Integer.parseInt(new_quan);
                if (itemnum <= gun_store[1].length && result >= 0) {
                    gun_store[1][itemnum - 1] = new_quan;
                } else {
                    System.out.println("ERROR, that is not a valid item number");
                }

//            }else if (user_input == 3)
//
//                Ive yet to get the Search function to work.  Spent most of my time figuring out 2d arrays.
            }
            }
        }
    }


