public class Manager implements IEmployee {
	

	@Override
	public double cal_home_all() {
		return basicSalary * 0.1;
	}

	@Override
	public double cal_med_all() {
		return basicSalary * 0.05;
	}

}
