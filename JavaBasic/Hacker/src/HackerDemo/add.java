package HackerDemo;

public class add {
    public static void main(String[] args){
    Adder liuhao=new Adder(1);
    liuhao.add(2143).add(1243);
    liuhao.outp();
    }
}

class Adder{
    private int aa;

    Adder(int a){
        this.aa=a;
    }
    public Adder add(int a){
        this.aa+=a;
        return this;
    }

    public void outp(){
        System.out.println(this.aa);
    }
}
