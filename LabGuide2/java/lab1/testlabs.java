package lab1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import lab1.employee;

public class testlabs {
	@Test
	public void testEEAmount() {
		List<employee> eeList = new ArrayList<employee>();
		
		employee ee1 = new employee("andrew", "velasquez", 1000, "IT", "JUN:2023");
		employee ee2 = new employee("bob", "velasquez", 1000, "IT", "JUN:2023");
		assertEquals(1, ee1.getEEId());
		assertEquals(2, ee2.getEEId());
	}
}
