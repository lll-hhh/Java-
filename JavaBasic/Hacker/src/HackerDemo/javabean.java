package HackerDemo;
import java.beans.*;


public class javabean {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Person12.class);

        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }

    }
}

class Person12 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //public void setAge(int age) {
    //    this.age = age;
    //}
}
