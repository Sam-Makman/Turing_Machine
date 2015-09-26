
public class TuringSim {
	TuringTape tape;
	
	TuringSim(){ // creates a new TuringSim
		tape = new TuringTape();
		
	}
	
	void writeInput(char [] vals){// writes an input string to a TuringTape
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
		return false;
	}
	
	private boolean q1(TuringTape t){
		switch(t.read()){
		case 1 :
			t.write(3);
			t.moveRight();
			return q2(t);
		case 2 :
			t.write(4);
			t.moveLeft();
			return q2(t);
		default: 
			return false;
		}
	}
	
	private boolean q2(TuringTape t){
		switch(t.read()){
		case 0 : 
			t.moveLeft();
			return q3(t);
		case 1:
			t.moveRight();
			return q2(t);
		case 2: 
			t.moveRight();
			return q2(t);
		default: 
			return false;
		}
	}
	
	private boolean q3(TuringTape t){
		switch(t.read()){
		case 1 :
			t.write(5);
			t.moveLeft();
			return q4(t);
		case 2 :
			t.write(6);
			t.moveLeft();
			return q4(t);
			default: 
				return false;
		}
	}
	
	private boolean q4(TuringTape t){
		switch(t.read()){
		case 1:
			t.moveLeft();
			return q4(t);
		case 2:
			t.moveLeft();
			return q4(t);
		case 3:
			t.moveRight();
			return q5(t);
		case 4:
			t.moveRight();
			return q5(t);
		case 5:
			t.moveLeft();
			return q4(t);
		case 6:
			t.moveLeft();
			return q4(t);
		default: 
			return false;
		}
	}
	
	private boolean q5(TuringTape t){
		switch(t.read()){
		case 1: 
			t.write(3);
			t.moveRight();
			return q6(t);
		case 2: 
			t.write(4);
			t.moveRight();
			return q6(t);
		case 5:
			t.moveLeft();
			return q8(t);
		case 6:
			t.moveLeft();
			return q8(t);
		default: 
			return false;
		}
	}
	private boolean q6(TuringTape t){
		switch(t.read()){
		case 1:
			t.moveRight();
			return q6(t);
		case 2:
			t.moveRight();
			return q6(t);
		case 5 : 
			t.moveLeft();
			return q7(t);
		case 6 : 
			t.moveLeft();
			return q7(t);
		default: 
			return false;
		}
	}
	private boolean q7(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q8(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q9(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q10(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q11(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q12(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q13(TuringTape t){
		switch(t.read()){

		default: 
			return false;
		}
	}
	private boolean q14(TuringTape t){
		return true;
	}
	
	
	
}
