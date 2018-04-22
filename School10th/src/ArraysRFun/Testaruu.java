package ArraysRFun;

public class Testaruu {

	public static void main(String[] args) {
		System.out.println(sin(30));

	}
	public static double factorial (int num) {
		  int total = 1;
		  for (int i = 1; i <= num; i++){
		    total *= i;
		  }
		  return total;
		}
	public static double sin(double x){
		  double bot, top, sum = 0;
		  boolean check = false;
		  for (int i = 1; i < 14; i += 2){
		    bot = factorial(i); 
		    top = Math.pow(x, i);
		    if (check){
		      sum -= top / bot;
		      check = false;
		      }
		    else{
		      sum += top / bot;
		      check = true;
		      }
		    }
		    return sum;
		  }

}
