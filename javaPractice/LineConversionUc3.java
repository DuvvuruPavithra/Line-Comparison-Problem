package javaPractice;

public class LineConversionUc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 5,y1=4,x2=8,y2=10;
		int x3=7,y3=23,x4=17,y4=13;
		
		 double Lengthline1=Math.sqrt( Math.pow((x2-x1),2)+ Math.pow((y2-y1),2) );
		 double Lengthline2=Math.sqrt( Math.pow((x4-x3),2)+ Math.pow((y4-y3),2) );
		
		if (Lengthline1==Lengthline2) 
		   System.out.println("The two lines are equal" );
		else if (Lengthline1>Lengthline2)
		 	 System.out.println("The line1 is longer than line2");
		 
		 else
		 	 System.out.println("The line1 is shorter than line 2");

	}

}
