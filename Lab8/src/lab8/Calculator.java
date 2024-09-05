
package lab8;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    String current,first,last,rem;
            double result;
    
    Calculator(){
    super("Calculator");
    current="";
        first="";
        last="";
        rem="";
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JPanel panel=new JPanel();
    panel.setLayout(new GridLayout(3,5));
        setContentPane(panel);

        JButton[] numberlist=new JButton[10];
        
        for(int i=0;i<10;i++){
           numberlist[i]=new JButton(""+i);
           panel.add(numberlist[i]);
           numberlist[i].addActionListener(this);
           
        }
        
        JButton plus=new JButton("+");
        plus.addActionListener(this);
        
        JButton minus=new JButton("-");
        minus.addActionListener(this);
        
        JButton Multi=new JButton("*");
        Multi.addActionListener(this);
        
        JButton Dev=new JButton("/");
        Dev.addActionListener(this);
        
        JButton equal=new JButton("=");
        equal.addActionListener(this);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(Multi);
        panel.add(Dev);
        panel.add(equal);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        char input=s.charAt(0);
        if(input>='0' && input<='9'){
            current=current+input;
            System.out.print(input);
        }
        else if(input=='+'){
            first=first+current;
            current="";
            System.out.print(input);
            rem="+";
        }
        else if(input=='-'){
            first=current;
            current="";
            System.out.print(input);
            rem="-";
        }
        else if(input=='*'){
            first=current;
            current="";
            System.out.print(input);
            rem="*";
        }
        else if(input=='/'){
            first=current;
            current="";
            System.out.print(input);
            rem="/";
        }
        else if(input=='='){
            if("+".equals(rem)){
             result= (Double) (Double.parseDouble(first)+Double.parseDouble(current));
            System.out.println("="+result);
            }
            else if("-".equals(rem)){
            result= (Double) (Double.parseDouble(first)-Double.parseDouble(current));
            System.out.println("="+result);
            }
            else if("*".equals(rem)){
            result= (Double) (Double.parseDouble(first)*Double.parseDouble(current));
            System.out.println("="+result);
            }
            else if("/".equals(rem)){
            result= (Double) (Double.parseDouble(first)/Double.parseDouble(current));
            System.out.println("="+result);
            }
            first="";
            current="";
        }
    }
}
