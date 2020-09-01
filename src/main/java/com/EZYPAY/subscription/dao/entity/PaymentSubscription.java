package com.EZYPAY.subscription.dao.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;


@Data
@EqualsAndHashCode
@Entity
@Getter
@Setter
public class PaymentSubscription implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Column(name = "ID", nullable = false)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 @Column(name = "amount", nullable = false)
	 private Float amount;
	 
	 @Column(name = "type", nullable = false)
	 private SubscriptionType type;
	 
	 @Column(name = "accurs_every")
	 private String accursEvery;
	 
	 @Column(name = "start_date")
	 private LocalDate startDate;
	 
	 @Column(name = "end_date")
	 private LocalDate endDate;
	 

}
