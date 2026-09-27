
/*
one way to initialize static variable only once at all , in main using mobile.type="touchy"

but i want to do that at time of object creation => then constructor is a way. 

right , but as static variable belongs to class not to object but whenever i create an object
constructor got called and that static variable initialzed multiple time hence not cool, 

therefore static block comes in */


/*
A static block (also known as a static initialization block) in Java is a block of code enclosed 
in braces {} and preceded by the static keyword. It is used to initialize static variables or perform
 one-time setup logic at the class level

Automatic Execution: You do not (and cannot) call a static block explicitly. 
                    The Java Virtual Machine (JVM) executes it automatically.

Runs Once: A static block executes exactly once during the lifecycle of the application, 
            specifically when the class is first loaded into memory by the Java ClassLoader

Order of Execution: It runs when its class is initialized. If that class contains main, its static
                    block runs before main. For another class, initialization happens on its first
                    active use, before its first object is instantiated. Here, Mobile is first used
                    by new Mobile() inside main, so its static block runs after "main called now".

Strictly Static: It can only directly access static variables and static methods. Trying to access 
                instance (non-static) variables inside a static block will cause a compilation error

Multiple Blocks: A class can contain multiple static blocks. They execute sequentially from top to bottom 
                in the order they appear in the source code
 */

class Mobile{
    int Price;
    static String type;
    String Brand;

    static{
        type="touchy";
        System.out.println("static called only once");
    }

    public Mobile(){
        // type="touchy";
        Price=100;
        Brand="none";
    }

    public Mobile(int Price,String Brand){
        // type="touchy";
        this.Price=Price;
        this.Brand=Brand;
    }

    public void print(){
        System.out.println(type+" "+Brand+" "+Price);
    }
}


public class StaticBlock7{
    
    public static void main(String args[]){
        
        System.out.println("main called now");
        Mobile M1=new Mobile(); // ---> class loads then object got intialized but class loads only once
                                // everytime u create object , class loads first and static block executes 
                                //jvm do that and next time when object of same class created , then loading
                                // wont happen again as its been already done jvm take care of that 
                                //and that why static only run once
                                // if we dont create object then class wont get loads and static block wont get executes
                                //what if we want to executes static block even when object is not created
                                // Class.forName(Mobile); -> this will loads the Mobile Class.
        M1.print();

        Mobile M2=new Mobile(80000,"apple");
        M2.print();

        System.out.println("main call ends");

    }
}