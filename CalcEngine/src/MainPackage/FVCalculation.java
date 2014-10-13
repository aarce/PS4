package MainPackage;

public class FVCalculation {

	double FutureValue(double pv, double interest, double time){
		return pv * (Math.pow((1 + (interest/100)), time));
	}
}
