package set;
import java.util.*;
class Price implements Comparable<Price>
{
	String item;
	int price;
	Date Date;
	public Price(String item, int price,Date Date) 
	{
		this.item = item;
		this.price = price;
		this.Date=Date;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return Date;
	}
	public void setDate(Date Date) {
		this.Date = Date;
	}
	//	public int compareTo(Price p) {
//		if(price>p.price)
//		{  
//	        return 1;  
//	    }else if(price<p.price)
//	    {  
//	        return -1;  
//	    }else
//	    { 
//		return 0;
//		}
//	}
	@Override
	public int compareTo(Price p) {
		return -item.compareTo(p.item);
	}
//	@Override
//	public int compareTo(Price p) {
//		return -Date.compareTo(p.Date);
//	}
}
