package academy.JunitJava;

/**
 * Hello world!
 *
 */
public class App {
	
	private int ans;
	
	public App() {
		ans = 0;
	}
    
	public int sum(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int subtraction(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int sum(int v) {
		ans += v;
		return ans;
	}
	
	public int subtraction(int v) {
		ans -= v;
		return ans;
	}
	
	public boolean isEvenNumber(int number){
        
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
	
	public int ans() {
		return ans;
	}
	
	public int div(int a, int b) {
		if (b==0) {
			throw new ArithmeticException("we can't divide a number by 0");
		}
		ans = a/b;
		return ans;
	}
	
	public void clear() {
		ans = 0;
	}
}
