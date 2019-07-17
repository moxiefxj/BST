package tree;


public class Test extends TT{ 
		public void main(String args[]){ 
			Test t = new Test("Tom"); 
		} 
		public Test(String s){ 
			super(s); 
			System.out.println("This   is   a  book!"); 
		} 
		public Test(){ 
			this("What is this?"); 
		} 
		} 
		class TT{ 
			public TT(){ 
				System.out.println("What a pleasure!"); 
		} 
		public TT(String s){ 
			System.out.println("I am "+s); 
		}

}
