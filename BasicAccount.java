public class BasicAccount extends BankAccount{
    public void withdraws(double amount)
    {
        if(amount<=balance)
        {
            super.withdraws(amount);
        }
        else
            super.withdraws(amount+30);
            System.out.println("Sorry you withdraw more than you have ");

    }
}
