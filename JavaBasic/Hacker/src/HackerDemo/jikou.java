package HackerDemo;

interface jiekou{
    void  run();
    String getName();
    default void test(){
        System.out.println("sdf");
    }
    public static int liuhao=1;
}

class jk1 implements jiekou {
    private String name;

    public jk1(String name ){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void test(){
        System.out.println("asdf");
    }
}