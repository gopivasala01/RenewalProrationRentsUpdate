package mainPackage;




public class ProrateAmountCalculator {
	
	
	
	
	
	public static String prorateAmountOld(String Amount) throws Exception {
			String proratedAmount = "";
	    	
	    	
	    	//Prorate RBP
	    	try
			{ 
				int dayInMoveInDate = Integer.parseInt(GetterAndSetterClass.getStartDate().split("/")[1]);
				int daysInMonth = RunnerClass.getDaysInMonth(GetterAndSetterClass.getStartDate());
				double RBPAmount = Double.parseDouble(Amount);
				double RBPPerDay = RBPAmount /daysInMonth;
				double prorateRBP = (dayInMoveInDate-1)*RBPPerDay;
				prorateRBP = Math.floor(prorateRBP * 100) / 100;
				proratedAmount = String.format("%.2f", prorateRBP);
				
			}
			catch(Exception e)
			{
				proratedAmount = "Error";
				e.printStackTrace();
			}
			System.out.println("Prorate Amount = "+proratedAmount);
		
		return proratedAmount;
		
	}
	public static String prorateAmountNew(String Amount) throws Exception {
		String proratedAmount = "";
    	
    	
    	//Prorate RBP
    	try
		{ 
			int dayInMoveInDate = Integer.parseInt(GetterAndSetterClass.getStartDate().split("/")[1]);
			int daysInMonth = RunnerClass.getDaysInMonth(GetterAndSetterClass.getStartDate());
			double RBPAmount = Double.parseDouble(Amount);
			double RBPPerDay = RBPAmount /daysInMonth;
			double prorateRBP = (daysInMonth-(dayInMoveInDate-1))*RBPPerDay;
			prorateRBP = Math.floor(prorateRBP * 100) / 100;
			proratedAmount = String.format("%.2f", prorateRBP);
			
		}
		catch(Exception e)
		{
			proratedAmount = "Error";
			e.printStackTrace();
		}
		System.out.println("Prorate Amount = "+proratedAmount);
	
	return proratedAmount;
	
}
	
	
	
}