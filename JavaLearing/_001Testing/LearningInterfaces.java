package JavaLearing._001Testing;

public class LearningInterfaces {

}

@FunctionalInterface
interface MyInterface {
    void add();
}

@interface MyAnnotation {
    String value() default "praveen";
    int age() default 36;
}

@MyAnnotation
class SampleClass {
    sampleMethod(){
        System.out.println(String.value());
    }
}
