// Constructor_Default_Parameterized4
//how if we dont make any default constructor still value is 0 and null
//because java itself create that.


class Humans{
    String name;
    int age;

    //default constructor
    public Humans(){
        name="Tanish";
        age=25;
    }

    //parameterized constructor
    public Humans(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}

class Constructor_Default_Parameterized4{
    public static void main(String args[]){
    Humans h1=new Humans();
    System.out.println(h1.getAge()+" "+h1.getName());
    Humans h2=new Humans("Kapoor",25);
    System.out.println(h2.getAge()+" "+h2.getName());


    }
}