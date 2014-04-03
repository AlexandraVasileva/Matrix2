/*
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);	
			int size = 0;
			
		try{	
			size = in.nextInt();
		} catch(Exception e){
			System.out.println(e.toString() + " - wrong size input");
		}
			
			Vector x = new Vector (size);
			Vector y = new Vector (size);
			Vector sum = new Vector(size);
			int scalar = 0;
			int i, temp;		
			
		try{
			for (i=0; i<size; i++){
				temp = in.nextInt();
				x.setValue(i, temp);
			}
			
			for (i=0; i<size; i++){
				temp = in.nextInt();
				y.setValue(i, temp);
			}
		} catch(Exception e){
			System.out.println(e.toString() + " - wrong data input");
		}
			

		try{
			sum = x.sum(y);
			scalar = x.scalar(y);
		} catch(Exception e){
			System.out.println(e.toString() + " - error in calculations");
		}
		
		try{
			System.out.println();
			System.out.println("Input:");
			System.out.println();
			x.vprint();
			System.out.println();
			y.vprint();		
			
			System.out.println();
			System.out.println("Scalar: " + scalar);
			System.out.println();
			System.out.println("Sum:");
			sum.vprint();
		} catch (Exception e){
			System.out.println(e.toString() + " - output error");
		}
			in.close();
			
		}

}
*/