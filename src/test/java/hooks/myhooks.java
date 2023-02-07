package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class myhooks 
{
	@Before("@smoke")
	public void sceanrio_info(Scenario sc)
	{
		System.out.println("what this sceanrio gives"+sc.getName());
	}

	@Before(order=1)
	public void setup1()
	{
		System.out.println("in the order1 before hook");
	}
	@Before(order=2)
	public void setup2()
	{
		System.out.println("in the order 2 before hook");
	}
	@After(order=1)
	public void teardown()
	{
		System.out.println("in the order 1 after hook");
	}
	@After(order=2)
	public void teardown1()
	{
		System.out.println("in the order 2 after hook");
	}
	@BeforeStep(order=1)
	public void screenshot()
	{
		System.out.println("take the screenshot");
	}
	@BeforeStep(order=2)
	public void screenshot2()
	{
		System.out.println("take the screenshot-2");
	}

	@AfterStep(order=1)
	public void refresh()
	{
		System.out.println("refresh after evry step");
	}
	@AfterStep(order=2)
	public void refresh2()
	{
		System.out.println("refresh after evry step-2");
	}
}
