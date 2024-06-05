package mainPackage;

import java.util.ArrayList;
import java.util.List;

public class GetterAndSetterClass {
	

	private static ThreadLocal<String> failedReasonThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> fileNameThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> totalMonthlyRentWithTaxThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> residentBenefitsPackageTaxAvailabilityCheckThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> residentBenefitsPackageTaxAmountThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> startDateInPWThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> endDateInPWThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> RBPOptOutAddendumCheckThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> RBPNoChangeRequiredThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> oldRBPAmountThreadLocal = new ThreadLocal<>();
	
	
	private static ThreadLocal<String> startDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> endDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> FirstFullMonthThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> lastDayOfTheStartDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> monthlyRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> monthlyRentTaxAmountThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> monthlyRentTaxFlagThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateRentDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> residentBenefitsPackageAvailabilityCheckThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> residentBenefitsPackageThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> incrementRentFlagThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> increasedRent_amountThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateEscalationStartDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateEscalationEndDateThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateEscalationAmountThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> leaseStatusThreadLocal = new ThreadLocal<>();
	
	
	private static ThreadLocal<String> arizonaCityFromBuildingAddressThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> arizonaRentCodeThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Boolean> arizonaCodeAvailableThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<Integer> statusIDThreadLocal = new ThreadLocal<>();
	
	
	
	
	
	
	

	private static ThreadLocal<String> oldLeaseStartDate_ProrateRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> oldLeaseEndDate_ProrateRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> newLeaseEndDate_ProrateRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> prorateResidentBenefitPackageThreadLocal = new ThreadLocal<>();  //For other portfolios, it should be added as second full month in Auto Charges 
	private static ThreadLocal<String> prorateMonthlyRentThreadLocal = new ThreadLocal<>();
	private static ThreadLocal<String> renewalStatusValueThreadLocal = new ThreadLocal<>();
	
	
	private static ThreadLocal<ArrayList<String>> increasedRentAmounts = ThreadLocal.withInitial(ArrayList::new);
	private static ThreadLocal<ArrayList<String>> increasedRentDates = ThreadLocal.withInitial(ArrayList::new);
	
	
	
	public static ArrayList<String> getIncreasedRentAmounts() {
        return increasedRentAmounts.get();
    }
	
	public static void setIncreasedRentAmounts(ArrayList<String> allIncreasedRent_amounts) {
		increasedRentAmounts.set(allIncreasedRent_amounts);
    }
	public static ArrayList<String> getIncreasedRentDates() {
        return increasedRentDates.get();
    }
	
	public static void setIncreasedRentDates(ArrayList<String> allIncreasedRent_StartDate) {
		increasedRentDates.set(allIncreasedRent_StartDate);
    }
	
	
	
	public static String getStartDate() {
		if(startDateThreadLocal.get()==null)
			return "Error";
		else
		 return startDateThreadLocal.get();
	}

	public static void setStartDate(String startDate) {
		startDateThreadLocal.set(startDate);
	}
	
	public static String getEndDate() {
		if(endDateThreadLocal.get()==null)
			return "Error";
		else
		 return endDateThreadLocal.get();
	}
	public static void setEndDate(String endDate) {
		endDateThreadLocal.set(endDate);
	}
	
	public static String getFirstFullMonth() {
		if(FirstFullMonthThreadLocal.get()==null)
			return "Error";
		else
		 return FirstFullMonthThreadLocal.get();
	}
	public static void setFirstFullMonth(String firstFullMonth) {
		FirstFullMonthThreadLocal.set(firstFullMonth);
	}
	
	public static String getlastDayOfTheStartDate() {
		if(lastDayOfTheStartDateThreadLocal.get()==null)
			return "Error";
		else
		 return lastDayOfTheStartDateThreadLocal.get();
	}
	public static void setlastDayOfTheStartDate(String lastDayOfTheStartDate) {
		lastDayOfTheStartDateThreadLocal.set(lastDayOfTheStartDate);
	}
	
	
	public static String getMonthlyRent() {
		if(monthlyRentThreadLocal.get()==null)
			return "Error";
		else
		 return monthlyRentThreadLocal.get();
	}

