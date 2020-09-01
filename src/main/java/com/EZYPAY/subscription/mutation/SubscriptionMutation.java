package com.EZYPAY.subscription.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.EZYPAY.subscription.dao.entity.PaymentSubscription;
import com.EZYPAY.subscription.dao.entity.SubscriptionType;
import com.EZYPAY.subscription.service.SubscriptionService;


@Component
public class SubscriptionMutation implements GraphQLMutationResolver {
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	
	public PaymentSubscription createSubscription(final Float amount,final SubscriptionType  type,final String accursEvery,final String startDate, final String endDate) {

	    	return this.subscriptionService.createSubscription(amount, type,accursEvery ,startDate, endDate);
		
	   }

	
	public String deleteSubscription(final int id) {

    	return this.subscriptionService.deleteSubscription(id);
	
   }
}
