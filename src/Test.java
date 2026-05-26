interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    public void show() {
        System.out.println("Resolved in class");
    }
}



public class Test {
    public static void main(String[] args) {
        C objc=new  C();
        objc.show();
    }
}
