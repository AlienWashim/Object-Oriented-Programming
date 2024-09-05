package section6;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CGPA_Calculator extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,result1;
    double total=0,total_credit=0;
            float result=0;
            String[] array_name = new String[6];
            
            int i=0;
            
    
    CGPA_Calculator(){
        super("CGPA Calculator by Washim Akram");
        
        setSize(900,600);
        JPanel panel=new JPanel(new GridLayout(7,2,0,0));
        add(panel);
        
        JLabel label1 = new JLabel ("Course-1 name");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label1);
        tf1=new JTextField(6);
        tf1.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf1);
        
        JLabel label2 = new JLabel ("Course-1 grade");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label2);
        tf2=new JTextField(6);
        tf2.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf2);
        
        
        JLabel label3 = new JLabel ("Course-1 credit");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label3);
        tf3=new JTextField(6);
        tf3.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf3);
        
        JLabel label4 = new JLabel ("Course-2 name");
        label4.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label4);
        tf4=new JTextField(6);
        tf4.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf4);
        
        JLabel label5 = new JLabel ("Course-2 grade");
        label5.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label5);
        tf5=new JTextField(6);
        tf5.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf5);
        
        
        JLabel label6 = new JLabel ("Course-2 credit");
        label6.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label6);
        tf6=new JTextField(6);
        tf6.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf6);
        
        JLabel label7 = new JLabel ("Course-3 name");
        label7.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label7);
        tf7=new JTextField(6);
        tf7.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf7);
        
        JLabel label8 = new JLabel ("Course-3 grade");
        label8.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label8);
        tf8=new JTextField(6);
        tf8.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf8);
        
        
        JLabel label9 = new JLabel ("Course-3 credit");
        label9.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label9);
        tf9=new JTextField(6);
        tf9.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf9);
        
        JLabel label10 = new JLabel ("Course-4 name");
        label10.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label10);
        tf10=new JTextField(6);
        tf10.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf10);
        
        JLabel label11 = new JLabel ("Course-4 grade");
        label11.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label11);
        tf11=new JTextField(6);
        tf11.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf11);
        
        
        JLabel label12 = new JLabel ("Course-4 credit");
        label12.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label12);
        tf12=new JTextField(6);
        tf12.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf12);
        
        JLabel label13 = new JLabel ("Course-5 name");
        label13.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label13);
        tf13=new JTextField(6);
        tf13.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf13);
        
        JLabel label14 = new JLabel ("Course-5 grade");
        label14.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label14);
        tf14=new JTextField(6);
        tf14.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf14);
        
        
        JLabel label15 = new JLabel ("Course-5 credit");
        label15.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label15);
        tf15=new JTextField(6);
        tf15.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf15);
        
        JLabel label16 = new JLabel ("Course-6 name");
        label16.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label16);
        tf16=new JTextField(6);
        tf16.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf16);
        
        JLabel label17 = new JLabel ("Course-6 grade");
        label17.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label17);
        tf17=new JTextField(6);
        tf17.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf17);
        
        
        JLabel label18 = new JLabel ("Course-6 credit");
        label18.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label18);
        tf18=new JTextField(6);
        tf18.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(tf18);
        
        JLabel label = new JLabel ("Your CGPA:");
        label.setFont(new Font("Times New Roman", Font.BOLD, 22));
	panel.add(label);
        result1=new JTextField(6);
        result1.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(result1);
        
        JButton button=new JButton("Calculate");
        button.setLocation(500, 400);
        button.setFont(new Font("Times New Roman", Font.BOLD, 24));
        button.setForeground(Color.cyan);
        button.setBackground(Color.RED);
        panel.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent input) {
        String click=input.getActionCommand();
        //System.out.println(click);
        if("Add".equals(click)){
            total=total+(Double.parseDouble(tf2.getText())*Double.parseDouble(tf3.getText()));
            total_credit = total_credit+(Double.parseDouble(tf3.getText()));
            //System.out.println(result);
            //System.out.println(Double.parseDouble(tf.getText()));
            array_name[i]=tf1.getText();
            //System.out.println(tf1.getText());
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        else if("Calculate".equals(click)){
            total_credit =(Double.parseDouble(tf3.getText())+Double.parseDouble(tf6.getText())+Double.parseDouble(tf9.getText())+Double.parseDouble(tf12.getText())+Double.parseDouble(tf15.getText())+Double.parseDouble(tf18.getText()));
            total=((Double.parseDouble(tf2.getText())*Double.parseDouble(tf3.getText()))+(Double.parseDouble(tf5.getText())*Double.parseDouble(tf6.getText()))+(Double.parseDouble(tf8.getText())*Double.parseDouble(tf9.getText()))+(Double.parseDouble(tf11.getText())*Double.parseDouble(tf12.getText()))+(Double.parseDouble(tf14.getText())*Double.parseDouble(tf15.getText()))+(Double.parseDouble(tf17.getText())*Double.parseDouble(tf18.getText())));
            result =(float) (total/total_credit);
            result1.setText(result+"");
            result1.setFont(new Font("Times New Roman", Font.BOLD, 12));
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
            tf13.setText("");
            tf14.setText("");
            tf15.setText("");
            tf16.setText("");
            tf17.setText("");
            tf18.setText("");
        }
    }
    
}
