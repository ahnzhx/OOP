package org.eternity.food.shop;

import org.eternity.food.domain.generic.money.Money;
import org.eternity.food.domain.shop.Menu;
import org.junit.Test;

import java.util.Arrays;

import static org.eternity.food.Fixtures.*;

public class MenuTest {
    @Test(expected = IllegalArgumentException.class)
    public void 메뉴이름_변경_오류(){
        Menu menu = aMenu().name("삼겹살").build();
        menu.validateOrder("오겹살", Arrays.asList(anOptionGroup().build()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 옵션그룹이름_변경_오류(){
        Menu menu = aMenu().basic(anOptionGroupSpec().name("기본").build()).build();
        menu.validateOrder("", Arrays.asList(anOptionGroup().name("기본 메뉴").build()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 옵션이름_변경_오류(){
        Menu menu = aMenu()
                .basic(anOptionGroupSpec()
                        .options(Arrays.asList(anOptionSpec().name("1인분").build()))
                        .build())
                .build();

        menu.validateOrder("", Arrays.asList(anOptionGroup()
                                    .options(Arrays.asList(anOption().name("1인분").price(Money.wons(10000)).build()))
                        .build()));


    }


}
