// explicit converions are called casting

class type{
    public static void main(String a1[]){

        byte b=127;
        int a=340;

       // b=a; //trying to store int in byte lowering the range not possible
       a=b; // trying to store byte in int -> posible

       System.out.println(a); //127

       // if b=a and we know a->int b->byte we trying to store int in byte
       //compiler will say not possible
       //if a=10 its in range of byte therefore we can do it explicitly

       byte c=30;
       int d=10;
       c=(byte) d;  // this is explicit conevrsion --> casting
       System.out.println(c);


       //again if u want to assign float,double to int u have to do it explicitly
       int x=(int)8.7;
       System.out.println(x);

      
       byte y=10;
       int z=300;
       y=(byte)z; //here z is 300 > range of byte wha happen is modulus 300%256 as byte can store 256 possile values byte->8 2^8==256
       System.out.println(y);

       //type promotion
       byte p=10;
       byte q=100;
       int result=p*q; //this p*q>127 iska type is int no need to convert explicitly
       System.out.println(result);

    //    byte*byte =byte but 10*100=1000>127 therefore result convert to int ==> this is type promotion
    }
}