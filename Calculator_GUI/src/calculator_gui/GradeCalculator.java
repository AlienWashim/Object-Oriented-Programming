
package calculator_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class GradeCalculator extends JFrame
{

	JLabel gradeJLabel;
	JTextField gradeJTextField;

	JLabel clickstartJLabel;

	JButton enterJButton;
	JButton clearJButton;
	JButton closeJButton;

	JTextField comentaryJTextField;


	String testscores;
	int numberOfScores;
	double priceValues;
	int grade;
	int counter;
	int gradeAccumulator;


   	public GradeCalculator()
   	{
      		createUserInterface();
   	}

   	public void createUserInterface()
   	{
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		gradeJLabel = new JLabel();
		gradeJLabel.setBounds(50, 50, 150, 20);
		gradeJLabel.setFont(new Font("Default", Font.PLAIN, 12));
		gradeJLabel.setText("Grade:");
		gradeJLabel.setForeground(Color.BLACK);
		gradeJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(gradeJLabel);

		gradeJTextField = new JTextField();
		gradeJTextField.setBounds(200, 50, 50, 20);
		gradeJTextField.setFont(new Font("Default", Font.PLAIN, 12));
		gradeJTextField.setHorizontalAlignment(JTextField.CENTER);
		gradeJTextField.setForeground(Color.BLACK);
		gradeJTextField.setBackground(Color.WHITE);
		gradeJTextField.setEditable(false);
		contentPane.add(gradeJTextField);

		comentaryJTextField = new JTextField();
		comentaryJTextField.setBounds(200, 100, 50, 20);
		comentaryJTextField.setFont(new Font("Default", Font.PLAIN, 12));
		comentaryJTextField.setHorizontalAlignment(JTextField.CENTER);
		comentaryJTextField.setForeground(Color.BLACK);
		comentaryJTextField.setBackground(Color.WHITE);
		comentaryJTextField.setEditable(false);
		contentPane.add(comentaryJTextField);

		clickstartJLabel = new JLabel();
		clickstartJLabel.setBounds(100, 200, 150, 20);
		clickstartJLabel.setFont(new Font("Default", Font.PLAIN, 12));
		clickstartJLabel.setText("Click Start to Begin!");
		clickstartJLabel.setForeground(Color.BLACK);
		clickstartJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(clickstartJLabel);

		enterJButton = new JButton();
		enterJButton.setBounds(20, 300, 100, 20);
		enterJButton.setFont(new Font("Default", Font.PLAIN, 12));
		enterJButton.setText("Enter");
		enterJButton.setForeground(Color.BLACK);
		enterJButton.setBackground(Color.WHITE);
		contentPane.add(enterJButton);
		enterJButton.addActionListener(

			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					enterJButtonActionPerformed(event);
				}
			}
		);

		clearJButton = new JButton();
		clearJButton.setBounds(140, 300, 100, 20);
		clearJButton.setFont(new Font("Default", Font.PLAIN, 12));
		clearJButton.setText("Clear");
		clearJButton.setForeground(Color.BLACK);
		clearJButton.setBackground(Color.WHITE);
		contentPane.add(clearJButton);
		clearJButton.addActionListener(

			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					clearJButtonActionPerformed(event);
				}
			}
		);

		closeJButton = new JButton();
		closeJButton.setBounds(260, 300, 100, 20);
		closeJButton.setFont(new Font("Default", Font.PLAIN, 12));
		closeJButton.setText("Close");
		closeJButton.setForeground(Color.BLACK);
		closeJButton.setBackground(Color.WHITE);
		contentPane.add(closeJButton);
		closeJButton.addActionListener(

			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					closeJButtonActionPerformed(event);
				}
			}
		);


		setTitle("Grade Calculator");
		setSize(400, 400);
		setVisible(true);
   	}

   	/* main method */
   	public static void main(String[] args)
   	{
      		GradeCalculator application = new GradeCalculator();
      		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	}

   	public void enterJButtonActionPerformed(ActionEvent event)
	{
		getnumberoftests();
	}

	public void getnumberoftests()
		{
			testscores = JOptionPane.showInputDialog("Enter Number of Grades");
			numberOfScores = Integer.parseInt(testscores);
			gettestscores();
	}

	public void gettestscores()
	{
		for(counter = 0; counter < numberOfScores; counter++)
		{
			testscores = JOptionPane.showInputDialog("Enter Scores");
			priceValues = Integer.parseInt(testscores);
			gradeAccumulator += priceValues;
		}

		calculateAverage();
	}

	public void calculateAverage()
	{
				grade = gradeAccumulator / numberOfScores;
	}


	 public int getgrade() {
	        return gradeAccumulator / numberOfScores;
    }

    public void checkgrade()
	{

	if(grade < 64)
		   	{
		   		comentaryJTextField.setText("F");
		   	}
			 else if(grade < 69)
			{
				comentaryJTextField.setText("D");

		   	}
		   	 else if(grade < 79)

			{
				comentaryJTextField.setText("C");

			}
			else if(grade < 89)

			{
				comentaryJTextField.setText("B");

			}

		   	else {

				comentaryJTextField.setText("A");

		   	}

   	}

	public void clearJButtonActionPerformed(ActionEvent event)
	{
		gradeJTextField.setText("");
	}

	public void closeJButtonActionPerformed(ActionEvent event)
	{
		GradeCalculator.this.dispose();
	}
}
