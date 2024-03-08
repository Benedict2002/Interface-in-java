 class StaticDemo{
 
static int a = 29;
static void display(){
System.out.println("Static method");
}
static{
System.out.println("Static bloc");
}
public static void main(String args[]){
 System.out.println(a);
 display();
}
}