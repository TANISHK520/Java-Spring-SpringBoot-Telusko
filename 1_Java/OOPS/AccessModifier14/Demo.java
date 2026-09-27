package AccessModifier14;
import AccessModifier14.tools.A;

public class Demo {

    public static void main(String args[]){
    A obj=new A();
    System.out.println(obj.marks);
    obj.hello();
    B objb=new B();

    System.out.println(objb.marks);
    }
}
