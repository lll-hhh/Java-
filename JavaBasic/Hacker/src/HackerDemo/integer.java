package HackerDemo;
import java.lang.Integer;
public class integer {
    public static void main()
    {
        int a=1;
        Integer a1=Integer.valueOf(234);
        int x=a1.intValue();

        int x1 =Integer.parseInt("100");
        int x2=Integer.parseInt("100",16);

        System.out.println(Integer.toString(100)); // "100",表示为10进制
        System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
        System.out.println(Integer.toHexString(100)); // "64",表示为16进制
        System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
        System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制
    }
}
