
public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.setAccount_balance(2000);
        acc1.setAccount_number(0001);
        acc1.setCustomer_name("Ixia Brigette Tan");
        acc1.setEmail("ixiatan@gmail.com");
        acc1.setPhone_number(9142);

        System.out.println(acc1.toString());

        acc1.deposit(1000);
        System.out.println(acc1.toString());

        acc1.withdraw(1000);
        System.out.println(acc1.toString());

        acc1.withdraw(2000);
        System.out.println(acc1.toString());


    }
}