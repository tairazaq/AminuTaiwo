import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //operators.arithmetic();
        //operators.assignment();
        //oysterCardChild();
        //oysterPlatniumAlt("Taiwo",6);
      //  oysterCardAdult("Rita", 36);
        }

        public static void oysterCardChild(){
        //child pass1-17, adult18 -59, retired 60+

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Your Name : ");
            String username = input.nextLine();

            System.out.println("Enter Your Age : ");
            int age = input.nextInt();

            if(age <= 17 ){

                System.out.println("Welcome"+" "+username +" "+ "you are eligible to use this card");
            }else{
                System.out.println(username+" "+"you are too old to use this card, Please go register for the appropriate card. Thanks!.");
            }
        }

        //adult oyster card

    public static void oysterPlatniumAlt(String oysterCardUserName, int age) {
        //child pass1-17, adult18 -59, retired 60+

        // String oysterCardUserName = "Taiwo";
        //int  age = 26;

        if (age >= 15 || age <= 5 ) {
            System.out.print("You are eligble to use this card Adult" + " " + oysterCardUserName);
        } else {
            System.out.print("You are not eligble to use this card Adult " + oysterCardUserName);
        }
    }
}


//Task to do
// Write a method that take username and age for Adult and Retired person.