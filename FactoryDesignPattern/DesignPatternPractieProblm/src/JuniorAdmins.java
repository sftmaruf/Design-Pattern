
public class JuniorAdmins extends Admins {

	@Override
	void chceckWorkingWay(Work w) {
        if(w.status.equals("Not Good")){
            System.out.println("Why!I'm not good");
         }
		
	}

}
