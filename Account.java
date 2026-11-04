public class Account {
    private int pin;
    private String name;
    private final StringBuilder accountNumber = new StringBuilder("000");
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
    public StringBuilder getAccountNumber() {
        return accountNumber;
    }
    
}