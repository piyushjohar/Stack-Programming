/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Stack;

/**
 *
 * @author pj
 */
public class towerOfHanoi {
        
    public static void main(String[]args){
        //int[] fromStackArr = new int[10];
        //int[] toStackArr = new int[10];
        //int[] helpStackArr = new int[10];
        Stack fromStack = new Stack();
        Stack toStack = new Stack();
        fromStack.add(10);
        fromStack.add(9);
        fromStack.add(8);
        fromStack.add(7);
        fromStack.add(6);
        fromStack.add(5);
        fromStack.add(4);
        fromStack.add(3);
        fromStack.add(2);
        fromStack.add(1);
                
        //Tower of hanoi using arrays
        String steps = toh(3,1,3);
        System.out.println("Tower of Hanoi using arrays \n" + steps);
        
        //tower og hanoi using stacks
        tohUsingStacks(10, fromStack, toStack);
        System.out.println("\n Tower of Hanoi using arrays \n" + toStack);
        
    }
    public static String toh(int n, int fromPeg, int toPeg){
         String sol1,sol2,mySol, solution;
         int helpPeg;
        if(n==1){
            return fromPeg + " --> " + toPeg ;
        }
        else{
            helpPeg=6-fromPeg-toPeg;
            sol1 = toh(n-1, fromPeg, helpPeg);
            mySol = fromPeg + " --> " + toPeg ;
            sol2 = toh(n-1, helpPeg, toPeg);
            solution = sol1 + "\n" +  mySol + "\n" + sol2;
            return solution;
        }
    }
    public static void tohUsingStacks(int n, Stack fromStack, Stack toStack){
        int top;
        Stack helpStack = new Stack();
        if(n==1){
            top = (int)fromStack.pop();
            toStack.push(top);
        }
        else{
            tohUsingStacks(n-1, fromStack, helpStack);
            tohUsingStacks(1, fromStack, toStack);
            tohUsingStacks(n-1, helpStack, toStack);
        }
    }
}

