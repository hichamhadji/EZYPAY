package com.EZYPAY.subscription.dao.repository;

import com.EZYPAY.subscription.dao.entity.PaymentSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<PaymentSubscription, Integer> {
	

}
