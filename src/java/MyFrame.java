import javax.swing.*;
public class MyFrame extends JFrame {
    public void display() {
        // object
        final JLabel h1 = new JLabel("State bank of India");
        final JLabel h2 = new JLabel("Register here");
        final JLabel name = new JLabel("Name");
        final JLabel PhNumber = new JLabel("PH No");
        final JLabel pin = new JLabel("Pin");
        final JTextField tName = new JTextField();
        final JTextField PhoneNumber = new JTextField();
        final JPasswordField TPin = new JPasswordField();
        final JPasswordField reEnterPin = new JPasswordField();
        final JLabel reEnter = new JLabel("Re-Enter");
        final JButton submit = new JButton("Submit");
        final JButton clear = new JButton("Clear");
        // headings........
        add(h1);
        add(h2);
        h1.setBounds(210, 10, 130, 30);
        h2.setBounds(220, 30, 130, 30);
        // Name........
        add(tName);
        name.setBounds(110, 70, 70, 30);
        tName.setBounds(170, 70, 200, 30);
        // phone number......
        add(PhNumber);
        add(PhoneNumber);
        add(name);
        PhNumber.setBounds(110, 110, 70, 30);
        PhoneNumber.setBounds(170, 110, 200, 30);
        // pin
        TPin.setBounds(170, 150, 200, 30);
        pin.setBounds(110, 150, 70, 30);
        reEnter.setBounds(110,190,70,30);
        reEnterPin.setBounds(170, 190, 200, 30);
        add(pin);
        add(TPin);
        add(reEnter);
        add(reEnterPin);
        // submit
        add(submit);
        JRootPane rp = this.getRootPane();
        rp.setDefaultButton(submit);
        submit.setBounds(175, 240, 80, 25);
        submit.addActionListener(e -> {
            AccountDAO ad = new AccountDAO();
            String name1 = tName.getText().trim();
            String phno = PhoneNumber.getText().trim();
            String setPin = new String(TPin.getPassword());
            String repin = new String(reEnterPin.getPassword());
            
            if(name1.isEmpty()||phno.isEmpty()||setPin.isEmpty()||repin.isEmpty()){
                JOptionPane.showMessageDialog(this, "Fill  the all the details !");
                return ;
            }
            else if(!setPin.equals(repin)){
                JOptionPane.showMessageDialog(this,"Re Enter password not match");
                return ;
            }
            boolean result = ad.registerAccount(name1, phno, setPin);
            if(result){
                JOptionPane.showMessageDialog(this, "Registraion Successfull");
                tName.setText("");
                PhoneNumber.setText("");
                TPin.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Registarion Failed");
            }
        });
        // clear
        add(clear);
        clear.addActionListener(e -> {

            tName.setText(null);
            PhoneNumber.setText(null);
            TPin.setText(null);
        });
        clear.setBounds(280, 240, 70, 25);
        // window operations
        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
