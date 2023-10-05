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
            scan.nextLine();
            do { //withdrawal or deposit
                System.out.println("Would you like to withdrawal or deposit? Enter [Y/N]: ");
                continueYN = scan.nextLine();
                if (continueYN.equalsIgnoreCase("N")) {
                    done = true;
                } else if (continueYN == "Y") {
                    System.out.println("Enter - and a number you would like to withdrawal, or a + and a number you would like to deposit: ");
                    acctAddMinus = scan.nextDouble();
                } else {
                    System.out.println("THATS NOT EITHER YES OR NO!!!!!!!!");
                }
            } while (!done);
        } else {
            System.out.println("THATS NOT A BALANCE");
        }
    }
}