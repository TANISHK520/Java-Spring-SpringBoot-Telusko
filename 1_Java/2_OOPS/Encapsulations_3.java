class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        // age=a;
        this.age=age;
    }

    public void setName(String name){
        // name=n;
        this.name=name;
    }

}


class Encapsulations_3{
    public static void main(String a[]){
        Human h1=new Human();
        h1.setAge(25);
        h1.setName("Tanish Kapoor");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }
}