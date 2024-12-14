package HackerDemo;

public class FirstDemo {
    public static void main(String[] args){
        int x=100;
        x=200;
        System.out.println(x);
        System.out.println("liuhao");


        //变量类型
        int a1=0;
        byte a2=1;
        short a3=2;
        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        //float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float
        double a6=2;

        //bool
        boolean b1=true;
        boolean isGreater = 5 > 3;

        //char
        char a='s';
        char zh='拉';

        //string
        String s= "hello" ;

        //常量
        final double jconst=3.14;

        //auto->var
        var sb =new StringBuilder();
        //++ -- >>和c++一样
        int aa=23435645>>1;//算术左右移
        int aa1=123454364>>>1;//逻辑左右移

        //& | ~ ^
        int n=0&0;//与，可作为位对齐
        n=0|0;//或
        n=0^0;//异或
        n=~0;//非
        //算数优先级
        /**
         ()
         ! ~ ++ --
         * / %
         + -
         << >> >>>
         &
         |
         += -= *= /=
        */
        //字符串
        char c1='\u0041';
        /**转义字符
        \" 表示字符"
        \' 表示字符'
        \\ 表示字符\
        \n 表示换行符
        \r 表示回车符
        \t 表示Tab
        \ u#### 表示一个Unicode编码的字符
         */

        int age=25;
        String ss="age is"+age;
        System.out.println(ss);
        String ss1= """
                sdaf
                asdf
                asdf
                dasf
                """;
        System.out.println(ss1);

        //数组
        int[] ns =new int[5];
        System.out.println(ns.length);

        Person person1=new Person();
        person1.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]


        String s1="liuhao";
        String s2="liuchen";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        s1.startsWith("liu");
        s1.endsWith("liu");
        s1.lastIndexOf("c");

        char[] cs ="Hello".toCharArray();
        String sss=new String(cs);

    }
}

