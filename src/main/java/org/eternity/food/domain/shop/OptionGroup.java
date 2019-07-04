/**
 * 
 */
package org.eternity.food.domain.shop;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * packageName	: org.eternity.food.domain.shop
 * fileName	: OptionGroup.java 
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
public class OptionGroup {
	private String name;
	private List<Option> options;
	
	@Builder
	public OptionGroup(String name, List<Option> options) {
		this.name = name;
		this.options = options;
	}
}
