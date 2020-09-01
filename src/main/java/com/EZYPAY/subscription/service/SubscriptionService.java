package com.EZYPAY.subscription.service;
import com.EZYPAY.subscription.dao.entity.PaymentSubscription;
import com.EZYPAY.subscription.dao.entity.SubscriptionType;
import com.EZYPAY.subscription.dao.repository.SubscriptionRepository;
import com.EZYPAY.subscription.exception.SubscriptionPeriodExeeded;

import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class SubscriptionService {
	
	private  final SubscriptionRepository subscriptionRepository;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy"); 
	
	  public SubscriptionService(final SubscriptionRepository subscriptionRepository) {
	        this.subscriptionRepository = subscriptionRepository ;
	    }
	  
	  
	  @Transactional
	    public PaymentSubscription createSubscription(final Float amount,final SubscriptionType  type,final String accursEvery,final String startDate, final String endDate)  {
	        
		    Period period = Period.between(LocalDate.parse(startDate,formatter), LocalDate.parse(endDate, formatter));
		    int subscriptionDuration = period.getDays()+period.getMonths()*30+ period.getYears()*12*30;
	        if (subscriptionDuration >90){
	        	throw new SubscriptionPeriodExeeded("The subscription period must be less than 3 months!");
	        }
		    
		    final PaymentSubscription subscription = new PaymentSubscription();
	        subscription.setAmount(amount);
	        subscription.setType(type);
	        subscription.setAccursEvery(accursEvery);
	        subscription.setStartDate(LocalDate.parse(startDate,formatter));
	        subscription.setEndDate(LocalDate.parse(endDate, formatter));
	        
	        
	        return this.subscriptionRepository.save(subscription);
	    }
	    @Transactional(readOnly = true)
	    public List<PaymentSubscription> getAllSubscriptions(final int count) {
	        return this.subscriptionRepository.findAll().stream().limit(count).collect(Collectors.toList());
	    }
	    @Transactional(readOnly = true)
	    public Optional<PaymentSubscription> getSubscription(final int id) {
	        return this.subscriptionRepository.findById(id);
	    }
	

}
