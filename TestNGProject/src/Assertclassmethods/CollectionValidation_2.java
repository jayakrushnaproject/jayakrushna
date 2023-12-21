package Assertclassmethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionValidation_2 
{
	@Test
	public void collectionListValidation()
	{
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		List<String> al1=new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		Assert.assertEquals(al.contains("D"), al1.contains("D"),"D is not present");
		System.out.println("D is present");
	}

}
