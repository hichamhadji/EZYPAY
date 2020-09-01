package com.EZYPAY.subscription.exception;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class SubscriptionNotFound extends RuntimeException implements GraphQLError{
	
	
	public SubscriptionNotFound(String message) {
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
