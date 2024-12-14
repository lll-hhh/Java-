package HackerDemo;

public class Main {
    public static void main(String[] args) {
        Person2 p = new Person2("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        Person3 T=new Student();
        Person3 t1=new Person3();
        Student s1 =(Student) T;
        Student s2=(Student) t1;// runtime error! ClassCastException!

        Person pp =new Person();
        System.out.println(pp instanceof Person);


    }
}
