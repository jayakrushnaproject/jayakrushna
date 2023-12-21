package Assertclassmethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionValidation_4
{
	@Test
	public void collectionListValidation()
	{
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("C");
		al.add("B");
		List<String> al1=new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		Assert.assertTrue(al1.contains("D"),"D is not present");
		System.out.println("D is present");
	}

}
