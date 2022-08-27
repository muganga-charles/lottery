package lotery;

public class RoomWinner {
    public static void main(String[] args) {

        LotteryCards one,two,three;

        one = new LotteryCards();
        two = new LotteryCards();
        three = new LotteryCards();

        one.createNumber();
        two.createNumber();
        three.createNumber();

;       System.out.println("Winning Card Combination: ");
        System.out.println("1 - red; 2 - green; 3 - blue");
        System.out.println(" ");

        System.out.println("\tcolor number");
        System.out.println("Card 1: " + one.Colour( )
        + "\t " + one.showNumber( ));
        System.out.println("Card 2: " + two.Colour( )
        + "\t" + two.showNumber( ));
        System.out.println("Card 3: " + three.Colour( )
        + "\t" + three.showNumber( ));
    }
    
}
