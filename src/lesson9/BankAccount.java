package lesson9;
//полное название класса lesson9
class BankAccount {
    public BankAccount() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public BankAccount(long id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    private long id;
    private String name;
    private long balance;

//    @Override
//    public String toString() {
//        return "BankAccount{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
}

//Название файла должнобыть совпадающим с паблик классом
class TestBankAccount{

    public static void main(String[] args){
        BankAccount myBankAccount = new BankAccount();
        BankAccount yourBankAccount = new BankAccount();
        BankAccount hisBankAccount = new BankAccount();


        myBankAccount.setBalance(300);
        myBankAccount.setId(1);
        myBankAccount.setName("Зеленый аккаунт");

         yourBankAccount = myBankAccount;
        System.out.println(yourBankAccount);
        System.out.println(myBankAccount);
    }


}

//stack and hip memory objects
//runtime compiletime
//java virtual machine

//class
//paket
//import
//name and declaration
//varialbles state metod consructor
//comments

//inicialization string
//private String name = "dadsdaf";
//private String name = new String ("dsfsdfsf");

//konkatonacia