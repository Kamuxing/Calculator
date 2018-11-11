package shiyong;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class shiyong{
	public static void main(String [] args) {
		new f();
	}
}
class f extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn0;
	JTextField inputField;
	JPanel inputPanel1;
	JPanel inputPanel2;
	NumberListener numberListener = new NumberListener();
    OperatorListener operatorListener = new OperatorListener();
    OperatorListener0 operatorListener0 = new OperatorListener0();
    CListener cListener = new CListener();
    String F= "=";
    boolean On=false;
    double result = 0;
    double Y=0;
    double X=0;
 
	public f() {
		inputField=new JTextField(40); 
		inputPanel1=new JPanel();  
		inputPanel2=new JPanel();
		btn1=new JButton("C");
		btn2=new JButton("/");
		btn3=new JButton("*");
		btn4=new JButton("+");
		btn5=new JButton("-");
		btn6=new JButton("7");
		btn7=new JButton("8");
		btn8=new JButton("9");
		btn9=new JButton("4");
		btn10=new JButton("5");
		btn11=new JButton("6");
		btn12=new JButton("1");
		btn13=new JButton("2");
		btn14=new JButton("3");
		btn15=new JButton(". ¼ÙµÄ");
		btn16=new JButton("=");  
		btn17=new JButton("0"); 
		btn0=new JButton("¼ÙµÄ ");
		inputPanel1.add(inputField);  
		GridBagConstraints c=new GridBagConstraints();
		this.setLayout(new BorderLayout());  
		GridBagLayout layout=new GridBagLayout();
		inputPanel2.setLayout(layout);  
		c.fill=GridBagConstraints.BOTH;
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.add(inputPanel1,BorderLayout.NORTH);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.add(inputPanel2,BorderLayout.CENTER);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=1;
		addComponent(btn1,layout,c,inputPanel2);
		addComponent(btn0,layout,c,inputPanel2);
		addComponent(btn2,layout,c,inputPanel2);
		c.gridwidth=GridBagConstraints.REMAINDER;
		addComponent(btn3,layout,c,inputPanel2);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=1;
		addComponent(btn6,layout,c,inputPanel2);
		addComponent(btn7,layout,c,inputPanel2);
		addComponent(btn8,layout,c,inputPanel2);
		c.gridwidth=GridBagConstraints.REMAINDER;
        addComponent(btn5,layout,c,inputPanel2);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=1;
		addComponent(btn9,layout,c,inputPanel2);
		addComponent(btn10,layout,c,inputPanel2);
		addComponent(btn11,layout,c,inputPanel2);
		c.gridwidth=GridBagConstraints.REMAINDER;
		addComponent(btn4,layout,c,inputPanel2);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=1;
		addComponent(btn12,layout,c,inputPanel2);
		addComponent(btn13,layout,c,inputPanel2);
		addComponent(btn14,layout,c,inputPanel2);
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.gridheight=2;
		addComponent(btn16,layout,c,inputPanel2);
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=2;
		addComponent(btn17,layout,c,inputPanel2);
		addComponent(btn15,layout,c,inputPanel2);	
		this.setSize(500, 600);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    btn1.addActionListener(cListener);
	    btn2.addActionListener(operatorListener);
	    btn3.addActionListener(operatorListener);
	    btn4.addActionListener(operatorListener);
	    btn5.addActionListener(operatorListener);
	    btn6.addActionListener(numberListener);
	    btn7.addActionListener(numberListener);
	    btn8.addActionListener(numberListener);
	    btn9.addActionListener(numberListener);
	    btn10.addActionListener(numberListener);
	    btn11.addActionListener(numberListener);
	    btn12.addActionListener(numberListener);
	    btn13.addActionListener(numberListener);
	    btn14.addActionListener(numberListener);
	    btn15.addActionListener(operatorListener);
	    btn16.addActionListener(operatorListener0);
	    this.setVisible(true);
	}
	public void addComponent(JButton btn,GridBagLayout layout,GridBagConstraints c,JPanel inputPanel2) {
		layout.setConstraints(btn, c);
		inputPanel2.add(btn);
	}
	class NumberListener implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
	            if (!On) {
	            	inputField.setText("");
	                On = true;
	            }
	            String s = inputField.getText();
	            s =s+ e.getActionCommand();
	            inputField.setText(s);
	        }
	}

	class OperatorListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if 	(On=false) return;
			String s = inputField.getText();
			X=Double.parseDouble(s);
			F=e.getActionCommand();
		}
	}
	class OperatorListener0 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s = inputField.getText();
			Y=Double.parseDouble(s);
			switch (F) {
            case "+": {
                result = X+Y;
                break;
            }
            case "-": {
                result = X - Y;
                break;
            }
            case "*": {
                result =X*Y ;
                break;
            }
            case "/": {
                if (Y == 0) result = 0;
                else
                    result = X/Y;
                break;
            }
            }
			inputField.setText(String.valueOf( result));
			X=0;
			Y=0;
			result=0;
		}
	}

	class CListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			inputField.setText("");
        }
	}
}	


