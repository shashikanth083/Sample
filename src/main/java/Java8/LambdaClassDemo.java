package Java8;

public class LambdaClassDemo {

    public static void main(String[] args) {
        // method implemented here
        LambdaInterfaceDemo lambdaInterfaceDemo = (int x) -> x * x;
        System.out.println(lambdaInterfaceDemo.getSquare(10));

        // method implemented inside the class
        LambdaInterfaceImpl lambdaInterfaceImpl = new LambdaInterfaceImpl();
        System.out.println(lambdaInterfaceImpl.getSquare(5));
    }
}
