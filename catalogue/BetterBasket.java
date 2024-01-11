package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  @Override
  public boolean add(Product pr1) {
	  for (Product pr2: this) {
		  if(pr1.getProductNum().equals(pr2.getProductNum())) {
			  pr2.setQuantity(pr1.getQuantity()+ pr2.getQuantity());
			  Collections.sort(this , new SortByPrQ());
			  return(true);
		  }
	  }
	  
	  super.add(pr1);
	  Collections.sort(this , new SortByPrQ());
	  
	  return(true);
  }
 class SortByPrQ implements Comparator<Product>
 {
 public int compare(Product pr1, Product pr2) 
 {
	 
	 return pr1.getQuantity() - pr2.getQuantity();
 }
 }
}
