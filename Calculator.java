package calculater;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	TextField display;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,clear,add,sub,mul,div,point,eql;
	Calculator(){
		display=new TextField("");
		display.setBounds(50,50,350,28);
		
		clear=new Button("C");
		clear.setBounds(50,100,50,50);
		clear.addActionListener(this);
		
		b7=new Button("7");
		b7.setBounds(50,190,50,50);
		b7.addActionListener(this);
		
		b4=new Button("4");
		b4.setBounds(50,280,50,50);
		b4.addActionListener(this);
		
		b1=new Button("1");
		b1.setBounds(50,370,50,50);
		b1.addActionListener(this);
		
		b0=new Button("0");
		b0.setBounds(50,460,150,50);
		b0.addActionListener(this);
		
		div=new Button("/");
		div.setBounds(150,100,50,50);
		div.addActionListener(this);
		
		b8=new Button("8");
		b8.setBounds(150,190,50,50);
		b8.addActionListener(this);
		
		b5=new Button("5");
		b5.setBounds(150,280,50,50);
		b5.addActionListener(this);
		
		b2=new Button("2");
		b2.setBounds(150,370,50,50);
		b2.addActionListener(this);
		
		mul=new Button("*");
		mul.setBounds(250,100,50,50);
		mul.addActionListener(this);
		
		b9=new Button("9");
		b9.setBounds(250,190,50,50);
		b9.addActionListener(this);
		
		b6=new Button("6");
		b6.setBounds(250,280,50,50);
		b6.addActionListener(this);
		
		b3=new Button("3");
		b3.setBounds(250,370,50,50);
		b3.addActionListener(this);
		
		point=new Button(".");
		point.setBounds(250,460,50,50);
		point.addActionListener(this);
		
		sub=new Button("-");
		sub.setBounds(350,100,50,50);
		sub.addActionListener(this);
		
		add=new Button("+");
		add.setBounds(350,190,50,150);
		add.addActionListener(this);
		
		eql=new Button("=");
		eql.setBounds(350,370,50,150);
		eql.addActionListener(this);
		
		add(display);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(clear);
		add(point);
		add(eql);
		
		setSize(450,560);
		setTitle("CALCULATOR");
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b0) {
			String exp=display.getText();
			exp+="0";
			display.setText(exp);
		}
		
		if(e.getSource()==b1) {
			String exp=display.getText();
			exp+="1";
			display.setText(exp);
		}
		
		if(e.getSource()==b2) {
			String exp=display.getText();
			exp+="2";
			display.setText(exp);
		}
		
		if(e.getSource()==b3) {
			String exp=display.getText();
			exp+="3";
			display.setText(exp);
		}
		
		if(e.getSource()==b4) {
			String exp=display.getText();
			exp+="4";
			display.setText(exp);
		}
		
		if(e.getSource()==b5) {
			String exp=display.getText();
			exp+="5";
			display.setText(exp);
		}
		
		if(e.getSource()==b6) {
			String exp=display.getText();
			exp+="6";
			display.setText(exp);
		}
		
		if(e.getSource()==b7) {
			String exp=display.getText();
			exp+="7";
			display.setText(exp);
		}
		
		if(e.getSource()==b8) {
			String exp=display.getText();
			exp+="8";
			display.setText(exp);
		}
		
		if(e.getSource()==b9) {
			String exp=display.getText();
			exp+="9";
			display.setText(exp);
		}
		
		if(e.getSource()==point) {
			String exp=display.getText();
			exp+=".";
			display.setText(exp);
		}
		
		if(e.getSource()==add) {
			String exp=display.getText();
			exp+="+";
			display.setText(exp);
		}
		
		if(e.getSource()==sub) {
			String exp=display.getText();
			exp+="-";
			display.setText(exp);
		}
		
		if(e.getSource()==mul) {
			String exp=display.getText();
			exp+="*";
			display.setText(exp);
		}
		
		if(e.getSource()==div) {
			String exp=display.getText();
			exp+="/";
			display.setText(exp);
		}
		
		if(e.getSource()==clear) {
			display.setText("");
		}
		
		if(e.getSource()==eql) {
			double a,b,result=0;
			int i=0,temp;
			char operater='+';
			String str1="",str2="",exp=display.getText();
			int l=exp.length();
			for(i=0;i<l;i++) {
				if(Character.isDigit(exp.charAt(i))|| exp.charAt(i)=='.') {
					str1+=exp.charAt(i);
				}
				else {
					operater=exp.charAt(i);
					break;
				}
			}
			str2=exp.substring(i+1);
			a=Double.parseDouble(str1);
			b=Double.parseDouble(str2);
			
			switch(operater) {
			case '+':
				result=a+b;
				break;
				
			case '-':
				result=a-b;
				break;
				
			case '*':
				result=a*b;
				break;
				
			case '/':
				if(b==0) {
					display.setText("ERROR");
					return;
				}
				else {
					result=a/b;
					break;
				}
			}
			temp=(int)(result);
			if(temp==result) {
				display.setText(String.valueOf(temp));
			}
			else {
				display.setText(String.valueOf(result));
			}
		}
	}
	
	public static void main(String[] args) {
		new Calculator();

	}
}
