public class HelloWorld {
    public static void main(String args[]) {
        Person a = new Person("Canh", 21, 1.7f);

        a.eat("Rice");
        int age = a.getAge();
        System.out.println("His age:"+age);
    }
}
