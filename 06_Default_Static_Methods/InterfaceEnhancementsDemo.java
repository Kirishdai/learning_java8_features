// Interface I with a default method
interface I {
    default void identity() {
        System.out.println("My name is Krish Karki");
    }
}

// Interface J with a default method that has the same signature as in I
interface J {
    default void identity() {
        System.out.println("My name is Henry Cavill");
    }
}

// Interface K with a static method (can only be called via Interface name)
interface K {
    static void identity() {
        System.out.println("I am Batman");
    }
}

// Class A implements both I and J, so it must override the conflicting default method
class A implements I, J {

    @Override
    public void identity() {
        // Resolving conflict between I and J
        System.out.println("My name is James Gunn");

        // Optionally, we can still call the default methods from I and J like this:
        I.super.identity();
        J.super.identity();
    }
}

// Class B extends A, so it inherits A's implementation of identity()
class B extends A {
    // No need to override identity(), will inherit from A
}

// Main class to demonstrate everything
public class InterfaceEnhancementsDemo {
    public static void main(String[] args) {
        A a = new B(); // Polymorphic reference
        a.identity();  // Calls A's overridden identity()

        K.identity();  // Calls static method in interface K directly
    }
}
