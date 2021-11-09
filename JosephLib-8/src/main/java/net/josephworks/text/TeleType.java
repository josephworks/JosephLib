package net.josephworks.text;

public class TeleType {
    public void print(int speed, String... string) {
        for (String s : string) {
            System.out.println(s);
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
