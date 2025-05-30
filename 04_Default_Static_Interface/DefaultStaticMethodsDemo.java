// Interface I with default methods
interface I {
    // Default method with a default implementation
    default void momo() {
        System.out.println("Momo tastes gooood!!");
    }

    // Another default method
    default void pizza() {
        System.out.println("Pizza is decent");
    }
}

// Interface J with a static method
interface J {
    // Static method that can be called using the interface name
    static void chowmein() {
        System.out.println("Chowmein tastes the best");
    }
}

// Class K implements interface I and overrides the momo() method
class K implements I {
    @Override
    public void momo() {
        System.out.println("To be honest, Momo tastes better than chowmein");
        // Call the default method momo() from interface I
        I.super.momo();
    }
}

public class DefaultStaticMethodsDemo {
    public static void main(String[] args) {

        // Creating a reference of interface I pointing to an object of class K
        I i = new K();

        // Calling default method from interface I
        i.pizza();

        // Calling static method from interface J
        J.chowmein();

        // Calling overridden method from class K
        i.momo();
    }
}
