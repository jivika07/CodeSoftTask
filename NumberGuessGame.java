import java.util.*;
 class NumGuessGame {
    public static void main(String[] args){
        Random random =new Random();
        Scanner sc =new Scanner(System.in);
        int lowerLimit=1;
        int upperLimit=100;
        int chances=0;
        int maxChances=10;
        int numToGuess=random.nextInt(upperLimit-lowerLimit+1);
        System.out.println("Please Choose a number between "+lowerLimit+" and "+upperLimit);
        while(chances<maxChances){
            System.out.println("Enter your number guess: ");
            int userGuess=sc.nextInt();
            chances++;
            if(userGuess==numToGuess){
                System.out.println("Congratulations!! You're correct!!");
                break;
            }
            else if(userGuess<numToGuess){
                System.out.println("Try a Bigger Number");

            }
            else{
                System.out.println("Try a Smaller Number");
            }

        }
        if (chances==maxChances){
            System.out.println("You've reached the maximum number of attempts.The correct Answer was "+numToGuess);

        }
        System.out.println("Thanks for Playing!");
        
    }
}
