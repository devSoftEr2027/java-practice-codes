package in.practice.Usepackage;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber , String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void depositMoney(double money){
        if(money > 0){
            balance +=  money;
        } else {
            System.out.println (" Invalid Deposit");
        }
    }

    public double withdrawMoney( double money){
        if(money <= 0 ){
            System.out.println ( " Invalid Withdrawl");
        }else if(money <= balance){
            balance -= money;
        }else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
