/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;
import java.util.Scanner;

/**
 *
 * @author pj
 */
//this program creates a stack of stack using array. this stack of stack works like a normal stack.
public class stackOfStacks {
    static int cap=0, top=-1, stackNo;
    static int[][]stacks = new int[10][10];
    public static void main(String args[]){
        System.out.println("Enter the operation you wish to perform: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
            while(input!=3){
                
                if(input==1){                    
                    System.out.println("Enter the number to push");
                    stackNo = push(scan.nextInt());                                
                }
                if(input==2){
                  stackNo =  pop(); 
                }                
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Exit");
                input = scan.nextInt();                
            } 
            if(stackNo!=-1)
            printStack(stackNo);
    }
        
    static int push(int x){
        if(cap==9&&top==9){
            System.out.println("Stacks of stack are full, cannot push");
            return 0;
        }
        else{
            if(top==-1){
                top++; 
                stacks[cap][top]=x;
            }
            else{
                if(top<9){
                    top++; stacks[cap][top]=x;
                }
                else{
                    cap++; top=0; stacks[cap][top]=x;
                }
            }
        }             
        return cap;
    }
    
    static int pop(){
        if(cap==0){
            if(top<0){
                System.out.println("Stacks of stack is empty, cannot pop");
                return -1;
            }
            else{
                System.out.println("Popped Element is: " + stacks[cap][top]);
                stacks[cap][top]= -1;
                top--; return 0;
            }            
        }
        else{
            if(top==0){
                System.out.println("Popped Element is: " + stacks[cap][top]);
                stacks[cap][top]= -1;
                top=9; cap--; return cap;
             }
            else{                
                    System.out.println("Popped Element is: " + stacks[cap][top]);                
                    stacks[cap][top]=-1;
                    top--; return cap;                     
            }
        }                    
    }
    public static void printStack(int stackNo){
        
            for(int i =cap;i>=0;i--){
                System.out.print("Stack Number: " + ++stackNo + "\n");
                for(int j =top; j>=0; j--){
                    if(top>=0)
                    System.out.print(stacks[i][j] + "-->");                    
                }
                stackNo--;
                top=9;
                System.out.print("\n");
            }                    
    }
}
