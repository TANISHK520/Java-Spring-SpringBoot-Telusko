class Student{
    String name;
    int age;
    int roll;
}

class Arrayofobjects{
    public static void main(String a[]){
        Student s1=new Student();
        s1.name="Tanish";
        s1.age=23;
        s1.roll=48;

        Student s2=new Student();
        s2.name="Ram";
        s2.age=23;
        s2.roll=26;

        Student s3=new Student();
        s3.name="SHaam";
        s3.age=23;
        s3.roll=27;

        // int arr[]=new int[3]
        Student studentAO[]=new Student[3];
        studentAO[0]=s1;
        studentAO[1]=s2;
        studentAO[2]=s3;

        for(int i=0;i<studentAO.length;i++){
            System.out.println(studentAO[i].name+" "+studentAO[i].age+" "+studentAO[i].roll);
        }

        for(Student i:studentAO){
            System.out.println(i.name);

        }


    }
}