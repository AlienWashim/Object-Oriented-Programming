
package converter;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Conv_Tem extends JFrame {
	
	public Conv_Tem () {
		
		super ("CONVERTER");
                
		setLayout (new FlowLayout ());
		JPanel panel=new JPanel();
                add(panel);
		JLabel l = new JLabel ();
		add (l);
                 JButton button=new JButton();
                 panel.add(button);
                 button.setText("Test");
		
                
                JButton conCelToFah = new JButton ("Convert Celsius to Fahrenheit");
		add (conCelToFah);
                conCelToFah.addActionListener((ActionListener) this);
                
	}
		public void actionPerformed(ActionEvent event) {
                    String input=event.getActionCommand();
                    //System.out.println(event);
			if ("Test".equals(input)){
			JTextField tf = new JTextField (10);
                        add(tf);
                        tf.setText("Done");
			} // end if statement
			
		}
}