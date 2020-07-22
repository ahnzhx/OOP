package org.eternity.bookingTicket;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
