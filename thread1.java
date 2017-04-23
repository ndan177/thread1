package javaapplication7;

class ForThreadRunning implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i+ " running ");
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
            break;
        }
        }
    }
}

public class JavaApplication7 extends Thread{

    public static void main(String[] args) {
    ForThreadRunning ob= new ForThreadRunning();
    
    Thread thread = new Thread(ob);
    thread.start();
    }
    
}
        