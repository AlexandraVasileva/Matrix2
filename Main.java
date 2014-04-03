import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i, j;
		
		int temp = 0;
		int h = 0;
		int w = 0;
		
	try{
		h =  in.nextInt();
		w =  in.nextInt();
	} catch(Exception e){
		System.out.println(e.toString() + " - wrong size input (matrix 1)");
	}
	
		Matrix m1 = new Matrix(h,w);
		Matrix m2 = new Matrix(h,w);
		
	try{
		for(i=0; i<h; i++){
			m1.values[i] = new Vector(w);
			for (j=0; j<w; j++){
				temp = in.nextInt();
				m1.values[i].setValue(j, temp);
			}
		}
	} catch(Exception e){
		System.out.println(e.toString() + " - wrong data input (matrix 1)");
	}
		
	try{
		h =  in.nextInt();
		w =  in.nextInt();
	} catch(Exception e){
		System.out.println(e.toString() + " - wrong size input (matrix 2)");
	}
	
	try{
		for(i=0; i<h; i++){
			m2.values[i] = new Vector(w);
			for (j=0; j<w; j++){
				temp = in.nextInt();
				m2.values[i].setValue(j, temp);
			}
		}
	} catch(Exception e){
		System.out.println(e.toString() + " - wrong data input (matrix 2)");
	}

	try{
		System.out.println();
		System.out.println("Input:");	
		System.out.println();
		m1.mprint();
		System.out.println();
		m2.mprint();

		Matrix summa = m1.msum(m2);
		System.out.println();
		System.out.println("Sum:");
		summa.mprint();
		
		Matrix compos = m1.composition(m2);
		System.out.println();
		System.out.println("Composition:");
		compos.mprint();

		System.out.println();
		System.out.println("Determinant of 1:");
		System.out.println(m1.determinant());
		System.out.println();
		System.out.println("Determinant of 2:");
		System.out.println(m2.determinant());
		
	} catch(Exception e){
		System.out.println(e.toString() + " - wrong output");
	}
		
		in.close();
		
	}

}