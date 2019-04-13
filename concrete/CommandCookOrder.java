package concrete;

import command.Command;
import receiver.Order;

//Concrete Command
public class CommandCookOrder implements Command {

	private Order order;
	
	public CommandCookOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderPrepared(true);
		System.out.println(this.order);
	}

}
