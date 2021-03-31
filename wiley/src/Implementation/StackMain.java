//package Implementation;
//
//import java.util.HashMap;
//
//public class StackMain {
//	static HashMap<Integer,Integer> map=new HashMap<>();
//	static boolean check(String[] s) {
//		Stack<String> stack=new Stack<>();
//		Stack<Integer> stack1=new Stack();
//		map.clear();
//		for(int i=0;i<s.length;i++) {
//			String c=s[i];
//			//System.out.print(c+" ");
//			if(c.equals("{")||c.equals("[")||c.equals("(")){
//				stack.push(c);
//				stack1.push(i);
//			}
//			else if(c.equals("]")||c.equals("}")||c.equals(")")) {
//				if(stack.size()==0)
//					return false;
//				if(stack.peek().equals("(") && c.equals(")")) {
//					map.put(stack1.pop(),i);
//					stack.pop();
//				}
//				else if(stack.peek().equals("[") && c.equals("]")) {
//					map.put(stack1.pop(),i);
//					stack.pop();
//				}
//				else if(stack.peek().equals("{") && c.equals("}")) {
//					map.put(stack1.pop(),i);
//					stack.pop();
//				}
//				else
//					return false;
//			}
//		}
//		return stack.size()==0;
//	}
//	public static boolean isInt(String i) {
//		try {
//			Integer.parseInt(i);
//			return true;
//		}
//		catch(Exception e)
//		{
//			return false;
//		}
//	}
//	public static boolean isOp(String temp) {
//		if(temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals("+") || temp.equals("%")) 
//			return true;
//		return false;
//	}
//	public static boolean check(String[] arr,int start,int end) {
//		if(end>start)
//			return true;
//		if(start==end) {
//			if(isInt(arr[start]))
//				return true;
//			return false;
//		}
//		if(end-start==2) {
//			if(isInt(arr[start]) && isOp(arr[start+1]) && isInt(arr[end]))
//				return true;
//			return false;
//		}
//		for(int i=start;i<=end;i++) {
//			if(isOp(arr[i])) {
//				//System.out.println(start+" "+end+" "+i+" "+arr[i]);
//				boolean left=check(arr,start,i-1);
//				boolean right=check(arr,i+1,end);
//
//				System.out.println(start+" "+end+" "+left+" "+right);
//				if(( left && right)==false)
//					return false;
//			}else if(arr[i].equals("(")) {
//				boolean temp=check(arr,i+1,map.get(i)-1);
//				if(temp==false)
//					return false;
//			}
//		}
//		return true;
//	}
//	
//	static public String[] array(String s) {
//		ArrayList<String> res=new ArrayList<>();
//		int i=0;
//		int n=s.length();
//		while(i<n) {
//			String temp=""+s.charAt(i);
//			//System.out.println(i+" "+temp);
//			if(temp.equals(" ")) {
//				i+=1;
//			}
//			else if(temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals("+") || temp.equals("%")) {
//				res.add(temp);
//				i+=1;
//			}else if( temp.equals("(") || temp.equals(")")) {
//				res.add(temp);
//				i+=1;
//			}
//			else {
//				char c=s.charAt(i);
//				temp="";
//				while(i<n && c>='0' && c<='9') {
//					temp+=c;
//					i++;
//					if(i<n)
//						c=s.charAt(i);
//				}
//				res.add(temp);
//			}
//		}
//		String arr[]=new String[res.size()];
//		for(i=0;i<res.size();i++)
//			arr[i]=res.get(i);
//		return arr;
//	}