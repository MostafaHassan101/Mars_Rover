package com.mycompany.mars_rover;

class Location {
    Pair<Number, Number> Coordinates = new Pair<Number, Number>(0, 0);
    Heading heading;

    public Location(long x, long y, Heading heading) {
        this.Coordinates.Frist = x;
        this.Coordinates.Second = y;
        this.heading = heading;

    }

    public Location(Pair<Number, Number> coordinates, Heading heading) {
        this.Coordinates = coordinates;
        this.heading = heading;
    }

    public void print() {
        System.out.println( "("+ this.Coordinates.Frist + ", " + this.Coordinates.Second + ") " + this.heading);
    }
// Forward
    public static void Forward_East(Location location, long step) {

        location.Coordinates.Frist = (long) location.Coordinates.Frist + step;
    }
    public static void Forward_West(Location location, long step) {

        location.Coordinates.Frist = (long) location.Coordinates.Frist - step;
    }
    public static void Forward_North(Location location, long step) {

        location.Coordinates.Second = (long) location.Coordinates.Second + step;
    }
    public static void Forward_South(Location location, long step) {
        location.Coordinates.Second = (long) location.Coordinates.Second - step;
    }

// Backward
public static void Backward_East(Location location, long step) {

    location.Coordinates.Frist = (long) location.Coordinates.Frist - step;
}
public static void Backward_West(Location location, long step) {

    location.Coordinates.Frist = (long) location.Coordinates.Frist + step;
}
public static void Backward_North(Location location, long step) {

    location.Coordinates.Second = (long) location.Coordinates.Second - step;
}
public static void Backward_South(Location location, long step) {
    location.Coordinates.Second = (long) location.Coordinates.Second + step;
}

//Left

public static void Left_East(Location location, long step) {

    location.heading = Heading.North;
}
public static void Left_West(Location location, long step) {

    location.heading = Heading.South;
}
public static void Left_North(Location location, long step) {

    location.heading = Heading.West;
}
public static void Left_South(Location location, long step) {
    location.heading = Heading.East;
}


//Right
public static void Right_East(Location location, long step) {

    location.heading = Heading.South;
}
public static void Right_West(Location location, long step) {

    location.heading = Heading.North;
}
public static void Right_North(Location location, long step) {

    location.heading = Heading.East;
}
public static void Right_South(Location location, long step) {
    location.heading = Heading.West;
}

}