import java.util.List;
import java.util.ArrayList;
import java.lang.*;
import java.util.SimpleTimeZone;

public class fanxing {
    public static void main(String[] arg){
        myList<Integer> l1=new myList<Integer>();
        myList<Float>   l2=new myList<Float>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        List<Float> l4=new ArrayList<Float>();
        l4.add(234.234f);


        List l5 =new ArrayList();//编译器警告

        List<Number> l6 = new ArrayList<Number>();
        l6.add(123);
        l6.add(12.34);
        List<Number> l7 =new ArrayList<>();


    }

    static int add(Pairr<? extends Number> p){
        Number first =p.getFirst();
        Number last=p.getLast();
        return first.intValue() + last.intValue();
    }
}
class Pairr<T> {
    private T first;
    private T last;
    public Pairr(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
}

class Pair2<T extends Number>{
    //可以指定传入参数
}


class myList<T> {//类似于Arraylist实现
    private T[] array;
    private int size;
    public void add(T e){
        array[size]=e;size++;
    }
    public void remove(int index){
        for(int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
    }
    public T get(int index){
        return array[index];
    }

}

//泛型接口
class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name,int score){
        this.name=name;
        this.score=score;
    }

    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }

    //public int compareTo(Person other){
    //    return this.score.compareTo(other.score);
    //}基元不可以

    public String toString(){
        return this.name+","+this.score;
    }
}

class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    // 静态泛型方法应该使用其他类型区分:
    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }
}