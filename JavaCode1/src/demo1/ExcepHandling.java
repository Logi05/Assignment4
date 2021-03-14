package demo1;
import java.lang.Exception.*;
public class ExcepHandling {
public static void main(String args[]) {
	int i=8,j=2,k;
	try {
		k=i/j;
		try {
			int a[]=new int[3];
			for(int l=0;l<=3;l++) {
				a[l]=l+1;
				System.out.println(a[3]);
			}
		}finally {
			System.out.println("Executed Always");
		}
			
	}
	catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
		System.out.println(e);
	}
		}
}

