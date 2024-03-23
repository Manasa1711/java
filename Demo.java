//this concept is based on abstract and anonymous inner class
//firstly im creating abstract class and just declaring a method
abstract class A{
    public abstract void show(); //use abstract keyword when u r just delcaring method because u dont know how to use it

}
// when u want to use anonymus in abstract no need to create another class to call method




public class Demo {
    
    public static void main(String args[]){
         //here im creating a obj for class a
         //it is not possible to create a obj for abstract class 
         A obj=new A(){
            //we are creatoing not for class A for anonymous class
            // here we are using anonymus for inner class 
            public void show(){
                System.out.println("in new show");
            }
            
        
         };
         obj.show();
    }
}
//u can use this for multiple classes also u can create config method in class a and u can call it in demo class like show