package new_package;
 
 protected interface MethodOverl
{
	  void thirdMethodOfSuperClass();
}
 class yzx extends MethodOverl
{
	void thirdMethodOfSuperClass()
    {
        System.out.print("Parent");
    }
	
}

 public class xyz
 {
	 public static void main(String[] args)
	 {
		 yzx.thirdMethodOfSuperClass();
		 
	 }
 }
