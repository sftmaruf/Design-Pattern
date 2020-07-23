public class FacadeCalculation {
	
	void managerTotal() {
		IEmployee emp = new Manager();
		System.out.println("Total : "+(emp.basicSalary+emp.cal_home_all()+emp.cal_med_all()));
	}
	
	void staffTotal() {
		IEmployee emp = new Staff();
		System.out.println("Total : "+(emp.basicSalary+emp.cal_home_all()+emp.cal_med_all()));
	}
}
