import java.util.Scanner;

public class P_ATM_SIMULATOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR ATM PIN HERE(4 digit) : ");
        int pin = sc.nextInt();
        long original_pin = 1410;

        if (original_pin == pin) {


            int balance = 5000;

            do {


                System.out.println("WELCOME TO ATM.!");
                System.out.println("WHAT DO YOU WANT TO DO??");

                System.out.println("1 :- CHECK BALANCE");
                System.out.println("2 :- DEPOSIT MONEY");
                System.out.println("3 :- WITHDRAW MONEY ");
                System.out.println("4 :- EXIT ATM");
                System.out.println("");
                System.out.print("PLE.. SELECT NUMBER.. HERE :");


                int input = sc.nextInt();

                if (input == 1) {
                    System.out.println("YOUR BALANCE IS : " + balance);
                } else if (input == 2) {
                    System.out.println("ENTER YOUR DEPOSIT AMOUNT HERE: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("NOW YOUR NEW BALANCE IS : " + balance);
                } else if (input == 3) {
                    System.out.println("ENTER YOUR WITHDRAW AMOUNT HERE: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("NOW YOUR NEW BALANCE IS : " + balance);
                    } else {
                        System.out.println("YOU DON'T HAVE SUFFICIENT BALANCE!!");
                        balance -= withdraw;
                        System.out.println("NOW YOUR NEW BALANCE IS : " + balance);
                    }
                } else if (input == 4) {
                    sc.close();
                    System.out.println("EXITED FROM ATM!!");
                    break;
                } else {
                    System.out.println("PLEASE ENTER NUMBER BETWEEN 1 TO 4!!!");

                }
            }while (true);


        }
        else{
            System.out.println("INCORRECT PIN!!");
        }
    }
}
