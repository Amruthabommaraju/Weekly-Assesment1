package WeeklyAssignment1;

public class schoolRecords {
	
	String name;
	int id;
	String address;
	void ddRecords(int id, String name, String address) {
		System.out.println("add school id =" +id);
		System.out.println("add school name =" + name);
		System.out.println("add school address =" +address);
	}
	void disRecords() {
		System.out.println("Display School id ="+ id);
		System.out.println("Display School name ="+ name);
		System.out.println("Display School address ="+ address);
	}

}
