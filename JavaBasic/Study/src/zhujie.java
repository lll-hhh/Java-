import jdk.jfr.DataAmount;

import java.lang.annotation.*;


public class zhujie {
    public static void main(String[] arg) {
        //@Override
        //@Deprecated
        //@SuppressWarnings()
        li lii=new li();
        lii.test();


    }
}

@SuppressWarnings("all")//镇压警告
class li{
    @Override
    public String toString()
    {
        return super.toString();
    }

    @Deprecated
    public static void liuhao(){
        System.out.println(1);
    }

    public void test (){
        liuhao();
    }

    @MyAnnotation(name="fasd",age=123)
    public void test1(){}
}

//测试元注解
//Target表示我们的注解可以用在那些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})

@Retention(value = RetentionPolicy.RUNTIME)//runtime<class<scource

@Documented//是否将注解生成在JAVAdoc中

@Inherited//子类可以继承父类的注解
@interface MyAnnotation{//自定义注解
    //注解的参数：参数类型+参数名
    String name() default "";
    int age() default 0;
    int id() default -1;
}




