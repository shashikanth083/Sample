package Java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    public void test();

    public default void test_defaultHelloWorld() {
        System.out.println("Default Hello World");
    }

    public static void test_staticHelloWorld() {
        System.out.println("Static Hello World");
    }
}
