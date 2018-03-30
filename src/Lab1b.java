// Lab1b.java
// This is a practice lab to output a few verses of "99 bottles of beer on the wall"
// Authors: Carol Zander, Clark Olson, you

public class Lab1b {

    public static void main(String[] args) {
        int numBottles;                // number of bottles currently on the wall

        // display first verse
        numBottles = 5;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 4;
        System.out.print(numBottles);
        onWall();
        System.out.println();          // display blank line between verses

        // display second verse
        // [this is where you take over]

        // Second Verse
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 3;
        System.out.print(numBottles);
        onWall();
        System.out.println();

        // Third Verse
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles = 2;
        System.out.print(numBottles);
        onWall();
        System.out.println();

        // Fourth Verse
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        System.out.println("If one of those bottles should happen to fall");
        numBottles = 1;
        System.out.println(numBottles + " bottle of beer on the wall");
        System.out.println();

        //Final Verse
        System.out.println(numBottles + " bottle of beer on the wall");
        System.out.println(numBottles + " bottle of beer");
        takeOneDown();
        System.out.println("No more bottles of beer on the wall");
    }

    public static void onWall() {
        System.out.println(" bottles of beer on the wall");
    }

    public static void botBeer() {
        System.out.println(" bottles of beer");
    }

    public static void takeOneDown() {
        System.out.println("Take one down and pass it around");
    }

}