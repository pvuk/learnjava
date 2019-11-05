package com.java.convert.longto.string;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongToString {
	public static void main(String[] args) {
		Long glCompanyId = 98L;
		Long lineOfBusinessId = 1L;
		Long divisionId = 92L;
		Long coaAccountId = null;//511001L
		Long marketId = 32L;//null
		String chartOfAccountKey = glCompanyId +"_"+ lineOfBusinessId +"_"+ divisionId +"_"+ coaAccountId +"_"+ marketId;
		log.info("Key: {}", chartOfAccountKey);
		String[] keys = chartOfAccountKey.split("_");
		log.info("Keys: {}", Arrays.toString(keys));//print string array with comma values
		log.info("CoaAccountId: {}", keys[3]);// get null value
	}
}
