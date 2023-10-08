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
        String continueWD = "";

        //asks user for account balance
        System.out.println("Enter your account balance: ");
        if (scan.hasNextDouble()) {
            acct = scan.nextDouble();
            acctBal = 0;
            scan.nextLine();
            do { //withdrawal or deposit
                System.out.println("Would you like to continue? Enter [Y/N]: ");
                continueYN = scan.nextLine();
                if (continueYN.equals("N")) {
                    done = true;
                } else if (continueYN.equals("Y")) {
                    System.out.println("Would you like to withdrawal or deposit? Enter [W/D]: ");
                    continueWD = scan.nextLine();
                    if (continueWD.equals("W")) {
                        System.out.println("How much would you like to withdrawal?");
                        if (scan.hasNextDouble()) {
                            acctAddMinus = scan.nextDouble();
                            acctBal = acct - acctAddMinus;
                            System.out.println("Your new account balance is $" + acctBal);
                            scan.nextLine();
                        } else {
                            System.out.println("Not even a number pal");
                        }
                    } else if (continueWD.equals("D")) {
                        System.out.println("How much would you like to deposit?");
                        if (scan.hasNextDouble()) {
                            acctAddMinus = scan.nextDouble();
                            acctBal = acct + acctAddMinus;
                            System.out.println("Your new account balance is $" + acctBal);
                            scan.nextLine();
                        } else {
                            System.out.println("Not even a number pal");
                        }
                    } else {
                        System.out.println("Not even close buddy");
                    }
                } else {
                    System.out.println("Not even a yes or no!!!!!");
                }
            } while (!done);
        } else {
            System.out.println("That's not a balance!!!!!");
        }
    }
}
