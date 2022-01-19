package assignment;
class OuterClass {
	  int x = 112;

	  class InnerClass {
	    int y = 8;
	  }
	}

	public class innerClassAssisted1 {
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	  }
	}