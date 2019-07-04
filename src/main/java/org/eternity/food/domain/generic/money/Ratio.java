/**
 * 
 */
package org.eternity.food.domain.generic.money;

/**
 * packageName	: org.eternity.food.domain.generic.money
 * fileName	: Ratio.java 
 * author		: twayair
 * date		: 2019. 7. 4.
 * 내용			: 
 *
 * ===========================================================
 *
 * DATE				AUTHOR			NOTE
 * -----------------------------------------------------------
 * 2019. 7. 4.			twayair			최초 생성
 */
public class Ratio {
	private double rate;
	
	public static Ratio valueOf(double rate) {
		return new Ratio(rate);
	}
	
	Ratio(double rate){
		this.rate = rate;
	}
	
	Ratio(){	
	}
	
	public Money of(Money price) {
		return price.times(rate);
	}
	
	public double getRate() {
		return rate;
	}
}
