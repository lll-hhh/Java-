public class fanshe {
    //反射
    public static void main(String[] arg)throws ClassNotFoundException{

        //1
        Class c1=User.class;
        //2
        User us=new User();
        Class c2=us.getClass();
        //3
        Class c3=Class.forName("com.kuang.reflection.User");

        System.out.println(c3);

        //一个类只对应一个class
    }
}
class User{
    public String name;
    private int id;
    private int age;

    public User() {
        this.name="";
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class Student1 extends User{

    public Student1(){
        this.name="liuhao";
    }
}
class Teacher1 extends User{
    public Teacher1(){
        this.name="ok";
    }
}