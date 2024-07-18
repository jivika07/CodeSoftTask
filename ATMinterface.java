import java.util.*;

    class BankAccount
    {
        private double balance;
        public BankAccount(double initialBalance){
            this.balance=initialBalance;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("Deposit successful. New Balance: "+balance);

            }
            else{
                System.out.println("Invalid Amount Detected");

            }
        }
        public void withdraw(double amount){
            if(amount>0 && amount<=balance){
                balance-=amount;
                System.out.println("Withdrawal Successful. New Balance: "+balance);
                
            }
            else{
                System.out.println("Invalid Amount Detected or Insufficient fund for withdrawal.");
            }
        }
    }
    class ATM{
        private BankAccount account;
        private Scanner sc;
        public ATM(BankAccount account){
            this.account=account;
            this.sc=new Scanner(System.in);

        }
        public void showMenu(){
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawal");
            System.out.println("4.Exit");
        }
        public void run(){
            int choice;
            do{
                showMenu();
                System.out.println("Enter your choice: ");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        System.out.println("Thank YOU for using ATM");
                        break;
                    default:
                        System.out.println("Invalid choice.Please select a valid option.");


                }
            }while (choice!=4);

        }
        private void checkBalance(){
            System.out.println("Your Current balance is: "+account.getBalance());

        }
        private void deposit(){
            System.out.println("Enter the amount to deposit: ");
            double amount= sc.nextDouble();
            account.deposit(amount);
        } 
        private void withdraw(){
            System.out.println("Enter amount to withraw");
            double amount=sc.nextDouble();
            account.withdraw(amount);
        }

    }
    public class ATMinterface {
        public static void main(String[] args){
            System.out.println("Welcome to the ATM!");
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter your four Digit PIN: ");
            int enteredPin=scanner.nextInt();
            BankAccount userAccount=new BankAccount(1000.0);
            ATM atm=new ATM(userAccount);
            atm.run();
        }


}
