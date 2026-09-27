class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

public class Demo{
    public static void main(String args[]){
        A obj=new A();
        obj.show();

        //reference of Superclass and object of child class
        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
}