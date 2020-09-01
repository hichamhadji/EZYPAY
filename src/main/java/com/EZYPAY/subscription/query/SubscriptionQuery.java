package com.EZYPAY.subscription.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.EZYPAY.subscription.dao.entity.PaymentSubscription;
import com.EZYPAY.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SubscriptionQuery implements GraphQLQueryResolver{
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	  public List<PaymentSubscription> getSubscriptions(final int count) {
	        return this.subscriptionService.getAllSubscriptions(count);
	    }
	  
	  public Optional<PaymentSubscription> getSubscription(final int id) {
	        return this.subscriptionService.getSubscription(id);
	    }


	  
}
