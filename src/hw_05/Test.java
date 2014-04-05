package hw_05;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorPanels extends JFrame {
	
	double secondInteger;
	int mode;
	
	
	JTextField txt = new JTextField(16);
	
	private JButton jbtDigit0 = new JButton("0");
	private JButton jbtDigit00 = new JButton("00");
	private JButton jbtDigit0000 = new JButton("0000");
	private JButton jbtDigit1 = new JButton("1");
	private JButton jbtDigit2 = new JButton("2");
	private JButton jbtDigit3 = new JButton("3");
	private JButton jbtDigit4 = new JButton("4");
	private JButton jbtDigit5 = new JButton("5");
	private JButton jbtDigit6 = new JButton("6");
	private JButton jbtDigit7 = new JButton("7");
	private JButton jbtDigit8 = new JButton("8");
	private JButton jbtDigit9 = new JButton("9");
	
	private JButton jbtPlus = new JButton("+"); 
	private JButton jbtMinus = new JButton("-"); 
	private JButton jbtCross = new JButton("x"); 
	private JButton jbtDevide = new JButton("/"); 
	private JButton jbtEqual = new JButton("=");
	private JButton jbtSin = new JButton("Sin");
	private JButton jbtCos = new JButton("Cos");
	private JButton jbtTan = new JButton("Tan");
	private JButton jbtLog = new JButton("Log");
	private JButton jbtClear = new JButton("C"); 
	
	public CalculatorPanels(){
		
		secondInteger = 0;
		mode = 1;
		
		JPanel panel1 = new JPanel(new GridLayout(4,3));
		
		panel1.setForeground(new Color(100,1,1));
		
		panel1.add(jbtDigit1);
		panel1.add(jbtDigit2);
		panel1.add(jbtDigit3);
		panel1.add(jbtDigit4);
		panel1.add(jbtDigit5);
		panel1.add(jbtDigit6);
		panel1.add(jbtDigit7);
		panel1.add(jbtDigit8);
		panel1.add(jbtDigit9);
		panel1.add(jbtDigit0);
		panel1.add(jbtDigit00);
		panel1.add(jbtDigit0000);
		
		add(panel1);
		
		JPanel panel3 = new JPanel(new GridLayout(5,2));
		panel3.add(jbtPlus);
		panel3.add(jbtMinus);
		panel3.add(jbtCross);
		panel3.add(jbtDevide);
		panel3.add(jbtEqual);
		panel3.add(jbtSin);
		panel3.add(jbtCos);
		panel3.add(jbtTan);
		panel3.add(jbtLog);
		panel3.add(jbtClear);
		
		add(panel3);
		
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(txt,BorderLayout.NORTH);
		panel2.add(panel1,BorderLayout.WEST);
		panel2.add(panel3,BorderLayout.EAST);
		
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEditable(false);
		
		add(panel2);
		
		ButtonListener listener = new ButtonListener();
		
		jbtDigit1.addActionListener(listener);
		jbtDigit2.addActionListener(listener);
		jbtDigit3.addActionListener(listener);
		jbtDigit4.addActionListener(listener);
		jbtDigit5.addActionListener(listener);
		jbtDigit6.addActionListener(listener);
		jbtDigit7.addActionListener(listener);
		jbtDigit8.addActionListener(listener);
		jbtDigit9.addActionListener(listener);
		jbtDigit0.addActionListener(listener);
		jbtDigit00.addActionListener(listener);
		jbtDigit0000.addActionListener(listener);
		
		jbtPlus.addActionListener(listener);
		jbtMinus.addActionListener(listener);
		jbtCross.addActionListener(listener);
		jbtDevide.addActionListener(listener);
		jbtSin.addActionListener(listener);
		jbtCos.addActionListener(listener);
		jbtTan.addActionListener(listener);
		jbtLog.addActionListener(listener);
		jbtEqual.addActionListener(listener);
		jbtClear.addActionListener(listener);
	}
	
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtDigit1)
				txt.setText(txt.getText()+"1");
			if(e.getSource() == jbtDigit2)
				txt.setText(txt.getText()+"2");
			if(e.getSource() == jbtDigit3)
				txt.setText(txt.getText()+"3");
			if(e.getSource() == jbtDigit4)
				txt.setText(txt.getText()+"4");
			if(e.getSource() == jbtDigit5)
				txt.setText(txt.getText()+"5");
			if(e.getSource() == jbtDigit6)
				txt.setText(txt.getText()+"6");
			if(e.getSource() == jbtDigit7)
				txt.setText(txt.getText()+"7");
			if(e.getSource() == jbtDigit8)
				txt.setText(txt.getText()+"8");
			if(e.getSource() == jbtDigit9)
				txt.setText(txt.getText()+"9");
			if(e.getSource() == jbtDigit0)
				txt.setText(txt.getText()+"0");
			if(e.getSource() == jbtDigit00)
				txt.setText(txt.getText()+"00");
			if(e.getSource() == jbtDigit0000)
				txt.setText(txt.getText()+"0000");
			
			if(e.getSource() == jbtPlus){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 0;
			}
			if(e.getSource() == jbtMinus){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 1;
			}
			if(e.getSource() == jbtCross){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 2;
			}
			if(e.getSource() == jbtDevide){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 3;
			}
			if(e.getSource() == jbtEqual){
				double ans = 0;
				if(mode == 0)
					ans = secondInteger + Double.parseDouble(txt.getText());
				else if(mode == 1)
					ans = secondInteger - Double.parseDouble(txt.getText());
				else if(mode == 2)
					ans = secondInteger * Double.parseDouble(txt.getText());
				else if(mode == 3){
					ans = secondInteger / Double.parseDouble(txt.getText());
				}
				
				
					txt.setText(String.format("%.2f",ans));
					mode = -1;
				
			}
			if(e.getSource() == jbtSin){
				double ans = 0;
				ans = Math.sin(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			if(e.getSource() == jbtCos){
				double ans = 0;
				ans = Math.cos(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			if(e.getSource() == jbtTan){
				double ans = 0;
				ans = Math.tan(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			if(e.getSource() == jbtLog){
				double ans = 0;
				ans = Math.log10(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
		
			
			if(e.getSource() == jbtClear){
				txt.setText("");
				mode = -1;
			}
		
			
				
		}
	}
		
	public static void main(String[] args){
		
		JFrame frame2 = new CalculatorPanels();
		frame2.setTitle("Calculator");
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.pack();
		frame2.setVisible(true);
		
		}
}
	
