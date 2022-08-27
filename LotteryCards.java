package lotery;
import java.util.*;
public class LotteryCards {
    private static final int max_number = 15;

    private static final int min_number = 10;

    private static final int no_number = 0;

    private Random random;

    private int number;

    private int colour; 

    public LotteryCards (){
        random = new Random();
        number = no_number;
        colour = no_number;

    }
    public void createNumber(){
        number = random.nextInt(max_number-min_number+1) + min_number;
        colour = random.nextInt(4);

    }
    public int showNumber(){
        return number;
    }
    public int Colour(){
        return colour;
    }
}
