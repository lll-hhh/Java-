public class threadd {
    public static void main(String[] args){
        Thread t=new Thread();
        t.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("new Thread");
    }
}
