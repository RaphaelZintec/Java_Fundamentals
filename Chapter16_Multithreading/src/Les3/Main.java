package Les3;

public class Main {
    public static void main(String[] args) {
        Bank bankrekening = new Bank();
        int jouwSalaris = 1500;
        bankrekening.addAmountPerMonth(jouwSalaris);
        int bedragRekeningen = 1500;
        bankrekening.payBills(bedragRekeningen);


        System.out.println("Status");
        System.out.println("Totaal geld "+bankrekening.getMoneyOnBankAccount());
        System.out.println("Genoeg geld aanwezig? "+bankrekening.isEnoughOnBankAccount());
    }
}
