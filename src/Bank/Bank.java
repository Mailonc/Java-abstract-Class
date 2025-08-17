package Bank;

public class Bank {
    String accountNumber;
    String customerName;

    double loanAmount() {
        return  5000.0 - 0.30 * 5000.0; // 30% interest on loan
    }

    double interestRate() {
        return 5000.0 * 0.05; // 5% interest rate on loan
    }

    double accountBalance() {
        return 5000.0 + interestRate(); // Initial balance + interest
    }
    class AccountDetails {
        String accountType;
        String branchName;

        String getAccountType() {
            return accountType;
        }

        String getBranchName() {
            return branchName;
        }

        double calculateTotalBalance() {
            return accountBalance() + loanAmount();
        }
    }
}
class main {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.accountNumber = "123456789";
        myBank.customerName = "John Doe";

        Bank.AccountDetails details = myBank.new AccountDetails();
        details.accountType = "Savings";
        details.branchName = "Main Branch";

        System.out.println("Account Number: " + myBank.accountNumber);
        System.out.println("Customer Name: " + myBank.customerName);
        System.out.println("Account Type: " + details.getAccountType());
        System.out.println("Branch Name: " + details.getBranchName());
        System.out.println("Loan Amount: $" + myBank.loanAmount());
        System.out.println("Interest Rate: $" + myBank.interestRate());
        System.out.println("Account Balance: $" + myBank.accountBalance());
        System.out.println("Total Balance (including loan): $" + details.calculateTotalBalance());



    }
}