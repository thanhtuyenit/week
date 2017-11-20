public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Tuyen";
        myAge = 22;     // not a lie
        myHeight = 74;  // inches
        myWeight = 114; // lbs
        myEyes = "Blue";
        myTeeth = "White";
        myHair = "Brown";

        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "She's " + myHeight + " inches (or "+ (myHeight*2.54)+ ") tall." );
        System.out.println( "She's " + myWeight + " pounds(or "+(myWeight*0.4535923)+") heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "She's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "Her teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
            + " I get " + (myAge + myHeight + myWeight) + "." );
    }
}