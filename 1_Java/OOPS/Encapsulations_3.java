class Humans{
    //these private properties will only be acess by its own functions/methods

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
}

class Encapsulations_3{
    public static void main(String args[]){
        Humans h1=new Humans();
        // h1.age=11;
        // h1.name="Tanish";
        //         .\2_OOPS\Encapsulations_3.java:11: error: age has private access in Humans
        //         h1.age=11;
        //           ^
        // .\2_OOPS\Encapsulations_3.java:12: error: name has private access in Humans
        //         h1.name="Tanish";

        h1.setAge(25);
        h1.setName("Tanish");

        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }
}