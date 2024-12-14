package HackerDemo;


class Person {
    private String name;
    private int age;
    private String[] names;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    public void setNames(String[] names){
        this.names=names;
    }
}
class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Person3 {
    private String name;
    private int age;

    public String getName() {return null;}
    public void setName(String name) {}
    public int getAge() {return 1;}
    public void setAge(int age) {}
}

class Student extends Person3 {
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;

    public int getScore() {return 1;}
    public void setScore(int score) {}
}
//public sealed class Shape permits Rect {
//    public int liuhao;
//}
//public final class Rect extends Shape {
//    public int liuchen;
//}

abstract class Person4{
    public abstract void run();
}
class student extends Person4{
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}


abstract class Base{
    public abstract void liuhao();
}

class Sun extends Base{
    @Override
    public final void liuhao(){
        System.out.println("ok");
    }
}

public class classes{
    public static void main(String[] Args){
        Outer t1=new Outer("liuhao");
        Outer.Inner t2=t1.new Inner();
    }
}

class Outer{
    private String name;

    Outer(String n){
        this.name=n;
    }

    class Inner{
        void hello(){
            System.out.println("sadg"+Outer.this.name);
        }
    }
    //Inner Class和普通Class相比，除了能引用Outer实例外，
    // 还有一个额外的“特权”，就是可以修改Outer Class的private字段，
    // 因为Inner Class的作用域在Outer Class内部，
    // 所以能访问Outer Class的private字段和方法。
}










