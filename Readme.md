# Mars_Rover_First_Solution

### Problem Description

You are part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. Develop an API that translates the commands sent from earth to instructions that are understood by the rover.

When the rover touches down on Mars, it is initialised with it’s current coordinates and the direction it is facing. These could be any coordinates, supplied as arguments (x, y, direction) e.g. (4, 2, EAST).

### Approach

You should tackle this problem as you would any real world requirement that would be shipped as part of a real product. You should showcase how you work and the way you decompose a problem into smaller pieces.

Part I
The rover is given a command string which contains multiple commands. This string must then be broken into each individual command and that command then executed. The valid commands are:

F -> Move forward on current heading 
B -> Move backwards on current heading 
L -> Rotate left by 90 degrees
R -> Rotate right by 90 degrees

● An example command might be FLFFFRFLB
● Once the full command string has been followed, the rover reports it’s current coordinates and heading in the format (6, 4) NORTH
● As Mars is a globe, there is no ‘Edge of the world’ to fall off, so negative coordinates are valid.

OUTPUT
The output for each rover should be its final co-ordinates and heading.

#### INPUT AND OUTPUT

Test Input:

4 2 East
FLFFFRFLB

Expected Output:
(6, 4) NORTH

### Runinng
To run the application:
Open the application in Apache NetBeans IDE.

#### App Classes:
Mars_Rover.java  --> (Main class)
Location.java    
Vehicles.java
Pair.java


