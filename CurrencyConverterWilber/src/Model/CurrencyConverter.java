/**
 * Erin Wilber - ewilber
 * CIS171 22149
 * ${04-17-23}
 */

package Model;

public class CurrencyConverter {
	
	private double usDollars;
	private double euros;
	private double britishPounds;
	final double USD_TO_EUROS_RATE = -91403;
	final double USD_TO_GBP_RATE = .80240;
			
//DEFAULT CONSTRUCTOR
	public CurrencyConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrencyConverter(double usDollars) {
		super();
		this.usDollars = usDollars;
		doConversion();
	}
			
//getters setters

	public double getUsDollars() {
		return usDollars;
	}



	public void setUsDollars(double usDollars) {
		this.usDollars = usDollars;
		doConversion();
	}



	public double getEuros() {
		return euros;
	}



	public void setEuros(double euros) {
		this.euros = euros;
	}



	public double getBritishPounds() {
		return britishPounds;
	}



	public void setBritishPounds(double britishPounds) {
		this.britishPounds = britishPounds;
	}



	public double getUSD_TO_EUROS_RATE() {
		return USD_TO_EUROS_RATE;
	}



	public double getUSD_TO_GBP_RATE() {
		return USD_TO_GBP_RATE;
	}
	
	public void doConversion() {
		this.euros = this.usDollars * USD_TO_EUROS_RATE;
		this.britishPounds = this.usDollars * USD_TO_GBP_RATE;
	}


	
}
