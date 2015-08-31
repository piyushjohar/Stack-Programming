/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Scanner;
import static stacks.stackOfStacks.cap;
import static stacks.stackOfStacks.printStack;
import static stacks.stackOfStacks.stackNo;
import static stacks.stackPushPopMin.stack;

/**
 *
 * @author pj
 */
public class stackPushPopMin {
    static int[] stack = new int[10];
    static int top =-1;        
    static int[] min = new int[10];
    public static void main(String []args){
        System.out.println("Enter the operationyou wish to perform: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
            while(input!=3){                
                if(input==1){                    
                    System.out.println("Enter the number to push");
                    pushAndMinimum(stack, scan.nextInt());                                
                }
                if(input==2){
                    popAndMinimum(); 
                }                
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Exit");
                input = scan.nextInt();                
            } 
            printStack(stack);
    }
    public static void pushAndMinimum(int[] stack, int num){
        if(top==-1){
            min[0] = 0; 
            top++;
            stack[top]=num;            
        }
        else{
            if(num < stack[min[top]]){
                top++;
                min[top]=top;
                stack[top]=num;                              
            }
            else{
                top++;
                stack[top]=num;
                min[top]=min[top-1];
            }
        }
        System.out.println( num + " was pushed into the stack. Minimum element is: " + stack[min[top]]);
    }
    public static void popAndMinimum(){
        if(top==-1){
            System.out.println("Stack is empty, cannot pop");
        }
        else{
                System.out.println( stack[top] + " was popped from the stack. Minimum element is: " + stack[min[top-1]]);
                stack[top]=-1;
                top--;            
        }
    }    
    public static void printStack(int []stack){
        System.out.println("Stack contains below elements");
        for(int i=top;i>=0;i--){         
            System.out.print(stack[i] + "-->");                    
            }
    }
}