	public static void setMonthlyRent(String monthlyRent) {
		monthlyRentThreadLocal.set(monthlyRent);
	}
	public static String getMonthlyRentTaxAmount() {
		if(monthlyRentTaxAmountThreadLocal.get()==null)
			return "Error";
		else
		 return monthlyRentTaxAmountThreadLocal.get();
	}

	public static void setMonthlyRentTaxAmount(String monthlyRentTaxAmount) {
		monthlyRentTaxAmountThreadLocal.set(monthlyRentTaxAmount);
	}
	
	public static boolean getMonthlyRentTaxFlag() {
		if(monthlyRentTaxFlagThreadLocal.get()==null)
			return false;
		else
		 return monthlyRentTaxFlagThreadLocal.get();
	}

	public static void setMonthlyRentTaxFlag(boolean monthlyRentTaxFlag) {
		monthlyRentTaxFlagThreadLocal.set(monthlyRentTaxFlag);
	}
	public static String getProrateRent() {
		if(prorateRentThreadLocal.get()==null)
			return "Error";
		else
		 return prorateRentThreadLocal.get();
	}

	public static void setProrateRent(String prorateRent) {
		prorateRentThreadLocal.set(prorateRent);
	}
	public static String getprorateEscalationStartDate() {
		if(prorateEscalationStartDateThreadLocal.get()==null)
			return "Error";
		else
		 return prorateEscalationStartDateThreadLocal.get();
	}

	public static void setprorateEscalationStartDate(String prorateEscalationStartDate) {
		prorateEscalationStartDateThreadLocal.set(prorateEscalationStartDate);
	}
	public static String getprorateEscalationEndDate() {
		if(prorateEscalationEndDateThreadLocal.get()==null)
			return "Error";
		else
		 return prorateEscalationEndDateThreadLocal.get();
	}

	public static void setprorateEscalationEndDate(String prorateEscalationEndDate) {
		prorateEscalationEndDateThreadLocal.set(prorateEscalationEndDate);
	}
	public static String getprorateEscalationAmount() {
		if(prorateEscalationAmountThreadLocal.get()==null)
			return "Error";
		else
		 return prorateEscalationAmountThreadLocal.get();
	}

	public static void setprorateEscalationAmount(String prorateEscalationAmount) {
		prorateEscalationAmountThreadLocal.set(prorateEscalationAmount);
	}
	
	public static String getProrateRentDate() {
		if(prorateRentDateThreadLocal.get()==null)
			return "Error";
		else
		 return prorateRentDateThreadLocal.get();
	}

	public static void setProrateRentDate(String prorateRentDate) {
		prorateRentDateThreadLocal.set(prorateRentDate);
	}
	
	public static boolean getresidentBenefitsPackageAvailabilityCheckFlag() {
		if(residentBenefitsPackageAvailabilityCheckThreadLocal.get()==null)
			return false;
		else
		 return residentBenefitsPackageAvailabilityCheckThreadLocal.get();
	}

	public static void setresidentBenefitsPackageAvailabilityCheckFlag(boolean residentBenefitsPackageAvailabilityCheckFlag) {
		residentBenefitsPackageAvailabilityCheckThreadLocal.set(residentBenefitsPackageAvailabilityCheckFlag);
	}
	public static String getresidentBenefitsPackage() {
		if(residentBenefitsPackageThreadLocal.get()==null)
			return "Error";
		else
		 return residentBenefitsPackageThreadLocal.get();
	}

	public static void setresidentBenefitsPackage(String residentBenefitsPackage) {
		residentBenefitsPackageThreadLocal.set(residentBenefitsPackage);
	}
	
	public static void setTotalMonthlyRentWithTax(String totalMonthlyRentWithTax) {
		totalMonthlyRentWithTaxThreadLocal.set(totalMonthlyRentWithTax);
	}
	
