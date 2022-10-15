# Mars_Rover_First_Solution

### Problem Description

You are part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet.<br />
Develop an API that translates the commands sent from earth to instructions that are understood by the rover. <br />

When the rover touches down on Mars, it is initialised with it’s current coordinates and the direction it is facing. <br />
These could be any coordinates, supplied as arguments (x, y, direction) e.g. (4, 2, EAST). <br />

### Approach

You should tackle this problem as you would any real world requirement that would be shipped as part of a real product. <br />
You should showcase how you work and the way you decompose a problem into smaller pieces.<br />

Part I<br />
The rover is given a command string which contains multiple commands.<br />
This string must then be broken into each individual command and that command then executed. <br />
The valid commands are: <br />

F -> Move forward on current heading <br />
B -> Move backwards on current heading <br />
L -> Rotate left by 90 degrees <br />
R -> Rotate right by 90 degrees <br />

● An example command might be FLFFFRFLB<br />
● Once the full command string has been followed, the rover reports it’s current coordinates and heading in the format (6, 4) North <br />
● As Mars is a globe, there is no ‘Edge of the world’ to fall off, so negative coordinates are valid. <br />

OUTPUT<br />
The output for each rover should be its final co-ordinates and heading. <br />

#### INPUT AND OUTPUT

Test Input: <br />

4 2 East <br />
FLFFFRFLB <br />

Expected Output:<br />
(6, 4) North <br />

### Runinng
To run the application: <br />
Open the application in Apache NetBeans IDE.<br />

#### App Classes:   
Mars_Rover.java  --> (Main class) <br />
Location.java    <br />
Vehicles.java   <br />
Pair.java       <br />
