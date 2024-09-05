package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Converter extends JFrame implements ActionListener {
    JTextField tf,result1;
    Converter(){
        super("Converter by Washim Akram");
        setSize(500,600);
        
        JPanel panel=new JPanel(new GridLayout(0, 1, 2, 2));
        add(panel);
        
        //JLabel label = new JLabel ();
        //label.setFont(new Font("Times New Roman", Font.BOLD, 28));
	//panel.add(label);
        tf=new JTextField(10);
        tf.setFont(new Font("Times New Roman", Font.BOLD, 28));
        result1=new JTextField(8);
        panel.add(tf);
        panel.add(result1);
        
        JButton button=new JButton("Convert Celsious to Fahrenheit");
        button.setFont(new Font("Times New Roman", Font.BOLD, 24));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.darkGray);
        //button.setBounds(10,20,2,2);
        panel.add(button);
        button.addActionListener(this);
        
        //JLabel label2 = new JLabel ();
        //label2.setFont(new Font("Times New Roman", Font.BOLD, 28));
	//panel.add(label2);
        //tf2=new JTextField(10);
        //tf2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        //result2=new JTextField(8);
        //panel.add(tf2);
        //panel.add(result2);
        
        JButton button2=new JButton("Convert Pounds to Kilograms");
        button2.setFont(new Font("Times New Roman", Font.BOLD, 24));
        button2.setForeground(Color.GREEN);
        button2.setBackground(Color.darkGray);
        panel.add(button2);
        button2.addActionListener(this);
        
        //JLabel label3 = new JLabel ();
        //label3.setFont(new Font("Times New Roman", Font.BOLD, 28));
	//panel.add(label3);
        //tf3=new JTextField(10);
        //tf3.setFont(new Font("Times New Roman", Font.BOLD, 28));
        //result3=new JTextField(8);
        //panel.add(tf3);
        //panel.add(result3);
        
        JButton button3=new JButton("Convert Centimeters to Inches");
        button3.setFont(new Font("Times New Roman", Font.BOLD, 24));
        button3.setForeground(Color.GREEN);
        button3.setBackground(Color.darkGray);
        panel.add(button3);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent input) {
        String click=input.getActionCommand();
        //System.out.println(click);
        if("Convert Celsious to Fahrenheit".equals(click)){
            float result = (float) (((9.0/5.0)*Double.parseDouble(tf.getText()))+32);
            //System.out.println(result);
            //System.out.println(Double.parseDouble(tf.getText()));
            result1.setText(result+" °F");
            result1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        }
        else if("Convert Pounds to Kilograms".equals(click)){
            float result = (float) ((Double.parseDouble(tf.getText()))/2.205);
            //System.out.println(result);
            //System.out.println(Double.parseDouble(tf.getText()));
            result1.setText(result+" kg");
            result1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        }
        else if("Convert Centimeters to Inches".equals(click)){
            float result = (float) ((Double.parseDouble(tf.getText()))/2.54);
            //System.out.println(result);
            //System.out.println(Double.parseDouble(tf.getText()));
            result1.setText(result+" inch");
            result1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        }
    }
    
}