	public static String getTotalMonthlyRentWithTax() {
		if(totalMonthlyRentWithTaxThreadLocal.get()==null)
			return "Error";
		else
		 return totalMonthlyRentWithTaxThreadLocal.get();
	}
	
	
	public static boolean getResidentBenefitsPackageTaxAvailabilityCheck() {
		if(residentBenefitsPackageTaxAvailabilityCheckThreadLocal.get()==null)
			return false;
		else
		 return residentBenefitsPackageTaxAvailabilityCheckThreadLocal.get();
	}
	public static void setResidentBenefitsPackageTaxAvailabilityCheck(boolean ResidentBenefitsPackageTaxAvailabilityCheck) {
		residentBenefitsPackageTaxAvailabilityCheckThreadLocal.set(ResidentBenefitsPackageTaxAvailabilityCheck);
	}
	
	public static void setResidentBenefitsPackageTaxAmount(String residentBenefitsPackageTaxAmount) {
		residentBenefitsPackageTaxAmountThreadLocal.set(residentBenefitsPackageTaxAmount);
	}
	
	public static String getResidentBenefitsPackageTaxAmount() {
		if(residentBenefitsPackageTaxAmountThreadLocal.get()==null)
			return "Error";
		else
		 return residentBenefitsPackageTaxAmountThreadLocal.get();
	}

	public static void setStartDateInPW(String startDateInPW) {
		startDateInPWThreadLocal.set(startDateInPW);
	}
	
	public static String getStartDateInPW() {
		if(startDateInPWThreadLocal.get()==null)
			return "Error";
		else
		 return startDateInPWThreadLocal.get();
	}
	public static void setEndDateInPW(String endDateInPW) {
		endDateInPWThreadLocal.set(endDateInPW);
	}
	
	public static String getEndDateInPW() {
		if(endDateInPWThreadLocal.get()==null)
			return "Error";
		else
		 return endDateInPWThreadLocal.get();
	}
	
	public static boolean getRBPOptOutAddendumCheck() {
		if(RBPOptOutAddendumCheckThreadLocal.get()==null)
			return false;
		else
		 return RBPOptOutAddendumCheckThreadLocal.get();
	}
	public static void setRBPOptOutAddendumCheck(boolean RBPOptOutAddendumCheck) {
		RBPOptOutAddendumCheckThreadLocal.set(RBPOptOutAddendumCheck);
	}
	public static boolean getRBPNoChangeRequired() {
		if(RBPNoChangeRequiredThreadLocal.get()==null)
			return false;
		else
		 return RBPNoChangeRequiredThreadLocal.get();
	}
	public static void setRBPNoChangeRequired(boolean RBPNoChangeRequired) {
		RBPNoChangeRequiredThreadLocal.set(RBPNoChangeRequired);
	}
	public static void setOldRBPAmount(String oldRBPAmount) {
		oldRBPAmountThreadLocal.set(oldRBPAmount);
	}
	
	public static String getOldRBPAmount() {
		if(oldRBPAmountThreadLocal.get()==null)
			return "Error";
		else
		 return oldRBPAmountThreadLocal.get();
	}
	
	
	public static boolean getIncrementRentFlag() {
		if(incrementRentFlagThreadLocal.get()==null)
			return false;
		else
		 return incrementRentFlagThreadLocal.get();
	}
	public static void setIncrementRentFlag(boolean incrementRentFlag) {
		incrementRentFlagThreadLocal.set(incrementRentFlag);
	}
	public static void setIncreasedRent_amount(String increasedRent_amount) {
		increasedRent_amountThreadLocal.set(increasedRent_amount);
	}
	
	public static String getIncreasedRent_amount() {
		if(increasedRent_amountThreadLocal.get()==null)
			return "Error";
		else
		 return increasedRent_amountThreadLocal.get();
	}
	

	
	
	
	public static String getFailedReason() {
		if(failedReasonThreadLocal.get()==null)
			return "";
			else return failedReasonThreadLocal.get();
	}

	public static void setFailedReason(String failedReason) {
		failedReasonThreadLocal.set(failedReason);
	}
	
	public static String getFileName() {
		 return fileNameThreadLocal.get();
	}

	public static void setFileName(String failedReason) {
		fileNameThreadLocal.set(failedReason);
	}
	
	
	
	
	
