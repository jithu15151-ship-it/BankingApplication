import javax.swing.*;
public class MyFrame extends JFrame{
    public void display(){
        //object
        
         final JLabel h1 = new JLabel("State bank of India");
         final JLabel h2 = new JLabel("Register here");
         final JLabel name = new JLabel("Name");
         final JLabel PhNumber = new JLabel("PH No");
         final JLabel pin = new JLabel("Pin");
         final JTextField tName = new JTextField();
         final JTextField PhoneNumber = new JTextField();
         final JTextField TPin = new JTextField();
         final JButton submit = new JButton("Submit");
        final JButton clear = new JButton("Clear");
        //headings........
        add(h1);
        add(h2);
        h1.setBounds(210, 10, 130, 30);
        h2.setBounds(220, 30, 130, 30);
        //Name........
        add(name);
        add(tName);
        name.setBounds( 110 , 70, 70, 30);
        tName.setBounds( 170, 70, 200, 30);
        //phone number......
        add(PhNumber);
        add(PhoneNumber);
        PhNumber.setBounds(110, 110, 70, 30);
        PhoneNumber.setBounds( 170, 110, 200, 30);
        //pin
        add(pin);
        add(TPin);
        pin.setBounds(110, 150, 70, 30);
        TPin.setBounds(170, 150, 200, 30);
        //submit 
        add(submit);
        submit.setBounds(175, 200, 80, 25);
        //clear
        add(clear);
        clear.setBounds(280, 200, 70, 25);
        //window operations
        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
