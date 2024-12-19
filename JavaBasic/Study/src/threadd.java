import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class threadd {
    public static void main(String[] args){


        Thread t0=new Thread();
        Thread t1=new MyThread();
        Thread t2=new Thread(new MyRunnable());
        Thread t3=new Thread(()->{
            System.out.println("lambda");
        });
        t0.start();
        t1.start();
        t2.start();
        t3.start();

        Thread t4=new MyThread2();
        //t4.start();

        MyThread3 t5=new MyThread3();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("DS");
        }

        t5.running=false;

        //守护线程
        Thread t6=new MyThread3();
        t6.setDaemon(true);
        t6.start();

        //线程池
        ExecutorService executor =Executors.newFixedThreadPool(3);
        //executor.submit(task1);

        for(int i=0;i<6;i++){
            executor.submit(new Task(""+i));
        }
        executor.shutdown();//关闭线程池
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("new Thread");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("MyRunnable");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        Thread hello =new HelloThread();
        hello.start();
        try {
            hello.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
    }
}
class HelloThread extends Thread{
    @Override
    public void run(){
        int n=0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"hello");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                break;
            }
        }
        System.out.println("end!");
    }
}

class MyThread3 extends Thread{
    public volatile boolean running=true;
    public void run(){
        int n=0;
        while(running){
            n++;
            System.out.println(n+"sleep");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("OK");
            }
        }
        System.out.println("end!");
    }
}
class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
