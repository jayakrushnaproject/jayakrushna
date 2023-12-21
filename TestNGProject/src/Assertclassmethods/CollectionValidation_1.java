package Assertclassmethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionValidation_1 
{
	@Test
	public void collectionListValidation()
	{
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		List<String> al1=new ArrayList<>();
		al1.add("A");
		al1.add("C");
		al1.add("B");
		
		Assert.assertEquals(al, al1,"both list not equals");
		System.out.println("both list equals");
	}
	

}
