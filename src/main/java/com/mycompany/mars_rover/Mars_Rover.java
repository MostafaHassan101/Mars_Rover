package com.mycompany.mars_rover;

import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.reflect.Method;

enum Heading {
    West, East, North, South
}

public class Mars_Rover {
public static void main(String[] args) throws Exception {
        
        Scanner myObj = new Scanner(System.in);
        
    //Input Valuses
        int coor1 = myObj.nextInt();
        int coor2 = myObj.nextInt();
        String dir = myObj.next();
        String command = myObj.next(); 

        
               Vehicles vehicles = new Vehicles(coor1, coor2, Heading.valueOf(dir));

        Map<Pair<Character, Heading>, Method> Domap = new Hashtable();

            //Forward
                Domap.put(new Pair<Character, Heading>('F', Heading.East),
                Location.class.getMethod("Forward_East", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('F', Heading.West),
                Location.class.getMethod("Forward_West", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('F', Heading.North),
                Location.class.getMethod("Forward_North", Location.class, long.class));
            
                Domap.put(new Pair<Character, Heading>('F', Heading.South),
                Location.class.getMethod("Forward_South", Location.class, long.class));
            //Backward
                Domap.put(new Pair<Character, Heading>('B', Heading.East),
                Location.class.getMethod("Backward_East", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('B', Heading.West),
                Location.class.getMethod("Backward_West", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('B', Heading.North),
                Location.class.getMethod("Backward_North", Location.class, long.class));
            
                Domap.put(new Pair<Character, Heading>('B', Heading.South),
                Location.class.getMethod("Backward_South", Location.class, long.class));

            //Left

                Domap.put(new Pair<Character, Heading>('L', Heading.East),
                Location.class.getMethod("Left_East", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('L', Heading.West),
                Location.class.getMethod("Left_West", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('L', Heading.North),
                Location.class.getMethod("Left_North", Location.class, long.class));
            
                Domap.put(new Pair<Character, Heading>('L', Heading.South),
                Location.class.getMethod("Left_South", Location.class, long.class));
                
            // Right
                Domap.put(new Pair<Character, Heading>('R', Heading.East),
                Location.class.getMethod("Right_East", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('R', Heading.West),
                Location.class.getMethod("Right_West", Location.class, long.class));

                Domap.put(new Pair<Character, Heading>('R', Heading.North),
                Location.class.getMethod("Right_North", Location.class, long.class));
            
                Domap.put(new Pair<Character, Heading>('R', Heading.South),
                Location.class.getMethod("Right_South", Location.class, long.class));

//        vehicles.print();
 
        for(int i=0; i<command.length();i++ )
        {
            Domap.get(new Pair<Character, Heading>(Character.toUpperCase(command.charAt(i)),
            vehicles.location.heading)).invoke(null,
                    vehicles.location,
                    1);
        }
        
        vehicles.print();

    }
}