package com.finalAndAbstractDemo;

public class FinalDemo {
	
      final int x=26;
      final int y;//blank final variable
      final int  z;
      static final int a;
        
          
//      public FinalDemo()
//      {
//    	  x=78;//  error we cannot reinitialize final variable.
//      }
      {
    	  z=34;  // we can also initialize final variable in initialize bloack
      }
      static
      {
    	  a=56;// we can initialize static final variable  in static block
      }
      public FinalDemo()
      {
    	  y=30;// we can initialize final variable inside the constructor 
      }
      public void show()
      {
    	  System.out.println(x);
    	  System.out.println(a);
    	  System.out.println(z);
    	  System.out.println(y);
      }
      public static void main(String[] args) 
      {
		FinalDemo d = new FinalDemo();
		System.out.println(d.x);
		d.show();
	}
}
