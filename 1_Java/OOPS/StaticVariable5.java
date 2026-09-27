//static variable are attatched/belong to class itself not with every instance of class.
//its like using same variable accross all object for a class
//use static keyword to make variable static
//if one object make change into this , will be changed for all as it is commonly shared
//instead of calling it using object name just call it directly using class name. class.variable=;
//calling it using object name wont give error but not preffered generally kind of a warning
// in Non static method we can use static variables
//saving memory also as every object wont have its own variables it will be shared accross whole objects of that particular class.

class Mobile{
    static String type;
    String brand;
    int price;

    public void show(){
        System.out.println(type+" "+brand+" "+price);
    }
}

class StaticVariable5{
    public static void main(String args[]){
    Mobile motorola=new Mobile();
    // motorola.type="touch";
    Mobile.type="Touchy";
    motorola.brand="motorola";
    motorola.price=30000;
    motorola.show();

    Mobile apple=new Mobile();
    // apple.type="touch";
    apple.brand="apple";
    apple.price=90000;
    apple.show();

    Mobile samsung=new Mobile();
    // samsung.type="touchhh";
    samsung.brand="motorola";
    samsung.price=30000;
    samsung.show();
    }
}