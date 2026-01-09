package Day6;
import java.util.Scanner;

// User-defined exceptions
class InvalidHourException extends Exception {
    public InvalidHourException(String message) { super(message); }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String message) { super(message); }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String message) { super(message); }
}

class Time {
    int hours, minutes, seconds;

    void getTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        sc.close();
    }

    void validateTime() throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        if (hours > 24 || hours < 0) {
            throw new InvalidHourException("InvalidHourException: hour is not greater than 24");
        }
        if (minutes > 60 || minutes < 0) {
            throw new InvalidMinuteException("InvalidMinuteException: minute is not greater than 60");
        }
        if (seconds > 60 || seconds < 0) {
            throw new InvalidSecondException("InvalidSecondException: second is not greater than 60");
        }
    }
}

public class TimeException {
    public static void main(String[] args) {
        Time t = new Time();
        t.getTime();

        boolean valid = true;

        try {
            t.validateTime();
        } catch (InvalidHourException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
            valid = false;
        } catch (InvalidMinuteException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            valid = false;
        } catch (InvalidSecondException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            valid = false;
        }

        if (valid) {
            System.out.println("Correct Time-> " + t.hours + ":" + t.minutes + ":" + t.seconds);
        }
    }
}

