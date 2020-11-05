package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class Datetest {
	@Rule
	public ExpectedException exception= ExpectedException.none();
	DateVerif dv;
@Before
public void before()
{
dv=new DateVerif();	

}
@Test
public void valid_mois()
{
Assert.assertEquals(false, dv.verif_mois(13));

}
@Test
public void veriftypemois()
{
	exception.expect(NumberFormatException.class);
	// si l'exception est inconnu
	// 	exception.expect(Exception.class);

	dv.convert("1234a");
	

}
@Test
public void verifanne()
{
Assert.assertEquals(false, dv.verif_annee(2001));	

}



}
