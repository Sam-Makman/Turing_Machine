import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TuringTapeTest {

	private TuringTape testTape;
	
	@Before
	public void init(){
		System.out.println("init");
		testTape = new TuringTape();
		testTape.moveLeft();
		testTape.write(10);
		testTape.moveRight();
		testTape.moveRight();
		testTape.write(100000);
		testTape.moveLeft();
		
	}
	
	
	@Test
	public void write(){
		testTape.write(10);
		assertEquals(10, testTape.read());
	}
	
	@Test
	public void moveRight() {
		testTape.moveRight();
		assertEquals(100000, testTape.read());
		
	}
	
	@Test
	public void moveLeft(){
		testTape.moveLeft();
		assertEquals(10, testTape.read());
	}

}
