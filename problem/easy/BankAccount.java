package problem.easy;

public class BankAccount {
    public String bankName;
    public String ownerName;
    public int savings;

    BankAccount(String bankName, String ownerName, int savings) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.savings = savings;
    }

    public int depositMoney(int depositAmount) {
        if (savings <= 20000) {
            savings -= 100;
        }

        savings += depositAmount;

        return savings;
    }

    public int withdrawMoney(int withdrawAmount) {
        var maxWithdrawAmount = calcMaxWithdrawAmount();

        if (withdrawAmount >= maxWithdrawAmount) {
            return savings -= (int) maxWithdrawAmount;
        }

        return savings -= withdrawAmount;
    }

    public double pastime(int days) {
        return savings + (days * 0.25);
    }

    private double calcMaxWithdrawAmount() {
        return savings * 0.2;
    }

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Chase", "Claire Simmmons", 30000);
        System.out.println(user1.withdrawMoney(2000)); // 28000
        System.out.println(user1.depositMoney(10000)); // 38000
        System.out.println(user1.pastime(93)); // 38023.25

        BankAccount user2 = new BankAccount("Bank Of America", "Remy Clay", 10000);
        System.out.println(user2.withdrawMoney(5000)); // 8000
        System.out.println(user2.depositMoney(12000)); // 19900
        System.out.println(user2.pastime(505)); // 20026.25
    }
}
