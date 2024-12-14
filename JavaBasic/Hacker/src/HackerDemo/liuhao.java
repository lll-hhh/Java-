package HackerDemo;
import java.util.Arrays;
import java.util.Scanner;

public class liuhao{
    public static void main(String[] args){
        int[] ns =new int[5];
        ns[0]=68;
        ns[1]=32;
        double a= 2.44354;
        int b=1;
        System.out.printf("%.4f\n",a);
        System.out.printf("%e\n",a);
        //System.out.printf("%x\n",a);

        //输入
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input your name: ");
        String name=scanner.nextLine();
        System.out.print("Input your age: ");
        int age =scanner.nextInt();
        System.out.printf("sadfg\n");
        System.out.println(Arrays.toString(ns));

        for(String arg: args){
            if("-version".equals(arg)){
                System.out.println("v 1.0");
                break;
            }
        }

    }
}
