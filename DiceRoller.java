import java.util.Random;

public class DiceRoller {

    public static int roll(int diceNum, int diceFaces, Boolean advantage, Boolean disadvantage){
        Random rand = new Random();
        int count = 0;
        int total = 0;

        if (advantage){
            int num1 = rand.nextInt(diceFaces) + 1;
            int num2 = rand.nextInt(diceFaces) + 1;

            if(num1>num2){
                return num1;
            } else {
                return num2;
            }
        }else if (disadvantage){
            int num1 = rand.nextInt(diceFaces) + 1;
            int num2 = rand.nextInt(diceFaces) + 1;

            if(num1>num2){
                return num2;
            } else {
                return num1;
            }
        }else {
            while (diceNum > count) {
                int num1 = rand.nextInt(diceFaces) + 1;
                total += num1;
                count++;
            }
            return total;
        }
    }
}
