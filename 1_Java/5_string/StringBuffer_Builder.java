class Stringbuffer_Builder{
    public static void main(String a[]){
        StringBuffer str=new StringBuffer("Tanish Kapoor");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
        str.append(" Java developer");
        System.out.println(str);

        System.out.println(str.substring(1,3));
        System.out.println(str.insert(7,"react "));
    }
}