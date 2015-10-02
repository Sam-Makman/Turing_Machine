
public class TuringSim {
	 TuringTape tape;
	
	TuringSim(){ // creates a new TuringSim
		tape = new TuringTape();
		
	}
	
	public void writeInput(char [] vals){// writes an input string to a TuringTape
		if(vals == null){
			throw new NullPointerException("input string is null");
		}
		int i = 0;
		for(char c: vals){
			i++;
			switch(c){
			case 'a' : 
				tape.write(1);
				tape.moveRight();
				break;
			case 'b' : 
				tape.write(2);
				tape.moveRight();
				break;
			default : 
				throw new UnsupportedOperationException();
			}
		}
		tape.write(0);
		for(int j = 0; j < i; j++){
			tape.moveLeft();
		}
	}
	
	public boolean accepts(){ // returns true if the Turing Machine accepts the given string
		if(tape.read()==0){
			throw new IllegalStateException();
		}
		
		int state = 1;
		while(state >= 0 && state <= 14){
			
			switch(state){
			case 0 : 
				return false;
			case 1:
				state = q1(tape);
				break;
			case 2:
				state = q2(tape);
				break;
			case 3:
				state = q3(tape);
				break;
			case 4:
				state = q4(tape);
				break;
			case 5:
				state = q5(tape);
				break;
			case 6:
				state = q6(tape);
				break;
			case 7:
				state = q7(tape);
				break;
			case 8:
				state = q8(tape);
				break;
			case 9:
				state = q9(tape);
				break;
			case 10:
				state = q10(tape);
				break;
			case 11:
				state = q11(tape);
				break;
			case 12:
				state = q12(tape);
				break;
			case 13:
				state = q13(tape);
				break;
			case 14:
				return true;
			}
			
		}
		return false;
	}
	
	private int q1(TuringTape t){
		switch(t.read()){
		case 1 :
			t.write(3);
			t.moveRight();
			return 2;
		case 2 :
			t.write(4);
			t.moveLeft();
			return 2;
		default: 
			return 0;
		}
	}
	
	private int q2(TuringTape t){
		switch(t.read()){
		case 0 : 
			t.moveLeft();
			return 3;
		case 1:
			t.moveRight();
			return 2;
		case 2: 
			t.moveRight();
			return 2;
		default: 
			return 0;
		}
	}
	
	private int q3(TuringTape t){
		switch(t.read()){
		case 1 :
			t.write(5);
			t.moveLeft();
			return 4;
		case 2 :
			t.write(6);
			t.moveLeft();
			return 4;
			default: 
				return 0;
		}
	}
	
	private int q4(TuringTape t){
		switch(t.read()){
		case 1:
			t.moveLeft();
			return 4;
		case 2:
			t.moveLeft();
			return 4;
		case 3:
			t.moveRight();
			return 5;
		case 4:
			t.moveRight();
			return 5;
		case 5:
			t.moveLeft();
			return 4;
		case 6:
			t.moveLeft();
			return 4;
		default: 
			return 0;
		}
	}
	
	private int q5(TuringTape t){
		switch(t.read()){
		case 1: 
			t.write(3);
			t.moveRight();
			return 6;
		case 2: 
			t.write(4);
			t.moveRight();
			return 6;
		case 5:
			t.moveLeft();
			return 8;
		case 6:
			t.moveLeft();
			return 8;
		default: 
			return 0;
		}
	}
	
	private int q6(TuringTape t){
		switch(t.read()){
		case 1:
			t.moveRight();
			return 6;
		case 2:
			t.moveRight();
			return 6;
		case 5 : 
			t.moveLeft();
			return 7;
		case 6 : 
			t.moveLeft();
			return 7;
		default: 
			return 0;
		}
	}
	
	private int q7(TuringTape t){
		switch(t.read()){
		case 1 :
			t.write(5);
			t.moveLeft();
			return 4;
		case 2 :
			t.write(6);
			t.moveLeft();
			return 4;
		default: 
			return 0;
		}
	}
	
	private int q8(TuringTape t){
		switch(t.read()){
		case 0:
			t.moveRight();
			return 9;
		case 3:
			t.moveLeft();
			return 8;
		case 4:
			t.moveLeft();
			return 8;
		case 5:
			t.moveLeft();
			return 8;
		case 6:
			t.moveLeft();
			return 8;
		default: 
			return 0;
		}
	}
	
	private int q9(TuringTape t){
		switch(t.read()){
		case 3:
			t.write(7);
			t.moveRight();
			return 10;
		case 4:
			t.write(7);
			t.moveRight();
			return 11;
		default: 
			return 0;
		}
	}
	
	private int q10(TuringTape t){
		switch(t.read()){
		case 0:
			t.moveRight();
			return 14;
		case 3: 
			t.moveRight();
			return 10;
		case 4:
			t.moveRight();
			return 10;
		case 5:
			t.write(7);
			t.moveLeft();
			return 12;
		case 7:
			t.moveRight();
			return 10;
		default: 
			return 0;
		}
	}
	
	private int q11(TuringTape t){
		switch(t.read()){
		case 0:
			t.moveRight();
			return 14;
		case 3:
			t.moveRight();
			return 11;
		case 4:
			t.moveRight();
			return 11;
		case 6 :
			t.write(7);
			t.moveLeft();
			return 12;
		case 7:
			t.moveRight();
			return 11;
		default: 
			return 0;
		}
	}
	
	private int q12(TuringTape t){
		switch(t.read()){
		case 0: 
			t.moveRight();
			return 13;
		case 3: 
			t.moveLeft();
			return 12;
		case 4: 
			t.moveLeft();
			return 12;
		case 5: 
			t.moveLeft();
			return 12;
		case 6: 
			t.moveLeft();
			return 12;
		case 7: 
			t.moveLeft();
			return 12;
		default: 
			return 0;
		}
	}
	
	private int q13(TuringTape t){
		switch(t.read()){
		case 0:
			return 14;
		case 3:
			t.write(7);
			t.moveRight();
			return 10;
		case 4:
			t.write(7);
			t.moveRight();
			return 11;	
		case 7:
			t.moveRight();
			return 13;
		default: 
			return 0;
		}
	}
	private boolean q14(TuringTape t){
		return true;
	}
	
	
	
}
