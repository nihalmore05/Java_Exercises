package OOP_P2_DAY_10_THROW_THROWS;

//5. Create custom exception   class.

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptioncalss {
    public static void main(String[] args) {
        int age = 18;
        try {
            checkAge(age);
            System.out.println("You are elegeblel! You can Vote.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You cannote vote. you are age under 18");
        }
    }
}
