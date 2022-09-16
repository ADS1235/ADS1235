
public class PositiveNegativeNumber {
        public void PosNeg(int x) {
		if(x>0)
		{
		System.out.println("Positive number");
		}
		else
		if(x<0) 
		{
		System.out.println("Negative number");
		}
	    else 
		System.out.println("zero is zero");
		}
	
	    public static void main(String[] args) {
		PositiveNegativeNumber PNN=  new PositiveNegativeNumber();
		PNN.PosNeg(0);
	   }

      }


