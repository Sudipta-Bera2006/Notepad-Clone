import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Calculator extends JFrame{

    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton clear,addition,subtraction,multiplication,division,module;

    Calculator(String s1){
        super(s1);
    }
    Calculator(){
    }

    void setComponents(){

        Cursor c1=new Cursor(Cursor.HAND_CURSOR);

        l1=new JLabel("Welcome to calculator page");
        l2=new JLabel("Enter 1st number");
        l3=new JLabel("Enter 2nd number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        clear=new JButton("CLEAR");
        addition=new JButton("ADDITION");
        subtraction=new JButton("MINUS");
        multiplication=new JButton("MULTIPLY");
        division=new JButton("DIVISION");
        module=new JButton("MODULO");

        clear.setCursor(c1);
        addition.setCursor(c1);
        subtraction.setCursor(c1);
        multiplication.setCursor(c1);
        division.setCursor(c1);
        module.setCursor(c1);

        clear.addActionListener(new Clear());
        addition.addActionListener(new Addition());
        subtraction.addActionListener(new Subtraction());
        multiplication.addActionListener(new Multiplication());
        division.addActionListener(new Division());
        module.addActionListener(new Module());

        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(clear);
        add(addition);
        add(subtraction);
        add(multiplication);
        add(division);
        add(module);

        l1.setBounds(170, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(200, 400, 300, 30);
        t1.setBounds(300, 200, 100, 30);
        t2.setBounds(300, 350, 100, 30);
        addition.setBounds(100,450,100,30);
        subtraction.setBounds(200, 450,100, 30);
        multiplication.setBounds(300, 450, 100, 30);
        division.setBounds(100,500,100,30);
        module.setBounds(200,500,100,30);
        clear.setBounds(300,500,100,30);
       
    }

    public static void main(String[] args) {
        Calculator c1=new Calculator("Wellcome");
        c1.setComponents();
        c1.setVisible(true);
        c1.setSize(530,600);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }
    class Addition implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            double sum=a+b;
            l4.setText("Sum is : "+sum);
        }
    }
    class Subtraction implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            double mi=a-b;
            l4.setText("Subtraction is : "+mi);
        }
    }
    class Multiplication implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            double mult=a*b;
            l4.setText("Multiplication is : "+mult);
        }
    }
    class Division implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            double div=a/b;
            l4.setText("Division is : "+div);
        }
    }
    class Module implements ActionListener{
        public void actionPerformed(ActionEvent e2){
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            double mod=a%b;
            l4.setText("Module is : "+mod);
        }
    }
}