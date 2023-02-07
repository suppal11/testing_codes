package features;

import com.intuit.karate.junit5.Karate;

public class Runner 
{
@Karate.Test
Karate getAPI()
{
	return Karate.run("Deleteusr").relativeTo(getClass());
}
}
