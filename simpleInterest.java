package WeeklyAssignment1;

public class simpleInterest {
	static int principal;
	static int rate;
	static int time;
	
	void simple(int p, int r, int t) {
		principal = p;
		rate = r;
		time = t;
		int si = (principal*rate*time)/100;
		System.out.println(si+principal+" is the loan amount to be payed");
	}
}
