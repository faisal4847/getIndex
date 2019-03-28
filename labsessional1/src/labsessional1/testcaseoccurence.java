package labsessional1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcaseoccurence {
int number;
	@Test
	public void getFirstCharInString(){
		
		number = Session.getnumber("faisal", 'f');
		assertEquals("return 0",0, number);
		
	}
	@Test
	public void charNotFoundInString(){
		
		number = Session.getnumber("faisal", 'm');
		assertEquals("return -1",-1, number);
		
	}


}
