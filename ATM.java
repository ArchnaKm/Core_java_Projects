import java.util.Scanner;

public class ATM {

    public static void main(String args[]) {
        int debit, credit, balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("select option 1 for debit");
        System.out.println("select option 2 for credit");
        System.out.println("select option 3 for bnalans");
        System.out.println("select option 4 for exit");
        System.out.println("select option an option");
        int s = sc.nextInt();
        switch (s) {
            case 1:
                System.out.println("amount to debit:");
                debit = sc.nextInt();
                if (debit < balance) {
                    balance = balance - debit;
                    System.out.println("amount debited cuccesfully");
                } else {
                    System.out.println("in sufficient balance");
                }
                break;
            case 2:
                System.out.println("enter amount to be credit");
                credit = sc.nextInt();
                balance = balance + credit;
            case 3:
                System.out.println(balance);
                break;
            case 4:
                System.out.println("taransantion completed succesfull");
                System.exit(0);
        }
        System.out.println("option completed");

    }

}
