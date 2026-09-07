package com.java.interview.coforge;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Thu 19-Jun-2025 16:56
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCompositIDClass implements Serializable{
	private static final long serialVersionUID = -8424028059121602852L;
	
	private Long id;
	private Long branchId;
	private Long auditId;
}
