/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pj
 */
public class stackSorting {
    public static void main(String []args){
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
                    System.out.println(s1);
                }
                if(input==2){
                    s1.pop();
                    System.out.println(s1);
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
        if(s1.empty())
            s1.push(input);
        else if(input> (int)s1.peek()){
            s1.push(input);
        }
        else{
            while(input< (int)s1.peek()){
                s2.push(s1.pop());
                if(s1.empty()) break;
            }
            s1.push(input);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }
    }
}
