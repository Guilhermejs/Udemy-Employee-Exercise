package entities;

public class OutsourceEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {
		super();
		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + "\n");
		sb.append(this.getHours() + "\n");
		sb.append(this.getValuePerHour() + "\n");
		sb.append(this.getAdditionalCharge());
		return sb.toString();
		
	}
	
	
	

}
