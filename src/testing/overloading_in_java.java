package testing;

public class overloading_in_java
{
	public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
    	overloading_in_java.foo();
    	overloading_in_java.foo(10);
    }
}
