package demo1;

public class ExcepHandling1 {
	public static void main(String args[]) {
		try{
			String s="abc";
			if(s.equals("abc")) {
				System.out.println("Same String");
			}
			else {
				System.out.println("Not a Same String");
			}
			try {
				String s1="Number";
				int n=Integer.parseInt(s1);
			}
			finally {
				System.out.println("Executed Always");
			}
		}
		catch(NullPointerException | NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
