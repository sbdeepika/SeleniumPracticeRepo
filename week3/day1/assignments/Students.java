package week3.day1.assignments;

public class Students {

	public void getStudentInfo(int studid) {
		System.out.println(studid);
		
	}
	
public void getStudentInfo(int studid, String name) {
	System.out.println(studid + name);
		
	}

public void getStudentInfo(long phoneNumber, String email ) {
	System.out.println(phoneNumber + email);
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		st.getStudentInfo(12);
		st.getStudentInfo(11, "deepika");
		st.getStudentInfo(123344556, "deep@gmail.com");
	}

}
