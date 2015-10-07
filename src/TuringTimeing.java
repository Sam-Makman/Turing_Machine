
public class TuringTimeing {

	private static char[] test;
	
	
	public static void main(String args[]){
		for(int i = 2;; i*=2){
			i++;
			System.out.println("N=" + i);
			init(i);
			time();
			
		}
	}
	
	public static void time(){
		TuringSim ts = new TuringSim();
		ts.writeInput(test);
		Stopwatch s = new Stopwatch();
		ts.accepts();
		System.out.println("Accepts Time " + s.elapsedTime());
	}
	
	private static void init(int n){
		test = new char[n];
		for(int i = 0; i<n;i++){
			if(i%2 == 0){
				test[i] = 'a';
			}
			else{
				test[i] = 'b';
			}
		}
		
	}
}


