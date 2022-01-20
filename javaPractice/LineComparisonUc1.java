package javaPractice;

public class LineComparisonUc1 {

	public static void main(String[] args) {
		int x1 = 5;
		int y1 = 4;
		int x2 = 8;
		int y2 = 5;
				
		double Length_of_line = Math.sqrt((x2-x1) ^ 2 + (y2-y1) ^ 2);
		System.out.println("Length of the line"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+Length_of_line);
		

		
	}

}
