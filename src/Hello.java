public class Hello{
    public void sayHello(String name){
        System.out.println("Hello my name is " + name + "!");
        System.out.println("You have been hacked again");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello("Mathew");
    }
}
