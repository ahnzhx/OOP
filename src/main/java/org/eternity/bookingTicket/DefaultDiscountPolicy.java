package org.eternity.bookingTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy  implements DiscountPolicy{
    // 추상화에서는 상태를 가질 수 있다. 인터페이스는 상태를 가질 수 없음.
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening){
        for(DiscountCondition each : conditions){
            if(each.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }

        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