	public static void setArizonaCityFromBuildingAddress(String arizonaCityFromBuildingAddress) {
		arizonaCityFromBuildingAddressThreadLocal.set(arizonaCityFromBuildingAddress);
	}
	
	public static String getArizonaCityFromBuildingAddress() {
		if(arizonaCityFromBuildingAddressThreadLocal.get()==null)
			return "Error";
		else
		 return arizonaCityFromBuildingAddressThreadLocal.get();
	}
	public static void setArizonaRentCode(String arizonaRentCode) {
		arizonaRentCodeThreadLocal.set(arizonaRentCode);
	}
	
	public static String getArizonaRentCode() {
		if(arizonaRentCodeThreadLocal.get()==null)
			return "Error";
		else
		 return arizonaRentCodeThreadLocal.get();
	}
	public static boolean getArizonaCodeAvailable() {
		if(arizonaCodeAvailableThreadLocal.get()==null)
			return false;
		else
		 return arizonaCodeAvailableThreadLocal.get();
	}
	public static void setArizonaCodeAvailable(boolean arizonaCodeAvailable) {
		arizonaCodeAvailableThreadLocal.set(arizonaCodeAvailable);
	}
	
	public static void setStatusID(int statusID) {
		statusIDThreadLocal.set(statusID);
	}
	
	public static int getStatusID() {
		if(statusIDThreadLocal.get()==null)
			return 0;
		 return statusIDThreadLocal.get();
	}
	
	public static boolean getleaseStatus() {
		if(leaseStatusThreadLocal.get()==null)
			return false;
		else
		 return leaseStatusThreadLocal.get();
	}
	public static void setleaseStatus(boolean leaseStatus) {
		leaseStatusThreadLocal.set(leaseStatus);
	}
	
	
	
	
	
	
	
	

	public static String getOldLeaseStartDate_ProrateRent() {
		if(oldLeaseStartDate_ProrateRentThreadLocal.get()==null)
			return "Error";
		else
		 return oldLeaseStartDate_ProrateRentThreadLocal.get();
	}

	public static void setOldLeaseStartDate_ProrateRent(String startDate) {
		oldLeaseStartDate_ProrateRentThreadLocal.set(startDate);
	}
	
	public static String getOldLeaseEndDate_ProrateRent() {
		if(oldLeaseEndDate_ProrateRentThreadLocal.get()==null)
			return "Error";
		else
		 return oldLeaseEndDate_ProrateRentThreadLocal.get();
	}

	public static void setOldLeaseEndDate_ProrateRent(String endDate) {
		oldLeaseEndDate_ProrateRentThreadLocal.set(endDate);
	}
	
	public static String getNewLeaseEndDate_ProrateRent() {
		if(newLeaseEndDate_ProrateRentThreadLocal.get()==null)
			return "Error";
		else
		 return newLeaseEndDate_ProrateRentThreadLocal.get();
	}

	public static void setNewLeaseEndDate_ProrateRent(String endDate) {
		newLeaseEndDate_ProrateRentThreadLocal.set(endDate);
	}
	
	public static String getProrateResidentBenefitPackage() {
		if(prorateResidentBenefitPackageThreadLocal.get()==null)
			return "Error";
		else
		 return prorateResidentBenefitPackageThreadLocal.get();
	}

	public static void setProrateResidentBenefitPackage(String ProrateResidentBenefitPackage) {
		prorateResidentBenefitPackageThreadLocal.set(ProrateResidentBenefitPackage);
	}
	public static String getProrateMonthlyRent() {
		if(prorateMonthlyRentThreadLocal.get()==null)
			return "Error";
		else
		 return prorateMonthlyRentThreadLocal.get();
	}

	public static void setProrateMonthlyRent(String prorateMonthlyRent) {
		prorateMonthlyRentThreadLocal.set(prorateMonthlyRent);
	}
	public static String getRenewalStatusValue() {
		if(renewalStatusValueThreadLocal.get()==null)
			return "Error";
		else
		 return renewalStatusValueThreadLocal.get();
	}

	public static void setRenewalStatusValue(String renewalStatusValue) {
		renewalStatusValueThreadLocal.set(renewalStatusValue);
	}

}
