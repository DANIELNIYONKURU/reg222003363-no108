class company{
    void AAAA(){
        System.out.println("ALL INFORMATION");
    }
}
class employees extends company{
    void BBBB(){
        System.out.println("INCOME OF CPNY INCREASE");
    }}

class products extends employees{
void CCCC(){
    System.out.println("COUNTRY GDP INCREASE");
}
}
class Main {
    public static void main(String args[]){
products obj= new products();
obj.AAAA();
obj.BBBB();
obj.CCCC();
    }}
