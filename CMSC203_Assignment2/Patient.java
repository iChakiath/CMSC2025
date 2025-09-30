/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This program defines a "Patient" object 
 * with attributes including a user's first name, middle name,
 * last name, emergency contact information, their street address,
 * the state they live in, the city they live in, their zip code,
 * and their phone number.
 * Due: 10/02/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Iris Chakiath
*/
public class Patient {
	private String firstName, middleName, lastName, nameEmerg;
	private String streetAddress, state, city, phoneNum, emergPhone;
	private int zipCode;
	
	//constructors
	public Patient() {
		this.firstName = "John";
		this.middleName = "xx";
		this.lastName = "Doe";
		this.phoneNum = "301-123-4567";
		
		this.streetAddress = "123 Abc St";
		this.city = "Rockville";
		this.state = "MD";
		this.zipCode = 12345;
		
		this.nameEmerg = "Jane";
		this.emergPhone = "301-456-7890";
		
	}
	
	/**
	 * takes user specified input to initialize certain attributes of Patient
	 * @param first user specified first name
	 * @param middle user specified middle name
	 * @param last user specified last name
	 */
	public Patient(String first, String middle, String last) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.phoneNum = "301-123-4567";
		
		this.streetAddress = "123 Abc St";
		this.city = "Rockville";
		this.state = "MD";
		this.zipCode = 12345;
		
		this.nameEmerg = "Jane";
		this.emergPhone = "301-456-7890";
		
	}
	
	/**
	 * takes user specified input to initialize certain attributes of Patient
	 * @param first user specified first name
	 * @param middle user specified middle name
	 * @param last user specified last name
	 * @param phone user specified phone number
	 * @param street user specified street address
	 * @param city user specified city
	 * @param state user specified state
	 * @param zip user specified zip code
	 * @param emerg user specified name of emergency contact
	 * @param emergNum user specified phone number of emergency contact
	 */
	public Patient(String first, String middle, String last, String phone, String street, String city, String state, int zip, String emerg, String emergNum) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.phoneNum = phone;
		
		this.streetAddress = street;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
		
		this.nameEmerg = emerg;
		this.emergPhone = emergNum;
		
	}
	
	//accessors
	/**
	 * get patient first name
	 * @return the value of Patient object's first name
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * get patient middle name
	 * @return the value of Patient object's middle name
	 */
	public String getMiddleName() {
		return this.middleName;
	}
	/**
	 * get patient last name
	 * @return the value of Patient object's last name
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * get patient phone number
	 * @return the value of Patient object's phone number
	 */
	public String getPhoneNum() {
		return this.phoneNum;
	}
	/**
	 * get patient street address
	 * @return the value of Patient object's street address
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}
	/**
	 * get patient city
	 * @return the value of Patient object's city
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * get patient state
	 * @return the value of Patient object's state
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * get patient zip code
	 * @return the value of Patient object's zip code
	 */
	public int getZipCode() {
		return this.zipCode;
	}
	/**
	 * get emergency contact full name
	 * @return the value of Patient object's emergency contact name
	 */
	public String getNameEmerg() {
		return this.nameEmerg;
	}
	/**
	 * get emergency contact phone number
	 * @return the value of Patient object's emergency contact's phone number
	 */
	public String getemergPhone() {
		return this.emergPhone;
	}
	
	//mutators
	/**
	 * overwrite first name attribute
	 * @param name user specified first name 
	 */
	public void setFirstName(String name) {
		this.firstName = name;
	}
	/**
	 * overwrite middle name attribute
	 * @param name user specified middle name 

	 */
	public void setMiddleName(String name) {
		this.middleName = name;
	}
	/**
	 * overwrite last name attribute
	 * @param name user specified last name 
	 */
	public void setLastName(String name) {
		this.lastName = name;
	}
	/**
	 * overwrite phoneNum attribute
	 * @param phone user specified phone number
	 */
	public void setPhoneNum(String phone) {
		this.phoneNum = phone;
	}
	/**
	 * overwrite streetAddress attribute
	 * @param address user specified address
	 */
	public void setStreetAddress(String address) {
		this.streetAddress = address;
	}
	/**
	 * overwrite city attribute
	 * @param city user specified city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * overwrite state attribute
	 * @param state user specified state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * overwrite zipCode attribute
	 * @param zip user specified zip code
	 */
	public void setZipCode(int zip) {
		this.zipCode = zip;
	}
	/**
	 * overwrite nameEmerg attribute
	 * @param name user specified emergency contact name
	 */
	public void setNameEmerg(String name) {
		this.nameEmerg = name;
	}
	/**
	 * overwrite emergPhone attribute
	 * @param phone user specified emergency contact phone number
	 */
	public void setEmergPhone(String phone) {
		this.emergPhone = phone;
	}
	
	
	//methods
	/**
	 * Build patient full name with first, middle, and last names
	 * @return full name -> firstName + middleName + lastName
	 */
	public String buildFullName() {
		return this.firstName + " " + this.middleName + " " + this.lastName;
	}
	/**
	 * Build patient full address with street address, city, state and zip code
	 * @return full address -> streetAddress + city + state + zipCode
	 */
	public String buildAddress() {
		return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipCode;
	}
	/**
	 * Build patient emergency contact with emergency contact name and phone number
	 * @return full information -> nameEmerg + emergPhone
	 */
	public String buildEmergencyContact(){
		return this.nameEmerg + " " + this.emergPhone;
	}
	/**
	 * Display all Patient information and attributes using
	 * buildFullName(), buildAddress(), and buildEmergencyContact()
	 * methods to format.
	 * @return patient information -> buildFullName(), 
	 * buildAddress(), buildEmergencyContact()
	 */
	public String toString() {
		return "Patient Info: \n" + 
				"\tName: " + buildFullName() + "\n" +
				"\tAddress: " + buildAddress() + "\n" +
				"\tEmergency Contact: " + buildEmergencyContact();
	}
}





