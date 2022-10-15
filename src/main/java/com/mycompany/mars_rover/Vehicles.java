package com.mycompany.mars_rover;

class Vehicles {
    Location location;

    public Vehicles(Location location) {
        this.location = location;

    }

    public Vehicles(long x, long y, Heading heading) {
        this.location = new Location(x, y, heading);

    }

    public void print() {
        this.location.print();
    }
}