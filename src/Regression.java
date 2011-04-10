import java.util.ArrayList;

public class Regression {
	private ArrayList<ArrayList<Double>> data;
	
	public Regression(ArrayList<ArrayList<Double>> dt){
		data = dt;
	}
	
	//Ordinary least squares determines functional dependency between two variables
	//http://www.weibull.com/DOEWeb/simple_linear_regression_analysis.htm#Calculation%20of%20the%20Fitted%20Line%20Using%20Least%20Square%20Estimates
	public double[] determine(int x, int y)
	{
		double[] res = new double[2];
		double avX = 0.0, avY = 0.0; 
		double sumX = 0.0, sumXY = 0.0, sumY = 0.0;
		double XAv = 0.0;
		
		for(int i = 0; i < data.get(x).size(); i++){
			sumX+=data.get(x).get(i);
		}
		avX = sumX/data.get(x).size();
		
		for(int i =0; i <data.get(y).size(); i++){
			sumY+= data.get(y).get(i);
			sumXY+= data.get(y).get(i) * data.get(x).get(i);
			XAv+= (data.get(x).get(i) - avX) * (data.get(x).get(i) - avX); 
		}
		
		res[0] = (sumXY - (sumX*sumY)/data.get(x).size())/XAv;
		res[1] = avY - res[0]* avX;
		return res;
	}
	                                         
}
