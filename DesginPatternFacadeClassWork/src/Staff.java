public class Staff implements IEmployee {

	@Override
	public double cal_home_all() {
		return basicSalary * 0.05;
	}

	@Override
	public double cal_med_all() {
		return basicSalary*0.02;
	}

}
