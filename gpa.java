
import javax.swing.JOptionPane;
public class bang{
	
	public static void main(String[]args){
		
		JOptionPane.showMessageDialog(null,"Student GPA Calculator");
		String input=JOptionPane.showInputDialog("Your Resource center: \n1 to calculate GPA \n2 For billing info\n3 To get your credit hours");
		int g= Integer.parseInt(input);
		if( g==1)
	{
			  String b = JOptionPane.showInputDialog("Enter the percentage mark for CSC 310:");
             double L = Double.parseDouble(b);
              String c = JOptionPane.showInputDialog("Enter the percentage mark for CSC410: ");
              double W = Double.parseDouble(c);
              String d =JOptionPane.showInputDialog("Enter percentage mark for CSC316");
              double P=Double.parseDouble(d);
              String e=JOptionPane.showInputDialog("Enter percentage mark for CSC315");
              double S=Double.parseDouble(e);
              String f = JOptionPane.showInputDialog("Enter percentage mark for CSC210");
              double T=Double.parseDouble(f);
              String i=JOptionPane.showInputDialog("Enter percentage mark for CSC313" );
              double Q=Double.parseDouble(i);
              String h=JOptionPane.showInputDialog("Enter percentage mark for MTH111");
              double O=Double.parseDouble(h);
              aGpa (L,W,P,S,T,Q,O);
	}
	
	if (g==2)
	{
		String j=JOptionPane.showInputDialog("Enter current amount paid in Kshs");
		int r=Integer.parseInt(j);
		aBilling(r);
	}
	
	if (g==3)
	{
		String l=JOptionPane.showInputDialog("Enter number of units attempted");
		int m=Integer.parseInt(l);
		aUnits(m);
	}
	else
	{
		return;}
	}
	public static void aGpa(double l, double w, double p, double s, double t, double q, double o)
	{String fName;
	fName=JOptionPane.showInputDialog(null,"Enter student first name:");//prompts user
	String num=JOptionPane.showInputDialog(null,"Enter student admission number :");try{
		
		Double aGpa =((l+w+p+s+t+q+o)/7);
		if  (aGpa<100 && aGpa>=98)
		{
		JOptionPane.showMessageDialog(null,fName+ num+ "Your GPA is :4.0:");
		}
		else if (aGpa<=97 && aGpa>=95){
			JOptionPane.showMessageDialog(null,fName+   num  +  "Your GPA is :3.9:");
		}
		else if (aGpa<=94 && aGpa>=92){
			JOptionPane.showMessageDialog(null,fName+   num  +"Your GPA is :3.8:");
		}
		else if (aGpa<=91 && aGpa>=89)
				{
			JOptionPane.showMessageDialog(null,fName+   num  +"Your GPA is :3.7:");
		}
		else if (aGpa<=88 && aGpa>=86)
		{
			JOptionPane.showMessageDialog(null,fName+   num  +"Your GPA is :3.6");
		}
		else if (aGpa<=85 && aGpa>=83)
		{
			JOptionPane.showMessageDialog(null,fName+  num  +"Your GPA is :3.5");
		}
		else if (aGpa<=82 && aGpa>=80)
		{
			JOptionPane.showMessageDialog(null,fName+  num +  "Your GPA is  :3.4");
		}
		else if (aGpa<=79 && aGpa>=77)
		{
			JOptionPane.showMessageDialog(null,fName+   num+  "Your GPA is :3.3");
		}
		else if (aGpa<=76 && aGpa>=74)
		{
			JOptionPane.showMessageDialog(null,fName+     num+    "Your GPA is :3.2");
		}
		else if (aGpa<=73 && aGpa>=71)
		{
			JOptionPane.showMessageDialog(null,fName    +num+    "Your GPA is :3.1");
		}
		else if (aGpa<=70 && aGpa>=68){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 3.0");
		}
		else if (aGpa<=67 && aGpa>=65){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.9");
		}
		else if (aGpa<=64 && aGpa>=62){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.8");
		}
		else if (aGpa<=61 && aGpa>=59){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.7");
		}
		else if (aGpa<=58 && aGpa>=56){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.6");
		}
		else if (aGpa<=55 && aGpa>=53){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.5");
		}
		else if (aGpa<=52 && aGpa>=50){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.4");
		}
		else if (aGpa<=49 && aGpa>=47){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.3");
		}
		else if (aGpa<=46 && aGpa>=44){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.2");
		}
		else if (aGpa<=43 && aGpa>=42){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.1");
		}
		else if (aGpa<=41 && aGpa>=40){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 2.0");
		}
		else if (aGpa<=39 && aGpa>=38){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.9");
		}
		else if (aGpa<=37 && aGpa>=36){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.8");
		}
		else if (aGpa<=35 && aGpa>=34){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.7");
		}
		else if (aGpa<=33 && aGpa>=32){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.8");
		}
		else if (aGpa<=31 && aGpa>=30){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.7");
		}
		else if (aGpa<=29 && aGpa>=28){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.6");
		}
		else if (aGpa<=27 && aGpa>=26){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.5");
		}
		else if (aGpa<=25 && aGpa>=24){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.4");
		}
		else if (aGpa<=23 && aGpa>=22){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.3");
		}
		else if (aGpa<=21 && aGpa>=20){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.2");
		}
		else if (aGpa<=19 && aGpa>=18){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.1");
		}
		else if (aGpa<=17 && aGpa>=16){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 1.0");
		}
		else if (aGpa<=15 && aGpa>=14){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.9");
		}
		else if (aGpa<=13 && aGpa>=12){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.8");
		}
		else if (aGpa<=11 && aGpa>=10){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.7");
		}
		else if (aGpa<=9 && aGpa>=8){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.6");
		}
		else if (aGpa<=7 && aGpa>=6){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.5");
		}
		else if (aGpa<=5 && aGpa>=4){
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.4");
		}
		else{
			JOptionPane.showMessageDialog(null,fName     +num+    "Your GPA is : 0.0");
		}
	}
	
	catch(Exception e){
		
		JOptionPane.showMessageDialog(null,"only percentage grade accepted" );
		
	}{
		return;
	}
	

	
		
	}
	
	public static void aBilling(int r)
	{
	try{	
		double amount =(24000-r);
	
		JOptionPane.showMessageDialog(null,"Your outstanding payment is:"+amount + "Kshs");
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"only digits accepted" );
	}{
		return;
	}
	}
	public static void aUnits(int m)
	{
	try{		int aUnits=(3*m);
			JOptionPane.showMessageDialog(null,"Your credit hours are:"+aUnits );}
	catch(Exception e){
		JOptionPane.showMessageDialog(null,"only digits accepted");
	}{
		return;
	}
	}
			
	}
	
	
	
	
	
	
	
	
	
	
	

	
	

	
