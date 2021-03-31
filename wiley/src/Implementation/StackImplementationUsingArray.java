package Implementation;


import java.util.Scanner;

interface Stacks<T>{
	public boolean isEmpty();
	public boolean isFull();
	public boolean push(T val);
	public  T pop();
	public  T peek();
	public void display();
	
	
	
}
class Stack<T> implements Stacks{
	//String st[]=new String[100];
	//int st[]=new int[100];
	T[] st;
	static int top=100;
	public Stack() {
		top=-1;
		st=(T[])new Object[100];
	}
	public boolean isEmpty() {
		return (top<0);
	}
	public boolean isFull() {
		return (top-1==100);
	}
	
	int count() {
		if(top!=-1) {
		return (top++);}
		else
			return 0;
	}
	
	public T pop() {
		if(top<0) {
			System.out.println("Stack Empty");
			return null;
		}
		else {
			T n=st[top--];
			return n;
		}
	}
	public T peek() {
		if(top<0) {
			System.out.println("Stack Empty");
			return null;
		}
		else {
			//T n=st[top];
			return st[top];
		}
	}
	public void display() {
		if(top!=0) {
		int t=top;
		while(t!=-1) {
			System.out.print(st[t]+" ");
			t--;
		}
			}
		else {
			System.out.println("Stack Empty");
		}
	}
	public boolean push(Object val) {
		if(top>=(100-1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			st[++top]=(T) val;
			//System.out.println("The data "+val+" Pushed into Stack");
			return true;
		}
	}
}

public class StackImplementationUsingArray {
	
	
	static boolean CheckValid(String s)
    {
        Stacks<Character> paren= new Stack<Character>();
        Stacks<Character> OP= new Stack<Character>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
 
            if (c == '(' || c == '[' || c == '{')
            {
                paren.push(c);
                System.out.println("a"+paren.peek());
                continue;
            }
            else if(c>='0' && c<='9' ) {
            	if(OP.isEmpty()) {
            		//System.out.println(OP.isEmpty());
            		OP.push(c);
            		continue;
            	}
            	else if(OP.peek()==null||OP.peek()=='+'||OP.peek()=='-'||OP.peek()=='/'||OP.peek()=='*') {
            		OP.push(c);
            		continue;
            	}
            	else if(c!='}'||c!=']'||c!=')') {
            		System.out.println(OP.peek());
            		System.out.println(c);
            		System.out.println("Error aagya");
            		return false;
            	}
            }
            else if(c=='+' || c=='-' ||c=='/'||c=='*' ) {
            	if(OP.isEmpty()) {
            		return false;
            	}
            	else if(OP.peek()=='+'||OP.peek()=='-'||OP.peek()=='/'||OP.peek()=='*') {
            		return false;
            	}
            	else {
            		OP.push(c);
            		continue;
            	}
            	
            }
            System.out.println(paren.isEmpty());

            System.out.println(c);
            System.out.println(paren.pop());
            System.out.println(paren.pop());

            System.out.println(paren.peek());
            if (paren.isEmpty())
                return false;
            char check;
            switch (c) {
            case ')':
            	System.out.println(paren.peek());
                check = paren.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = paren.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = paren.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (paren.isEmpty());
    }

	public static void main(String[] args) {
		String a="[(9-(4*5))]";
		System.out.println(CheckValid(a));
	}

}
