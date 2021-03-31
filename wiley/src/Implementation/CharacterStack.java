package Implementation;

public class CharacterStack {
	
	int top;
	char arr[];
	int size;
	
	CharacterStack(int size) {
		top = -1;
		this.size=size;
		arr=new char[size];
	}
	
	void push(char c) {
		if(isFull()) {
			System.out.print("Maximum capacity reached");
		}
		else {
		top++;
		arr[top]=c;
		
		}
	}
	
	char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '#';
		}
		else {
			System.out.println(arr[top] + " has been removed");
			return arr[top--] ;
		}
	}
	
	char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '#';
		}
		else {
			System.out.println("Top element is "+arr[top]);
			return arr[top] ;
		}
	}
	
	boolean isEmpty() {
		if(top==-1) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isFull() {
		if(top==size-1) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	void display() {
		System.out.println("Stack Contents:");
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterStack s=new CharacterStack(10);
		s.push('0');
		s.push('2');
		s.push('1');
		s.push('c');
	s.display();
	s.pop();
	s.display();
	s.peek();

	
	
		

	}

}
