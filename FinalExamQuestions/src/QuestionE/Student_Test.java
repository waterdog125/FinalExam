package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bob", "Roger", "Gray", dBirthDate, "200 Labrador Lane", "302-893-6989", "bob@udel.edu","MIS");
		Student stu3 = new Student("Billy", "Ryan", "Johnson", dBirthDate, "211 Labrador Lane", "302-893-6489", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Bernice", "Radar", "Green", dBirthDate, "214 Labrador Lane", "302-893-6689", "RadarGo@udel.edu","MIS");
		Student stu5 = new Student("Ben", "Ben", "the third", dBirthDate, "3 Labrador Lane", "302-893-6789", "benben3@udel.edu","MIS");
		
		HashMap<PersonID,Student> cache = new HashMap<PersonID,Student>;
		map.put(stu1, 1);
		map.put(stu2, 2);
		map.put(stu3, 3);
		map.put(stu4, 4);
		map.put(stu5, 5);
		assertTrue(map.this == 5);
	}

}
