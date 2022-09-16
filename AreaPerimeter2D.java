
public class AreaPerimeter2D {
public void Area(int b,int h,int a,int c)
     	{
		double AreaOfTriangle,perimeter;
		AreaOfTriangle=b*h/2;
		perimeter=a+b+c;
		System.out.println("AreaOfTriangle= " +AreaOfTriangle);
		System.out.println("parimeter=" +perimeter);
		
		}
	    
	    public void Area(int r) {
	    double  AreaOfCircle,perimeter;
	    AreaOfCircle=3.14*r*r;
	    perimeter=2*3.14*r;
	    System.out.println("AreaOfCircle=" +AreaOfCircle);
	    System.out.println("parimeter=" +perimeter);
	    }
	    
	    public void Area(double l,int b)
     	{
		double AreaOfReactangle,perimeter;
		AreaOfReactangle=l*b;
		perimeter=2*l*b;
		System.out.println("AreaOfReactangle="+AreaOfReactangle);
		System.out.println("perimeter=" +perimeter);
		}
	
	
	    public void Area(float side) 
	    {
	    double AreaOfSquare,perimeter;
	    AreaOfSquare=side*side;
	    perimeter=side*side*side*side;
	    System.out.println("AreaOfSquare=" +AreaOfSquare);
	    System.out.println("perimeter=" +perimeter);
	    }
	    private void area(int base,int height) {
	    double AreaOfParallelogram,perimeter;
	    AreaOfParallelogram=(base*height);
	    perimeter=2*(base+height);
	    System.out.println("AreaOfParallelogram ="+AreaOfParallelogram);
	    System.out.println("parimeter=" +perimeter);
	    }
	    
	    
	    
	 public static void main(String[] args) {
		 AreaPerimeter2D AO = new AreaPerimeter2D();
		
		AO.area(2, 2);
		
      }
      }

