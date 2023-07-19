package s23assignment2;

public class ClocksDemo {
    public static void main(String[] args) {
    	// Create Clock, WorldClock, and AlarmClock instances
    	Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(-4);
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setAlarm(12, 20);         
        Clock[] clocks = { clock, worldClock, alarmClock };// Store clocks in an array of Clock type
        
        // Loop through the array and retrieve time from each clock
        for (int i = 0; i < clocks.length; i++) {           
            String className = clocks[i].getClass().getSimpleName();// Get the class name using reflection        
            String time = clocks[i].getTime();// Retrieve the time using polymorphism
            System.out.println(className + ": " + time);
            
           className = clocks[i].getClass().getSimpleName();//test if the alarm is clear off
            time = clocks[i].getTime();
            System.out.println(className + ": " + time);
        }

    }
}
/*
 *Static Polymorphism (compile-time polymorphism), method overloading.
 *Dynamic Polymorphism(runtime polymorphism), method overriding. 
 *Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
 *objects of a subclass can be treated as objects of its superclass, enables abstraction, flexibility, and code organization.
 */
/*
 * Inheritance establishes a hierarchical relationship(is-a) between classes, allowing for code reuse and specialization.
 * Polymorphism can perform a task in multiple ways. It is applied to the functions or methods.
 * allows the object to decide which form of the function to implement 
 * enables objects to exhibit different behaviors and be treated through dynamic binding and method overriding. 
 * Together, leading to more modular and maintainable software systems.
 */
