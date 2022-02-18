interface MyInterface<T extends ClassA>{
    T sayHello(T a, T b);
}

// extends doesn't mean MyClass extends ClassA
// it means Abc must extend/implement ClassA

class MyClass<Abc extends ClassA> implements MyInterface<Abc> {

    @Override
    public Abc sayHello(Abc a, Abc b) {
        b.doStuff(); //extends
        return a;
    }
}

class ClassA{
    void doStuff(){
        System.out.println("Hello from class A");
    }
}

public class GenericInterfaces {
    public static void main(String[] args) {
//        MyClass<Integer> myClass = new MyClass<>();
//        myClass.sayHello(123);
//        MyClass<String> myClass2 = new MyClass<>();
//        myClass2.sayHello("123");
//        MyClass<Float> myClass3 = new MyClass<>();
//        myClass3.sayHello(1.23f);
//
//        // Example without angle brackets
//        MyClass myClass4 = new MyClass();
//        myClass4.sayHello(1.23f); // as long as its Object it will accept
//        myClass4.sayHello("123");
//        myClass4.sayHello(123);

        MyClass<ClassA> myClass = new MyClass<>();
        myClass.sayHello(new ClassA(), new ClassA()); // enforces its always something that can do doStuff();
    }
}
