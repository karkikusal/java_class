import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // take input from user, S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S,P,R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User gave this input>>"+userMove);


        //make computer to make there move
        char[] arr = {'S','R','P'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove =arr[guessNumber];
        System.out.println(arr[guessNumber]);

        //computer = user -> draw!!
        //user while "R" -: c wins!
        //user wins
        //user "p"
        //computer "R" -: U wins!
        //c wins

        //user "R"
        //computer "R" -: U wins!
        // C wins
        if(computerMove==userMove){
            System.out.println("draw.No won!");
        } else if (computerMove=='R') {
            if (userMove =='s'){
                System.out.println("computer won");
            }else{
                System.out.println("user won");
            }

        } else if (computerMove =='s') {
            if(userMove == 'R'){

                System.out.println("user won");
            } else{
                System.out.println("computer won");
            }

        } else {
            if (userMove == 's') {
                System.out.println("user won");
            }else{
                System.out.println("computer won");

            }
        }


    }
}