package practice;


public class Test1 {
    int a, b;
    
    public Test1() {
       System.out.println("I am default contructor");
    }
    
    public Test1(int a, int b){
        this.a=a;
        this.b=b;
     System.out.println("I am parametrised contructor");   
    }
    
    public void cal() {
        System.out.println("The sum of 2 numbers is "+ (a+b)); 
    }

   
}
