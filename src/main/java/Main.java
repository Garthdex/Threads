/**
 * Created by Antoine on 09.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Horse(1));
        Thread thread2 = new Thread(new Horse(2));
        Thread thread3 = new Thread(new Horse(3));
        Thread thread4 = new Thread(new Horse(4));
        Thread thread5 = new Thread(new Horse(5));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
