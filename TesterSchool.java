package WeeklyAssignment1;

public class TesterSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		schoolRecords s = new schoolRecords();
		s.id = 1;
		s.name="Narayana";
		s.address="Chennai";
		s.ddRecords(1,"Narayana","Chennai");
		schoolRecords s1 = new schoolRecords();
		s1.id=2;
		s1.name="Chaitanya";
		s1.address= "Chennai";
		s1.ddRecords(2, "Chaitanya","Chennai");
		schoolRecords s2 = new schoolRecords();
		s2.id=3;
		s2.name="Gayatri";
		s2.address="Chennai";
		s2.ddRecords(3, "Gayatri","Chennai");
		s2.disRecords();

	}

}
