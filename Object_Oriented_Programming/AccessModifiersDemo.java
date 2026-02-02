
/**
 * ACCESS MODIFIERS
 * Definition: Keywords that set the accessibility (visibility) of classes, 
 * interfaces, variables, and methods.
 * 
 * 1. public: Accessible everywhere.
 * 2. private: Accessible only within the same class.
 * 3. protected: Accessible in the same package and subclasses.
 * 4. default (no keyword): Accessible only within the same package.
 */

class DataHolder {
    public String publicField = "Public: Everyone can see me";
    private String privateField = "Private: Only DataHolder can see me";
    protected String protectedField = "Protected: Package and subclasses can see me";
    String defaultField = "Default: Only package members can see me";

    public void showPrivate() {
        // Private fields are accessible within the same class
        System.out.println("Accessing from within class: " + privateField);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        DataHolder dh = new DataHolder();

        System.out.println(dh.publicField);     // OK
        System.out.println(dh.protectedField);  // OK (same package)
        System.out.println(dh.defaultField);    // OK (same package)
        
        // System.out.println(dh.privateField); // COMPILE ERROR: privateField has private access in DataHolder
        
        dh.showPrivate(); // OK: Calls a public method that accesses the private field
    }
}
