 class time{
    public static void main(String args[]) {
        A myobj=new A();
        myobj.show();
        myobj.displa();
        myobj.calculat();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class D{
    int boys=5;
    int girls=10;
    
    public void add(){
        int result=boys+girls;
        System.out.println(result);

    }
}
class C extends D{
    public static void displa(){
        System.out.println("this is class B");
    }
}
class B extends C{
    public static void calculat(){
        int male=5;
        int female=20;
        int result=d-c;
        System.out.println(result);
    }
}

    interface E {
   void interfacetest();
} 

class A extends B implements E{
    public  void show() {
        System.out.println(boys+girls);
        
    }
    
    public void interfacetest(){
    
    System.out.println("GOOD ANSWE");
}
}
