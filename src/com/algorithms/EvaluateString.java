package com.algorithms;

/* A Java program to evaluate a 
given expression where tokens 
are separated by space. 
*/
import java.util.Stack;

public class EvaluateString
{
	
	public static void main(String args[]) {
		
		String expression = "2-1 + 1";
		System.out.println(evaluate(expression));
	}
	
	static int evaluate(String expression) {
		
		
		//Convert the String to a char array so that it is easier to manipulate the characters
		char[] tokens = expression.toCharArray();
		
		
		//Have two Stacks which can store the numbers and the operators
		Stack<Integer> values = new Stack<>();
		Stack<Character> operators = new Stack<>();
		//Start scanning each token
		for(int i=0;i<tokens.length;i++) {
			
			//Check for white space first
			if(tokens[i]==' ') {
				continue;
			}
			//Check if it is a number start
			else if(tokens[i]>='0' && tokens[i]<='9') {
				//This means that it is a number
				//But it could also be a number which is greater than 9
				StringBuilder number = new StringBuilder();
				//Find all the digits of this number
				while(i<tokens.length && tokens[i]>='0' && tokens[i]<='9') {
					number.append(tokens[i]);
					i++;
				}
				//So we see that i has incremented an extra time before the check and so we need to decrease it by one
				i--;
				values.push(Integer.parseInt(number.toString()));
			}
			//Check if it is a number end
			
			else if(tokens[i]=='(') {
				operators.push(tokens[i]);
				
			}
			
			else if(tokens[i]==')') {
				while(operators.peek()!='(') {
					//Go on popping and computing till the opening bracket
					values.push(compute(values.pop(), values.pop(), operators.pop()));
				}
				//Remove the opening brack
				operators.pop();
			}
			
			//Check if it is an operator start
			else if(tokens[i]=='+'||tokens[i]=='-'||tokens[i]=='*'||tokens[i]=='/') {
				
				//What else do I need to check if it is an operator
				//Never put a lower precedence operator on the top of the stack if there is an higher precendence operator hidden below
				//Write a separate method to check precedence
				//The logic here should be that only if op present in stack is + or - and the operator now is * or / directly add it ..else compute 
				while(!operators.isEmpty() && precedenceCheck(tokens[i],operators.peek())) {
					
					//precedenceCheck returns true when op1 is smaller than op2. SO this means that the stack already has a higher
					//precedence operator and hence we must pop the operators and solve them before adding the operator from tokens into the stack
					values.push(compute(values.pop(),values.pop(),operators.pop()));
				}
				
				//Once all the higher precedence operators are done push the operator from the token to the stack
				operators.push(tokens[i]);
				
				
			}
			
			//Check if it is an operator end
			
			
			
		}
		
		//All the tokens are finished. Now start popping and computing values
		while(!operators.isEmpty()) {
			values.push(compute(values.pop(),values.pop(),operators.pop()));
		}
		
		return values.pop();
	}
	
	static int compute(int n1,int n2,char op) {
		
		switch(op) {
		
		case '+': return n2+n1;
		case '-': return n2-n1;
		case '*': return n1*n2;
		case '/': if(n1==0) throw new UnsupportedOperationException("Cannot divide by zero");
					return n2/n1;
		
		}
		return 0;
	}
	static boolean precedenceCheck(Character op1,Character op2) {
		
		//op1 is from the token, op2 is the stack
		//Returns true if op1 is smaller than op2
		//For everything else return false
		if(op2=='(' || op2==')') {
			return false;
		}
		else if((op1=='*'||op1=='/')&&(op2=='-'||op2=='+')) {
			return false;
		}
		else return true;
		
	}
}

