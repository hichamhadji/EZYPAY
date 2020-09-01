package com.EZYPAY.subscription.dao.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum SubscriptionType {
	
	   DAILY("DAILY"),
	   WEEKLY("WEEKLY"),
	   MONTHLY("MONTHLY");
	String value;

}
