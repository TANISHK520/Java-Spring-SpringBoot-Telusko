//what if i want to assign value at the time of object creation
//not using setters
//then we use constructor
//its a function that dont return anything and have name same as class
//constructo dont return and name of it is srictly same as class
//for every instance of class , constructor will be called.


class Humans{
    int age;
    String name;

    public Humans(){
        age=12;
        name="john";
        System.out.println("Hello");
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

class Constructor3{

    public static void main(String args[]){

    Humans h1=new Humans();

    System.out.println(h1.getAge()+" "+h1.getName());
    }

}