/**
 * 
 */
package org.eternity.food.domain.shop;

import org.eternity.food.domain.generic.money.Money;

import lombok.Builder;
import lombok.Data;

/**
 * packageName	: org.eternity.food.domain.shop
 * fileName	: Option.java 
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
@Data
public class Option {
	private String name;
	private Money price;
	
	@Builder
	public Option(String name, Money price) {
		this.name = name;
		this.price = price;
	}

}
