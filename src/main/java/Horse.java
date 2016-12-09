/**
 * Created by Antoine on 09.12.2016.
 */
public class Horse implements Runnable {

    private volatile int x;
    private int number;
    private static int finish = 1;
    final int FINISH = 1000;
    final int STEP = 200;

    public Horse() {
    }

    public Horse(int number) {
        this.number = number;
    }

    public void run() {

        System.out.println(number + " Лошадь стартовала.");

        while(x < FINISH) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x += STEP;
            System.out.println(number + " Лошадь прошла " + x + " метров" +
                ". До финиша осталось " + (FINISH - x) + " метров.");
        }

        synchronized (this) {
            System.out.println(number + " Лошадь заняла " + finish++ + " место.");
        }
    }

}
