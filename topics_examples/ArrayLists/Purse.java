/***************************
 * Brian Capps
 * 11/05/2008
 * Description
 ****************************/

import java.util.ArrayList;

public class Purse
{
	private ArrayList<Coin> coins;
	
	public Purse()
	{
		coins = new ArrayList<Coin>();
	}
	public Purse(ArrayList<Coin> c)
	{
		coins = (ArrayList<Coin>) c.clone();
	}
	public void addCoin(Coin n)
	{
		coins.add(n);
	}
	public boolean sameContents(Purse otherPurse)
	{
		if(coins.size()!= otherPurse.coins.size())
			return false;
		for(int i= coins.size()-1; i>=0; i--)
			if(coins.get(i).getName()!=otherPurse.coins.get(i).getName() ||
				coins.get(i).getValue()!=otherPurse.coins.get(i).getValue())
					return false;
		return true;
	}
	//public boolean sameCoins(Purse otherPurse)
	//{
		
	//}
	public void reverse()
	{
		ArrayList<Coin> temp = new ArrayList<Coin>();
		for(int i= coins.size()-1; i>=0; i--)
			temp.add(coins.remove(i));
		coins = (ArrayList<Coin>) temp.clone();
	}
	public void transfer(Purse otherPurse)
	{
		for(int i =0; i<otherPurse.coins.size(); i++)
			coins.add(otherPurse.coins.get(i));
		otherPurse.coins = new ArrayList<Coin>();
	}
	public String toString()
	{
		String result = "Purse contents: [ ";
		for(Coin c :coins)
			result+= c.getName()+" ";
		result+="]";
		return result;
	}
}//end class
