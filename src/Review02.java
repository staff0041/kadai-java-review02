
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            String resultMsg;
            if (i % 15 == 0) {
                resultMsg = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultMsg = "Fizz";
            } else if (i % 5 == 0) {
                resultMsg = "Buzz";
            } else {
                resultMsg = String.valueOf(i);
            }
            System.out.println(resultMsg);
        }

    }

}
