
/**
 * THE FINAL KEYWORD
 * Definition: Used to restrict the user in various ways.
 * 
 * 1. Final Variable: Cannot change its value (constant).
 * 2. Final Method: Cannot be overridden.
 * 3. Final Class: Cannot be inherited (extended).
 */

// Final class - cannot be extended
final class ImmutableBase {
    void show() {
        System.out.println("Base method in a final class.");
    }
}

// class Child extends ImmutableBase {} // COMPILE ERROR

class Parent {
    // Final method - cannot be overridden
    final void displaySecurityCode() {
        System.out.println("Secret Code: 12345");
    }
}

class Child extends Parent {
    // void displaySecurityCode() {} // COMPILE ERROR
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Final variable
        final int MAX_SPEED = 120;
        // MAX_SPEED = 150; // COMPILE ERROR

        System.out.println("Maximum allowed speed: " + MAX_SPEED);
        
        Parent p = new Parent();
        p.displaySecurityCode();
        
        ImmutableBase base = new ImmutableBase();
        base.show();
    }
}
