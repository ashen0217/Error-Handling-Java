public class AgeValidator {

    public static void validateAge(int age) throws AgeValidation {
        if (age < 0 || age > 120) {
            throw new AgeValidation("Age must be between 0 and 120. Provided: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args){
        try {
            validateAge(70); // This will throw the exception
        } catch (AgeValidation e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
