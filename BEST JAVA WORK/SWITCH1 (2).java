class manage//class name
{
    public static void main(String a[])//main method
    {
        int income=1000;//integer income with value 1000

        if(income<500)//first if condition
        {
            System.out.println("lower income");}//result to be printed when income is <500

        else if (income>500)//second if condition 
        {System.out.println("higher income");}//result to be printed when income is >500
        
        else
        {System.out.println("need support");}//last if conditon when all above condition are not true
    }
}
