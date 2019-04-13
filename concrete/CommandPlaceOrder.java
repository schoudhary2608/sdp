package concrete;

import command.Command;
import receiver.Order;

//Concrete Command
public class CommandPlaceOrder implements Command {

	private Order order;
	
	public CommandPlaceOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderPlaced(true);
		System.out.println(this.order);
	}
	
}
