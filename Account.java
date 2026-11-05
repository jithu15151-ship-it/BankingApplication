public class Account {
    private int pin;
    private String name,phoneNumber;
    private static String bank = "State Bank of India";
    //construtor
    public Account(int pin, String phoneNumber, String name) {
        this.pin = pin;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
    //getter and setter started
     public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static String getBank() {
        return bank;
    }
    public static void setBank(String bank) {
        Account.bank = bank;
    }
    //getter and setter ended
    @Override 
    public String toString(){
        return this.getName()+"|"+this.getPhoneNumber();
    }
    
}