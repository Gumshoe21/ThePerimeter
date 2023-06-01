package main.java;

import java.util.concurrent.TimeUnit;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class Main {
  public static void main(String[] args) {

    /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to The Perimeter.");
        System.out.println("My name is...");
        System.out.println("...not important.");
        System.out.print("However... yours is... what is your name?");
        String name = scan.next();
        System.out.print(String.format("%s... interesting. Very interesting.", name));

        Timer timer = new Timer();
        timer.schedule(
            new TimerTask() {
              @Override
              public void run() {
                System.out.print("Wow COOL!!!!!");
              }
            },
            4000);
    */
    // Use Ansi.ansi() to generate the ANSI encoded output

    AnsiConsole.systemInstall();
    System.out.println(Ansi.ansi().fg(Ansi.Color.GREEN).bg(Ansi.Color.BLACK).a("Hi").reset());
    AnsiConsole.systemUninstall();

    System.out.print("First part, ");
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.print("second part.");
  }

  class LineFragment {}
}
