package TestCases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TwoNumberCalc implements ActionListener {

	JFrame calF;
	JLabel firstOpr;
	JLabel secondOpr;
	JLabel ans;
	JTextField firstTf;
	JTextField secondTf;
	JTextField ansTf;
	JButton plus;
	JButton multi;
	
	public void guiCalc(){
		calF = new JFrame();
		firstOpr = new JLabel("First Operand");
		firstTf = new JTextField(12);
		secondOpr = new JLabel("Second Operand");
		secondTf = new JTextField(12);
		ans = new JLabel("Answer");
		ansTf = new JTextField(12);
		plus = new JButton("+");
		multi = new JButton("*");
		
		Container c = calF.getContentPane();
		c.setLayout(new FlowLayout());
		plus.setPreferredSize(new Dimension (70,25));
		multi.setPreferredSize(new Dimension (70,25));
		calF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calF.setSize(300,250);
		calF.setVisible(true);
		c.add(firstOpr);
		c.add(firstTf);
		c.add(secondOpr);
		c.add(secondTf);
		c.add(plus);
		c.add(multi);
		c.add(ans);
		c.add(ansTf);
		
//		ButtonHandler bh = new ButtonHandler();
		plus.addActionListener(this);
		multi.addActionListener(this);                        // registering window and button handler with their listener
		WindowHandler wh = new WindowHandler();
		calF.addWindowListener(wh);
	}
	
	public TwoNumberCalc(){
		guiCalc();
	}



	private class WindowHandler extends WindowAdapter{
		public void windowClosing (WindowEvent we){
			JOptionPane.showMessageDialog(null, "Thanks for using this Calculator");
			System.exit(0);
		}
	}

		public void actionPerformed(ActionEvent e) {
			String operator, result;
			int num1, num2, res;
			
			if (e.getSource()==firstOpr){
				operator = firstTf.getText();
				num1= Integer.parseInt(operator);
				operator =  secondTf.getText();
				num2 = Integer.parseInt(operator);
				res= num1+num2;
				result = res+"";
				ansTf.setText(result);
				
				
				
			}
			else if (e.getSource()==firstTf){
				operator = firstTf.getText();
				num1= Integer.parseInt(operator);
				operator =  secondTf.getText();
				num2 = Integer.parseInt(operator);
				res= num1*num2;
				result = res+"";
				ansTf.setText(result);
				
			}

			}

	
	public static void main(String args[]){
		TwoNumberCalc tnc = new TwoNumberCalc();
	}
}
