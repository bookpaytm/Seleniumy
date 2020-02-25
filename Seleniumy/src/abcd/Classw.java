package abcd;

import org.testng.annotations.Test;

public class Classw {
	
	
	
	
	
	
  @Test
  public void launchbrowser(){
long id=Thread.currentThread().getId();
System.out.println("test case 1 is passed"+id);
  }
 @Test
 public void testcase2(){
	 long id=Thread.currentThread().getId();
	 System.out.println("test case2 is passed"+id);
 }
  @Test
  public void testcase3(){
	  long id=Thread.currentThread().getId();
	  System.out.println("test case 3 is passed"+id);
  }
  
 @Test
 public void testcase4(){
	 long id=Thread.currentThread().getId();
	 System.out.println("Testcase4 is passed"+id);
	 
 }
  @Test
  public void testcase5(){
	  long id=Thread.currentThread().getId();
	  System.out.println("testcase5 ia passed"+id);
  }
  
  

}
