# Calculator
using java 

## Technology Used:

1.Java Language

2.AWT components

3.Java Applets

## Sample Code

1.init function
```
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
```


## Screenshots

![img](https://github.com/bitsplease98/Calculator/blob/master/caljava.PNG)
