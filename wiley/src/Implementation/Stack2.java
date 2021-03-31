//package Implementation;
//
//public class Stack2 {
//	
//	int top;
//	int arr[];
//	int size;
//	
//	Stack2(int size) {
//		top = -1;
//		this.size=size;
//		arr=new int[size];
//	}
//	
//	void push(int n) {
//		if(isFull()) {
//			System.out.print("Maximum capacity reached");
//		}
//		else {
//		top++;
//		arr[top]=n;
//		
//		}
//	}
//	
//	int pop() {
//		if(isEmpty()) {
//			System.out.println("Stack is empty");
//			return -1;
//		}
//		else {
//			System.out.println(arr[top] + " has been removed");
//			return arr[top--] ;
//		}
//	}
//	
//	int peek() {
//		if(isEmpty()) {
//			System.out.println("Stack is empty");
//			return -1;
//		}
//		else {
//			System.out.println("Top element is "+arr[top]);
//			return arr[top] ;
//		}
//	}
//	
//	boolean isEmpty() {
//		if(top==-1) {
//			
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	boolean isFull() {
//		if(top==size-1) {
//			
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	void display() {
//		System.out.println("Stack Contents:");
//		for(int i=0;i<=top;i++) {
//			System.out.println(arr[i]);
//		}
//	}
//	
//	
//	
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack s=new Stack(10);
//		s.push(0);
//		s.push(2);
//		s.push(1);
//	s.display();
//	s.pop();
//	s.display();
//	s.peek();
//	s.pop();
//	s.pop();
//	s.pop();
//	
//	
//		
//
//	}
//
//}
