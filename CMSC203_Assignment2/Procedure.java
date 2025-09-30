/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: Create a Procedure object with attributes including
 * the procedure name, date, practitioner, and charges.
 * Due: 10/02/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Iris Chakiath
*/

public class Procedure {
	private String procedure, date, practitioner;
	double charges;
	
	//constructors
	public Procedure() {
		this.procedure = "Physical Exam";
		this.date = "07/20/2019";
		this.practitioner = "Dr. Irvine";
		this.charges = 25.00;
	}
	/**
	 * create Procedure object with user defined procedure 
	 * and date attributes
	 * @param procedure user defined procedure
	 * @param date user defined date
	 */
	public Procedure(String procedure, String date) {
		this.procedure = procedure;
		this.date = date;
		this.practitioner = "Dr. Irvine";
		this.charges = 25.00;
	}
	/**
	 * create Procedure object with user defined procedure 
	 * practitioner, charges, and date attributes
	 * @param procedure user defined procedure
	 * @param date user defined date
	 * @param practitioner user defined practitioner
	 * @param charges user defined charges
	 */
	public Procedure(String procedure, String date, String practitioner, double charges) {
		this.procedure = procedure;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	
	//accessors
	/**
	 * get name of procedure
	 * @return procedure attribute
	 */
	public String getProcedure() {
		return this.procedure;
	}
	/**
	 * get date of procedure
	 * @return date attribute
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * get name of practitioner for procedure
	 * @return name of practitioner
	 */
	public String getPractitioner() {
		return this.practitioner;
	}
	/**
	 * get charges of procedure
	 * @return the charges attribute
	 */
	public double getCharges() {
		return this.charges;
	}
	
	//mutators
	/**
	 * overwrite procedure attribute to user specified
	 * procedure
	 * @param procedure user specified procedure
	 */
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	/**
	 * overwrite date attribute to user specified
	 * date
	 * @param date user specified date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * overwrite practitioner attribute to user specified
	 * practitioner
	 * @param practitioner user specified practitioner
	 */
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}
	/**
	 * overwrite charges attribute to user specified
	 * charges
	 * @param charges user specified charges
	 */
	public void setCharges(double charge) {
		this.charges = charge;
	}
	
	//methods
	/**
	 * Display all Procedure information and attributes
	 * with tab indents.
	 * @return procedure name, date, practitioner, and charges
	 */
	public String toString() {
		return "\t\tProcedure: " + this.procedure + "\n"+
				"\t\tProcedure Date: " + this.date + "\n" + 
				"\t\tPractitioner: " + this.practitioner + "\n" +
				"\t\tCharge = $" + String.format("%,.2f", this.charges);
	}
	
}
