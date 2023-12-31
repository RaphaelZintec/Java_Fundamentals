package Les3;

public class Bank {
    private boolean enoughOnBankAccount = false;
    private int moneyOnBankAccount = 1000;

    public boolean isEnoughOnBankAccount() {
        return enoughOnBankAccount;
    }

    public void setEnoughOnBankAccount(boolean enoughOnBankAccount) {
        this.enoughOnBankAccount = enoughOnBankAccount;
    }

    public int getMoneyOnBankAccount() {
        return moneyOnBankAccount;
    }

    public void setMoneyOnBankAccount(int moneyOnBankAccount) {
        this.moneyOnBankAccount = moneyOnBankAccount;
    }

    public synchronized void addAmountPerMonth(int yourPay){
        moneyOnBankAccount += yourPay;
        if(moneyOnBankAccount > 3000){
            enoughOnBankAccount = true;
        }
        notify();
    }

    public synchronized void payBills(int amountBills){
        while(!enoughOnBankAccount){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            moneyOnBankAccount -= amountBills;
            notify();
        }
    }

    public synchronized void payBills2(int amountBills){
        while(!enoughOnBankAccount){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            moneyOnBankAccount -= amountBills;
            notify();
        }
    }


}
