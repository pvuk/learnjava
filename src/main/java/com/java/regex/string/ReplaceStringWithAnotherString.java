package com.java.regex.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReplaceStringWithAnotherString {
	public static void main(String[] args) {
		String source = "'398'" + 
				"'399'" + 
				"'239'" + 
				"'230'" + 
				"'232'" + 
				"'240'" + 
				"'243'" + 
				"'245'" + 
				"'250'" + 
				"'244'" + 
				"'409'" + 
				"'246'" + 
				"'247'" + 
				"'258'" + 
				"'324'" + 
				"'410'" + 
				"'259'" + 
				"'326'" + 
				"'328'" + 
				"'267'" + 
				"'264'" + 
				"'269'" + 
				"'433'" + 
				"'317'" + 
				"'260'" + 
				"'226'" + 
				"'473'" + 
				"'290'" + 
				"'262'" + 
				"'265'" + 
				"'266'" + 
				"'272'" + 
				"'278'" + 
				"'280'" + 
				"'284'" + 
				"'287'" + 
				"'291'" + 
				"'292'" + 
				"'293'" + 
				"'294'" + 
				"'307'" + 
				"'261'" + 
				"'327'" + 
				"'296'" + 
				"'283'" + 
				"'271'" + 
				"'276'" + 
				"'277'" + 
				"'304'" + 
				"'439'" + 
				"'227'" + 
				"'234'" + 
				"'268'" + 
				"'270'" + 
				"'295'", dest = "";
		log.info("Input: {}", source);
		log.info("Input ex: '4''4' updated as 4,4");
		log.info("Replacing '' with , and ' with blank space");
		
		String format = "";
		log.info("Output example1: {}", example1(source, dest, format));
		
		//format incorrect. write correct one
		String str = source.replaceAll("('|')(''|,)", "$1,$2");
		log.info("Output Regex: {}", str);
	}

	private static Object example1(String source, String dest, String format) {
		return source.replaceAll("''", ",").replaceAll("'", "");
	}
}
