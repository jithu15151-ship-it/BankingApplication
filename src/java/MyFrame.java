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
        add(pin);
        add(TPin);
        pin.setBounds(110, 150, 70, 30);
        // submit
        add(submit);
        submit.setBounds(175, 200, 80, 25);
        submit.addActionListener(e -> {
            String name1 = tName.getText();
            String phno = PhoneNumber.getText();
            String setPin = new String(TPin.getPassword());
            if(name1.isEmpty()||phno.isEmpty()||setPin.isEmpty()){
                JOptionPane.showMessageDialog(this, "Fill  the all the details !");
                return ;
            }
            System.out.println(name1 + "  " + phno);
        });
        // clear
        add(clear);
        clear.addActionListener(e -> {

            tName.setText(null);
            PhoneNumber.setText(null);
            TPin.setText(null);
        });
        clear.setBounds(280, 200, 70, 25);
        // window operations
        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
