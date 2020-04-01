package com.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JsonCodeDocument {
	
	private String id;
	
	private String code;
	private Long position;
	
	private String description;
	
	private String details;
	
}
