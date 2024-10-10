class OuterClass {
    
    public interface NestedInterface {
        void display();
    }
}

class InnerClass implements OuterClass.NestedInterface {
    @Override
    public void display() {
        System.out.println("Hello from - nested interface");
    }
}

public class NestedInterfaceEx {
    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
