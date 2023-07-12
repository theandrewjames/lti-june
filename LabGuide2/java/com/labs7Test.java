package com;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.seed.employee.employee;
import com.seed.employee.contract.TechnicalAssociate;

import labs5.Perm.PermProjectMgr;

public class labs7Test {
	List<employee> eeList = new ArrayList<employee>();
	@BeforeEach
	public void startAndClear() {
		
	}
	@Test
	public void testPerm() {
		PermProjectMgr pm = new PermProjectMgr("bob", "velasquez", 1000, "pm", new Date());
		TechnicalAssociate ta = new TechnicalAssociate("andrew", "velasquez", "TA", 30, 100, "samplecon", new Date());
		eeList.add(pm);
	}
	
	
}
