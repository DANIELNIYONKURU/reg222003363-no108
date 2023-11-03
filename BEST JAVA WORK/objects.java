class intrest//class name
{
public double myintrest(double principle, double rate, double time)//method
    {
        return principle * rate * time;//formila use to calculate simple intrest
    }}

public class objects//main class
{
        public static void main(String a[]) //main method
        {
            intrest mySI= new intrest();//creation of object

            double result = mySI.myintrest(100000.0,0.05,5.0);//calculation of simple intrest

        
        System.out.println("result: " +result);//result for simple itrest
    }
}
