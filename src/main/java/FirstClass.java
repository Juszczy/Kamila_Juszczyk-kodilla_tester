public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        String example = sayHello();
        System.out.println(example);// [3]
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }
}