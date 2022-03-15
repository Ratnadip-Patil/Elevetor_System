
package com.Elevetor;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Elevator r = new Elevator();
        r.lift();
    }

    // Variable
    Scanner sc = new Scanner(System.in);
    final int maxfloor = 20;
    final int minfloor = 0;
    int currfloor = 0;
    int desfloor  ;

    //Functions
    void goUp() {
        while (currfloor++ < desfloor){
            System.out.println("Going Up " + currfloor);
        }
    }
    void goDown () {
        while (currfloor-- > desfloor) {
            System.out.println("Going Down " + currfloor);
        }
    }
    void lift(){
        System.out.print("Enter the Floor : ");
        desfloor = sc.nextInt();
        if (desfloor < minfloor || desfloor > maxfloor || desfloor == currfloor){
            System.out.println("You have entered wrong floor");
        }
        else if (desfloor > currfloor){
            goUp();
            System.out.println("Door Opening....");
            System.out.println("Door Closing....");
            currfloor = desfloor;
        }else if (desfloor < currfloor){
            goDown();
            System.out.println("Door Opening....");
            System.out.println("Door Closing....");
            currfloor = desfloor;
        }

        lift();
    }

}
