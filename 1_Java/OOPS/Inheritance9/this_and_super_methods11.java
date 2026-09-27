class A{
    int num=1; //this is instance variable
}

class B extends A{
    int num=2; //instance num of class B
    public int getValue(){
        int num=3; // local variable of function
        // return num; //this will return local variable
        //return this.num; // this will return instance variable as int num=2 is present , if not see parent 
        return super.num; // this will return num of super class ie A in this case
    }
}


public class this_and_super_methods11 {

    public static void main(String args[]){
        B obj=new B();
        System.out.println(obj.num);
        System.out.println(obj.getValue());
    }

}
