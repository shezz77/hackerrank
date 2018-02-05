package TestCases;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SmallCalc implements ActionListener{
	JFrame saFrame;
	JLabel firstOprand, secondOperand, answer;
	JTextField op1, op2, ans;
	JButton plus, mul;
	
	public void initGUI(){
		saFrame = new JFrame();
		firstOprand = new JLabel("First Digit SA");
		secondOperand = new JLabel("Second Digit SA");
		answer = new JLabel("Answer");
		
		op1 = new JTextField(15);
		op2 = new JTextField(15);
		ans = new JTextField(15);
		
		plus = new JButton("+");
		plus.setPreferredSize(new Dimension(70,25) );
		
		mul = new JButton("*");
		mul.setPreferredSize(new Dimension(70,25));
		
		Container c = saFrame.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(firstOprand);
		c.add(op1);
		c.add(secondOperand);
		c.add(op2);
		c.add(plus);
		c.add(mul);
		c.add(answer);
		c.add(ans);
		
		plus.addActionListener(this);
		mul.addActionListener(this);
		
		saFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saFrame.setSize(200, 220);
		saFrame.setVisible(true);
	}
	
	public SmallCalc(){
		initGUI();
	}
	
	public void actionPerformed(ActionEvent event){
		String operand, result;
		int num1, num2, res;
		
		if(event.getSource() == plus){
			operand = op1.getText();
			num1 = Integer.parseInt(operand);
			
			operand = op2.getText();
			num2 = Integer.parseInt(operand);
			
			res = num1 + num2;
			result = res+"";
			ans.setText(result);
		}else if(event.getSource() == mul){
			operand = op1.getText();
			num1 = Integer.parseInt(operand);
			
			operand = op2.getText();
			num2 = Integer.parseInt(operand);
			
			res = num1 * num2;
			result = res+"";
			ans.setText(result);
		}
		
	}
	
	public static void main(String [] args){
		SmallCalc SC = new SmallCalc();
	}
}