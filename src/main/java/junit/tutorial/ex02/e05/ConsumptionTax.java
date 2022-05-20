package junit.tutorial.ex02.e05;

public class ConsumptionTax {

	private int rate;
	
	public ConsumptionTax(int rate) {
		this.rate = rate;
		//税率
	}
	
	public int apply(int price) {
		return price + (price * this.rate/100);
		//戻り値をint
	}
}
