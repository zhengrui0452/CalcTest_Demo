
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 4;	
//		String path = "ArithmeticExpression.txt";
//		WriteToFile wtf = new WriteToFile(path);
	
		String path = args[1];
		int n = Integer.valueOf(args[0]);

		ReadFile rf = new ReadFile(path, n);
		
	}

}
