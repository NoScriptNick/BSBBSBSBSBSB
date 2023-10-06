import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double acct;
        double acctAddMinus;
        double acctBal = 0;
        boolean done = false;
        String continueYN = "";

        //asks user for account balance
        System.out.println("Enter your account balance: ");
        if (scan.hasNextDouble()) {
            acct = scan.nextDouble();
            acctBal = acct;
            scan.nextLine();
            do { //withdrawal or deposit
                System.out.println("Would you like to withdrawal or deposit? Enter [Y/N]: ");
                continueYN = scan.nextLine();
                if (continueYN.equals("N")) {
                    done = true;
                } else if (continueYN.equals("Y")) {
                    System.out.println("Enter - and a number you would like to withdrawal, or a + and a number you would like to deposit: ");
                    if (scan.hasNextDouble()) {
                        acctAddMinus = scan.nextDouble();
                    }
                } else {
                    System.out.println("Not even a yes or a no!!!!!");
                }
            } while (!done);
        } else {
            System.out.println("THAT'S NOT A BALANCE!!!!");
        }
    }
}