package testing;

public class DateVerif {
public boolean verif_mois(int mois)
{
	if((mois<1)|| (mois>12))
	{
		return false;
		
	}
	else
		return true;
}
public void convert(String valeur)
{
Integer.parseInt(valeur);	
}
public boolean verif_annee(int annee)
{
if((annee<1900)|| (annee>2020))
{
return false;	
}
else
	return true;

}
}
