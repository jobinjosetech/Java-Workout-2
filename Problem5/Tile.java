//Java Workout-2, Problem-5

package Problem5;

//class Tile
public class Tile {
    float edgeLength;
    //constructor to store edge length of tile.
    Tile(float edgeLength) {
        this.edgeLength = edgeLength;
    }
}
//class Floor
class Floor {
    float width;
    float height;
    //constructor to store width and height of floor.
    Floor(float width, float height) {
        this.width = width;
        this.height = height;
    }
    //Method totalTiles.
    void totalTiles(Tile t) {
        //get edgeLength from class Tile.
        float edgeLength = t.edgeLength;
        //calculating tile area.
        float tileArea = edgeLength*edgeLength;
        //calculating floor area.
        float floorArea = width*height;
        //calculating tile needed for the floor area.
        float tilesNeeded = floorArea / tileArea;
        //display total tiles needed.
        System.out.println(String.format("Total tile needed is: %.1f", tilesNeeded));
    }
    //Main Method
    public static void main(String a[]) {
        //Object of class Tile.
        Tile tile = new Tile(10);
        //Object of class Floor
        Floor floor = new Floor(100, 200);
        floor.totalTiles(tile);
    }
}