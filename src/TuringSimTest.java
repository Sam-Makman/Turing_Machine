import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TuringSimTest {
	TuringSim tSim;
	
	@Before
	public void init(){
		tSim = new TuringSim();
	}
	
	@Test
	public void writeInputTest(){
		char [] vals = new char[]{'a','b','b','a','a','b','b','a'};
		int [] results = new int[] {1,2,2,1,1,2,2,1,0};
		tSim.writeInput(vals);
		for(int i = 0; i< 9; i++){
		assertEquals(results[i],tSim.tape.read());
		tSim.tape.moveRight();
		}
	}
	
	@Test 
	public void acceptsTest(){
		tSim.writeInput(new char[]{'a','b','b','a','a','b','b','a'});
		assertEquals(true, tSim.accepts());
		tSim = new TuringSim();
		tSim.writeInput(new char[]{'a','a'});
		assertEquals(true, tSim.accepts());
		tSim = new TuringSim();
		tSim.writeInput(new char[]{'a','b','b','a','a','b','b','a','a','b','b','a','a','b','b','a'});
		assertEquals(true, tSim.accepts());
	}
	
	@Test
	public void failsTest(){
		tSim.writeInput(new char[]{'a','b','a','a','b','b','a'});
		assertEquals(false, tSim.accepts());
		tSim = new TuringSim();
		tSim.writeInput(new char[]{'a','b','a','a','b','b','a', 'b'});
		assertEquals(false, tSim.accepts());
	}
}
