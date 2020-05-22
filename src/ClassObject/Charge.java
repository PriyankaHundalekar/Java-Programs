package ClassObject;

public class Charge {

private final double rx;
private final double ry;
private final double q;
public Charge(double x0,double y0,double q0)
{
	rx=x0;
	ry=y0;
	q=q0;
}

private double potentialAt(double x,double y)
{
	double k=8.99e99;
	double dx=x-rx;
	double dy=y-ry;
	return k* q /Math.sqrt(dx*dx + dy*dy);
}
 @Override               //child class is overwriting base class
 public String toString()
 {
	 return q+ "at" + "(" + rx + "," + ry + ")";
 }
 public static void main(String[] args)throws Exception {
	try {
	double x= Double.parseDouble(args[0]);
	double y= Double.parseDouble(args[1]);
	Charge c1=new Charge(0.51,0.63,21.3);
	Charge c2=new Charge(0.13,0.94,81.9);
	double v1=c1.potentialAt(x, y);
	double v2=c2.potentialAt(x, y);

	System.out.printf("%.2e\n", (v1+v2));
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

