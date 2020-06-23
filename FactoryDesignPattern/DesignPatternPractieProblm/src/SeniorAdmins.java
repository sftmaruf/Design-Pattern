public class SeniorAdmins extends Admins {

	@Override
	void chceckWorkingWay(Work w) {
		if (w.status.equals("Good")) {
			System.out.println("Thanks");
		}
	}
}
