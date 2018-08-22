package com.java.convert.doubleto.bigdecimal;

import java.text.DecimalFormat;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertDoubleToBigDecimal {
	public static void main(String[] args) {
		Double d = 121115.0;//1.0465E7 -280312.5

		String valueAsStr = d.toString();
		log.info(valueAsStr);
		if (valueAsStr.substring(valueAsStr.indexOf(".") + 1).length() > 0){
			log.info("BigDecimal Value: {}", new DecimalFormat("#.##").format(d));
		}
	}
}
