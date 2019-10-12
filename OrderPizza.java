
public class OrderPizza {
	
	public class Builder {
		private  String bread;
		private  String condiments;
		private  String dressing;
		private  String meat;
			
		public OrderPizza build() {
			return new OrderPizza(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	} //End of Builder class.
	
	private  String bread;
	private  String condiments;
	private  String dressing;
	private  String meat;
	
	public OrderPizza(Builder obj) {
		this.bread = obj.bread;
		this.condiments = obj.condiments;
		this.dressing = obj.dressing;
		this.meat = obj.meat;
	}
	
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
}
