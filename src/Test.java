
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test extends JFrame {
	
	double secondInteger;
	int mode;
	
	//create text field for input ID 
	private JTextField jftID = new JTextField();
	
	JTextField txt = new JTextField(16);
	
	//create a button  Log In button 
	private JButton jbtLogIn = new JButton("Log in");
	
	//create buttons from 0~9 , . , 00
	private JButton jbtDigit0 = new JButton("0");
	private JButton jbtDigit00 = new JButton("00");
	private JButton jbtDot = new JButton(".");
	private JButton jbtDigit1 = new JButton("1");
	private JButton jbtDigit2 = new JButton("2");
	private JButton jbtDigit3 = new JButton("3");
	private JButton jbtDigit4 = new JButton("4");
	private JButton jbtDigit5 = new JButton("5");
	private JButton jbtDigit6 = new JButton("6");
	private JButton jbtDigit7 = new JButton("7");
	private JButton jbtDigit8 = new JButton("8");
	private JButton jbtDigit9 = new JButton("9");
	
	//create buttons for plus,Minus,Cross,Devide,Equal,Sin,Cos,Tan,Log,Clear
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
	
	public Test(){
		
		//set GridLayout with horizontal gap 1 and vertical gap 1
		setLayout(new GridLayout(1,1));
		
		//add labels and text field to the frame
		add(new JLabel("ID:"));
		add(jftID);
		
		//create panel0 to hold button
		JPanel panel0 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		panel0.add(jbtLogIn);
		
		add(panel0);
		
		//create a listener
		ButtonListener listener = new ButtonListener();
		
		//Register listener with button
		jbtLogIn.addActionListener(listener);
		
		
		
		
	}
	
		
	
	public void CalculatorPanels(){
		
		
		JFrame frame2 = new JFrame();//create a frame
		frame2.setTitle("Calculator");//set title Calculator
		frame2.setLocationRelativeTo(null);//center a frame 
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(300,300);
		frame2.setVisible(true);//display the frame
		
		secondInteger = 0;
		mode = 1;
		
		//create panel1 to hold button
		JPanel panel1 = new JPanel(new GridLayout(4,3));
	
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
		panel1.add(jbtDot);
		
		add(panel1);
		
		//create panel3 to hold button
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
		panel2.add(panel1,BorderLayout.WEST);//add panel1 to west of panel2 
		panel2.add(panel3,BorderLayout.EAST);//add panel3 to west of panel2 
		
		
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEditable(false);
		
		add(panel2);
		
		frame2.add(panel2);//add panel2 to frame2
		
		//create a listener
		ButtonListener listener = new ButtonListener();
		
		//Register listener with buttons
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
		jbtDot.addActionListener(listener);
		
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
			if(e.getSource() == jbtLogIn){
				secondInteger = Double.parseDouble(jftID.getText());
				if(secondInteger == 1234){
					CalculatorPanels();
				}
				else
					jftID.setText(jftID.getText()+" Wrong ID !!!");
			}		
			
			//display the digit from 0~9 if press the digit button
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
			if(e.getSource() == jbtDot)
				txt.setText(txt.getText()+".");
			
			//method of press Plus button
			if(e.getSource() == jbtPlus){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 0;
			}
			
			//method of press Minus button
			if(e.getSource() == jbtMinus){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 1;
			}
			
			//method of press Cross button
			if(e.getSource() == jbtCross){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 2;
			}
			
			//method of press Devide button
			if(e.getSource() == jbtDevide){
				secondInteger = Double.parseDouble(txt.getText());
				txt.setText("");
				mode = 3;
			}
			
			//method of press equal button
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
			
			//method of press sin button
			if(e.getSource() == jbtSin){
				double ans = 0;
				ans = Math.sin(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			//method of press cos button
			if(e.getSource() == jbtCos){
				double ans = 0;
				ans = Math.cos(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			//method of press tan button
			if(e.getSource() == jbtTan){
				double ans = 0;
				ans = Math.tan(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
			
			//display answer
			if(e.getSource() == jbtLog){
				double ans = 0;
				ans = Math.log10(Double.parseDouble(txt.getText()));
				txt.setText(String.format("%.2f",ans));
				mode = -1;
			}
		
			//clean the text
			if(e.getSource() == jbtClear){
				txt.setText("");
				mode = -1;
			}
		
		}	
	
	}
		
	public static void main(String[] args){
		
		JFrame frame1 = new Test();//create a frame
		frame1.setTitle("Log in system");//set title Calculator
		frame1.setLocationRelativeTo(null);//center a frame
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.pack();
		frame1.setVisible(true);//display the frame
		
		}
}
	
