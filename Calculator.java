	import java.awt.*;
	import java.applet.*;
	import java.awt.event.*;
	
	//<applet code="Calculator.class" width=210 height=200></applet>
	
	public class Calculator extends Applet implements ActionListener
	{
	float result=0.0f,a=0.0f;
	int b=0;
	TextField tf1;
	Button [] btn=new Button[16]; 
	String[] str={"1","2","3","4","5","6","7","8","9","0","+","-","*","/","=","Clear"};
	
	public void init()
	{
	tf1=new TextField(25);
	tf1.setEditable(false);
	add(tf1);
	//Font f=new Font("Arial",Font.BOLD,16);
	
	for(int i=0;i<btn.length;i++)	
	{
	btn[i]=new Button("    "+str[i]+"    ");
	btn[i].addActionListener(this);
	add(btn[i]);
	}
	}	
	public void actionPerformed(ActionEvent e)
	{
	for(int i=0;i<10;i++)
	{
	if(e.getSource()==btn[i])
	{
	tf1.setText(tf1.getText()+str[i]);
	}
	}
	if(e.getSource()==btn[10])
	{
	a=Float.parseFloat(tf1.getText());
	tf1.setText("");
	b=1;
	}
	if(e.getSource()==btn[11])
	{
	a=Float.parseFloat(tf1.getText());
	tf1.setText("");
	b=2;
	}
	if(e.getSource()==btn[12])
	{
	a=Float.parseFloat(tf1.getText());
	tf1.setText("");
	b=3;
	}
	if(e.getSource()==btn[13])
	{
	a=Float.parseFloat(tf1.getText());
	tf1.setText("");
	b=4;
	}
	if(e.getSource()==btn[14])
	{
	if(b==1)
	{
	result=a+Float.parseFloat(tf1.getText());
	tf1.setText(String.valueOf(result));
	}
	else if(b==2)
	{
	result=a-Float.parseFloat(tf1.getText());
	tf1.setText(String.valueOf(result));
	}
	else if(b==3)
	{
	result=a*Float.parseFloat(tf1.getText());
	tf1.setText(String.valueOf(result));
	}
	else if(b==4)
	{
	result=a/Float.parseFloat(tf1.getText());
	tf1.setText(String.valueOf(result));
	}
	}
	if(e.getSource()==btn[15])
	{
	tf1.setText("");
	}
	}
	}