class Mobile{
    int Price;
    String Brand;
    static String type;

    public Mobile(){
        Price=0;
        Brand="None";
    }

    public Mobile(int Price,String Brand){
        this.Price=Price;
        this.Brand=Brand;
    }

    public static void func1(Mobile obj){
        System.out.println(obj.Brand);
    }

}



class StaticMethod6{
    public static void main(String args[]){
        Mobile.type="Touchy";
        Mobile M1=new Mobile();
        System.out.println(M1.Price+" "+M1.Brand+" "+M1.type);

        Mobile M2=new Mobile(90000,"Apple");
        System.out.println(M2.Price+" "+M2.Brand+" "+M2.type);

        // M2.func1(); -- callable
        Mobile.func1(M1);
        Mobile.func1(M2);
        }
}


//Static Method , to call u dont need ab object 
// can only use statuic method
// to use non static variable/instance variable inside static method , u have to call it with passing object reference