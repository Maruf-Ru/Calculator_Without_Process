package JFrame.java;

import javax.swing.*;
import java.awt.event.*;


public class Calculator  {

	
	    JFrame frame;
	    JTextField t;
	    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	 
	    static double a=0,b=0,result=0;
	    static int operator=0;
	 
	    public Calculator()
	    {
	    	
	    	frame=new JFrame("Calculator");
	        t=new JTextField();
	        b1=new JButton("1");
	        b2=new JButton("2");
	        b3=new JButton("3");
	        b4=new JButton("4");
	        b5=new JButton("5");
	        b6=new JButton("6");
	        b7=new JButton("7");
	        b8=new JButton("8");
	        b9=new JButton("9");
	        b0=new JButton("0");
	        bdiv=new JButton("/");
	        bmul=new JButton("*");
	        bsub=new JButton("-");
	        badd=new JButton("+");
	        bdec=new JButton(".");
	        beq=new JButton("=");
	        bdel=new JButton("Delete");
	        bclr=new JButton("Clear");
	        
	        t.setBounds(30,40,280,30);
	        b7.setBounds(40,100,50,40);
	        b8.setBounds(110,100,50,40);
	        b9.setBounds(180,100,50,40);
	        bdiv.setBounds(250,100,50,40);
	        
	        b4.setBounds(40,170,50,40);
	        b5.setBounds(110,170,50,40);
	        b6.setBounds(180,170,50,40);
	        bmul.setBounds(250,170,50,40);
	        
	        b1.setBounds(40,240,50,40);
	        b2.setBounds(110,240,50,40);
	        b3.setBounds(180,240,50,40);
	        bsub.setBounds(250,240,50,40);
	        
	        bdec.setBounds(40,310,50,40);
	        b0.setBounds(110,310,50,40);
	        beq.setBounds(180,310,50,40);
	        badd.setBounds(250,310,50,40);
	        
	        bdel.setBounds(60,380,100,40);
	        bclr.setBounds(180,380,100,40);
	        
	        frame.add(t);
	        frame.add(b7);
	        frame.add(b8);
	        frame.add(b9);
	        frame.add(bdiv);
	        frame.add(b4);
	        frame.add(b5);
	        frame.add(b6);
	        frame.add(bmul);
	        frame.add(b1);
	        frame.add(b2);
	        frame.add(b3);
	        frame.add(bsub);
	        frame.add(bdec);
	        frame.add(b0);
	        frame.add(beq);
	        frame.add(badd);
	        frame.add(bdel);
	        frame.add(bclr);
	        
	        frame.setLayout(null);
	        frame.setVisible(true);
	        frame.setSize(350,500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        
	        
	        
	    }
	    
	        
	    public static void main(String[] args)
	    {
	       new Calculator();
	    }

}
	    
