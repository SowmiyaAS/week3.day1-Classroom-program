package OveloadingClassrooom;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public void getstudentInfo(String email, long phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
	}
	public static void main(String[] args) {
		Student data = new Student();
		data.getStudentInfo(85);
		data.getStudentInfo(85, "sowmiya");
		data.getstudentInfo("sowmiya123@gmail.com", 7632964399l);
			
		
	}

	

}
