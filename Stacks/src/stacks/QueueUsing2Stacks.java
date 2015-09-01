/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author pj
 */
public class QueueUsing2Stacks {
    public static void main(String [] args){
        Stack s1 = new Stack();
        Stack s2 = new Stack();                
        System.out.println("Enter the operation you wish to perform: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input!=3){                
                if(input==1){                    
                    System.out.println("Enter the number to push");
                    push(s1, s2, scan.nextInt());                                
                }
                if(input==2){
                    pop(s1, s2); 
                }                
                System.out.println("--------------------------------------------");
                System.out.println("\n Enter the operation you wish to perform: ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Exit");
                input = scan.nextInt();                
            } 
    }
    public static void push(Stack s1, Stack s2, int input){
        s1.push(input);
        System.out.println(input + " is pushed into the queue");
    }
    public static void pop(Stack s1, Stack s2){
        int popped;
        if(s2.empty() && !s1.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            popped = (int)s2.pop();
            System.out.println(popped + " is popped from into the queue");
        }
        else{
            if(s1.empty() && !s2.empty()){
                popped = (int)s2.pop();
                System.out.println(popped + " is popped from into the queue");
            }                
            else if(!s1.empty() && !s2.empty()){
                    popped = (int)s2.pop();
                    System.out.println(popped + " is popped from into the queue");
                }
            else{
                System.out.println("Queue is empty, cannot pop");
                return;
            }                
        }                            
    }
}
