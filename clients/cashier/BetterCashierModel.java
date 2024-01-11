package clients.cashier;

import catalogue.BetterBasket;


import middle.MiddleFactory;

public class BetterCashierModel extends CashierModel 
{
	
	 
	public BetterCashierModel(MiddleFactory mf) {
		super(mf);
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public BetterBasket makeBasket() {
		return new BetterBasket();
	
	}
}
