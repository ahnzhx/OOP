package org.eternity.bookingTicket;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
