import java.util.ArrayList;


public class Main {
	
	public static void main(String args[])
	{	
		ReadCSV tmp = new  ReadCSV("C:\\Users\\Todor Tsonkov\\Desktop\\data.csv");
		ArrayList<ArrayList<Double>> res = tmp.returnData();
		Regression regr = new Regression(res);
		double[] t = regr.determine(2,3);
		System.out.print(t[0]); System.out.print(" "); System.out.print(t[1]); 
	}
}
