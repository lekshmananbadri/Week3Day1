package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id+"  "+name);
		
	}
	public void getStudentInfo(String email, int phonenumber) {
		System.out.println(email+"   "+phonenumber);
		
	}
	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(48);
		stu.getStudentInfo(48, "lekshmanan");
		stu.getStudentInfo("lekshmana.badri@gmail.com", 12345);
	}
	

}
