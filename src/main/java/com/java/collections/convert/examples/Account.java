package com.java.collections.convert.examples;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 17-Feb-2021 21:29
 */
@Data
@Builder
public class Account {
	
	private Long accountId;
	private String accountNumber;
	private BigDecimal exposure;
}
