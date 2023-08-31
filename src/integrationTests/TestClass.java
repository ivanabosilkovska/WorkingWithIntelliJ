package integrationTests;

public class TestClass {

    public int getAge() {
        return age;
    }

    public TestClass(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        sayHello("Sofija");
        sayGoodBye("Tea");
        System.out.println("amend1");

        System.out.println("pushing");

        System.out.println(" git bash push");

        // EDNA LINIJA NA KOMENTAR

        System.out.println("Learning IntelliJ");
        System.out.println("Learning GIT");
        System.out.println("commiting using Intellij- test");
        System.out.println("Git GUI");

    }

    private int age = 5;

    public static void sayHello(String name){
        // TODO: Add support for multiple users
        // TODO: To be run once Bug - 548 is fixed
        System.out.println("Hello " +name);

    }

    public static void sayGoodBye(String name){
        System.out.println("Good bye " +name);
    }

}
