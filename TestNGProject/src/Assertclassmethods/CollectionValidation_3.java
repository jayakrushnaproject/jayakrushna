package Assertclassmethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionValidation_3 
{
	@Test
	public void collectionListValidation()
	{
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("D");
		List<String> al1=new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		Assert.assertEquals(al.size(), al1.size(),"both list size not matching");
		System.out.println("both list size is matching");
	}

}
