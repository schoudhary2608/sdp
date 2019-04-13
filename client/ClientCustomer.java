package client;

import concrete.CommandCookOrder;
import concrete.CommandPlaceOrder;
import concrete.CommandServeOrder;
import concrete.CommandValidateOrder;
import invoker.Cook;
import invoker.Manager;
import invoker.Waiter;
import receiver.Order;

//Client
public class ClientCustomer {
	
	public ClientCustomer() {

		Order myOrder = new Order("Veg Burger", 2);
		
		
		//Place Order
		CommandPlaceOrder cmdPlaceOrder = new CommandPlaceOrder(myOrder);
		
		Waiter waiter = new Waiter();
		waiter.setCommand(cmdPlaceOrder);
		waiter.takeOrder();
		
		
		//Validate Order
		CommandValidateOrder cmdValidateOrder = new CommandValidateOrder(myOrder);
		
		Manager manager = new Manager();
		manager.setCommand(cmdValidateOrder);
		manager.validateOrder();
		
		CommandCookOrder cmdCookOrder = new CommandCookOrder(myOrder);
		
		Cook cook = new Cook();
		cook.setCommand(cmdCookOrder);
		cook.prepareOrder();
		

		CommandServeOrder cmdServeOrder = new CommandServeOrder(myOrder);
		
		waiter.setCommand(cmdServeOrder);
		waiter.serveOrder();
	}

}
