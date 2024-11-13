public class FirstClass {
    public static void main(String[] args) {
        czyRokJestPrzestepny(2025);
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber == secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }
    private static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;

        System.out.println(result);
    }
    private static void czyRokJestPrzestepny(int rok){
        if(rok%4==0){
            if(rok%100==0){
                if(rok%400==0){
                    System.out.println(rok+"przestepny");


                }
                else{
                    System.out.println(rok+"nie przestepny");
                }


            }
            else{
                System.out.println(rok+"przestepny");
            }
        }
        else {
            System.out.println(rok + "nie jest przestepny");
        }
    }
    String[] movies = new String[3];
    movies[0] = "Harry Potter";
    movies[1] = "Lord of the Rings";
    movies[2] = "Forest Gump";
}





