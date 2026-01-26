import java.time.Clock;
public class Foo {
    // Java program for creating instance of Clock
        // main method
        public static void main(String[] args) {

            // creating a Clock instance using
            // systemUTC() method of Clock class
            Clock clock = Clock.systemUTC();

            // getting the current instant defined by clock
            System.out.println("UTC time = " + clock.instant());
        }
    }

