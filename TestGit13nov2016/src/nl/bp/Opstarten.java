package nl.bp;

public class Opstarten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Opstarten ops = new Opstarten();
		ops.pintNaamOpstarten("eerste poging");
		System.out.println(new hulpClass().geefNaamOpstarten("hulpfile"));
	}

	private void pintNaamOpstarten(String var1)
	{
		// eerste poging
		System.out.println("NAAM MET CAPS: " + var1);
		System.out.println("TEST POGING 2 ");
		System.out.println("------------ ");
	}
}
