package QuestionA;

import java.util.Date;

public interface iPersonRead {
	String getFirstName(String FirstName);
	String getMiddleName(String MiddleName);
	String getLastName(String LastName);
	Date getDOB(Date DOB);
	String getAddress(String Address);
	String getPhone(String Phone);
	String getEmail(String Email);
	
	Object Person(String FirstName, String MiddleName, String LastName,
				Date DOB, String Address, String Phone_number, String Email);
}