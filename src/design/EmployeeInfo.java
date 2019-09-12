package design;

import java.util.Scanner;

public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private int employeeId;
	private String employeeName;
	private String department;
	private static int salary;
	public DateConversion dateConversion;
	private int benefit;
	public static final String IT_DEPT = "Software Development";


	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.employeeId = employeeId;
		this.employeeName = name;

	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		return (salary * 10) / 100 + (salary * 8) / 100;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		try{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension
			int percentage = 5 * DateConversion.yearDiff(convertedJoiningDate, convertedTodaysDate);

			total = (salary * percentage) / 100;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) throws Exception {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}

		public static int yearDiff(String startDate, String endDate){
			String[] joiningDateAttributes = startDate.split("/");
			String[] todaysDateAttributes = endDate.split("/");

			int years = Integer.parseInt(todaysDateAttributes[1]) - Integer.parseInt(joiningDateAttributes[1]);

			if (Integer.parseInt(todaysDateAttributes[0]) < Integer.parseInt(joiningDateAttributes[0])) {
				years--;
			}

			return years == 0? 1: years;
		}
	}

	public int employeeId() {
		return employeeId;
	}


	public String employeeName() {
		return employeeName;
	}


	public void assignDepartment() {
		this.department = IT_DEPT;
	}


	public int calculateSalary() {
		return salary;
	}


	public void benefitLayout() {
		this.benefit = 100;
	}

	public void setSalary(int inputSalary) {
		salary = inputSalary;
	}
}
