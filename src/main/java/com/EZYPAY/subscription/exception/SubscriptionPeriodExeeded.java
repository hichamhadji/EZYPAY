package com.EZYPAY.subscription.exception;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class SubscriptionPeriodExeeded extends RuntimeException implements GraphQLError {

	
	
	public SubscriptionPeriodExeeded(String message) {
	       super(message);

	   }
	
	
	@Override
	public String getMessage() {
	       return super.getMessage();
	   }

	
	 @Override
	 public List<SourceLocation> getLocations() {
	       return null;
	   }

	 


	@Override
	public ErrorType getErrorType() {

		return null;
	}
}
