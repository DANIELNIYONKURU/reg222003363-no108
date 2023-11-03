class compoundintr//class name 
{
    public double ABCD(double p,double r,double t,double n)//method
    {
        return p*(Math.pow((1+r/n),n*t));//formila used to calculate compound intrest
    }}
public class object//main class
{
    public static void main(String args[])//main method
    {
        compoundintr otherCI= new compoundintr();//creation of object

        double result= otherCI. ABCD (500000,0.18,3,12);//calculation of compound intrest

        System.out.println("result:" +result);//result forcompound intrest

    }   

}