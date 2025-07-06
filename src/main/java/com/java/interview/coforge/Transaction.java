package com.java.interview.coforge;

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
//@IdClass(TransactionCompositIDClass.class)
public class Transaction {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	@Id
	private Long branchId;
//	@Id
	private Long auditId;
	
	private String name;
	private String status;
}
