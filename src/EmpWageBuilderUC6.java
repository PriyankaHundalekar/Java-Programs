//Use of Switch 

public class EmpWageBuilderUC6 {

 public static void main(String[] args) {
	 
	final int  IS_PART_TIME=1;
	final int  IS_FULL_TIME=2;
	final int  EMP_RATE_PER_HOUR=20;
	final int NUM_OF_WORKING_DAYS=2;
	final int MAX_HRS_IN_MONTH=10;
	int empHrs=0;
	int empWage=0;
	int totalEmpHrs=0;
	int totalEmpWage=0;
	int totalWorkingDays=0;
	while(totalEmpHrs <=MAX_HRS_IN_MONTH && totalWorkingDays <NUM_OF_WORKING_DAYS)
	{
	totalWorkingDays++;
	int empCheck=(int)Math.floor(Math.random()* 10)%3;
	switch (empCheck)
	{
	case IS_FULL_TIME:
		empHrs=8;
		break;
	case IS_PART_TIME:
		empHrs=4;
		break;
		default:
		empHrs=0;
	}
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalEmpWage +=empWage;
	System.out.println("Emp Wage :"+empWage);
}
	System.out.println("Total Emp Wage :"+totalEmpWage);
}
}