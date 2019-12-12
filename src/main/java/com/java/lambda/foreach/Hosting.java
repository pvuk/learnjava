package com.java.lambda.foreach;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hosting {
	
	private int id;
	private String webSites;
	private int value;
}
