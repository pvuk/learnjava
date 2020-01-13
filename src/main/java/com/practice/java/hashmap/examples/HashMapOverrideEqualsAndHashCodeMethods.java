package com.practice.java.hashmap.examples;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * update package from com.practice.java.hashmap.examples to com.java.hashmap.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @Date 04-Nov-2019 21:27
 */
public class HashMapOverrideEqualsAndHashCodeMethods {

	/**
	 * 
	 * @param args
	 * @author udaykiran pulipati
	 * @Date 04-Nov-2019 21:28
	 */
	public static void main(String[] args) {
		Map<String, HeadSetCompany> hashMap = new HashMap<>();
		hashMap.put("Sennheiser", HeadSetCompany.builder().headSetName("Sennheiser").isVolumeControlAvailable(true).build());
		hashMap.put("\nAudioTechnica", HeadSetCompany.builder().headSetName("AudioTechnica").isVolumeControlAvailable(true).build());
		hashMap.put("Sennheiser", HeadSetCompany.builder().headSetName("Sennheiser HD 4.40-BT").isVolumeControlAvailable(true).build());
		hashMap.put("Sennheiser", HeadSetCompany.builder().headSetName("Sennheiser HD 4.20s").isVolumeControlAvailable(true).build());
		hashMap.put("\nAudioTechnica", HeadSetCompany.builder().headSetName("Audio-Technica ATH-M40X").isVolumeControlAvailable(true).build());
		hashMap.put("\nAudioTechnica", HeadSetCompany.builder().headSetName("Audio-Technica ATH-SR30BTBK").isVolumeControlAvailable(true).isBluetoothAvailable(true).build());
		log.info("{}", hashMap);
		
		HashMap<HeadSetCompany, String> map = new HashMap<HeadSetCompany, String>();
		HeadSetCompany hs1 = new HeadSetCompany("Sennheiser", false, false, false, false);
		HeadSetCompany hs2 = new HeadSetCompany("Sennheiser", false, false, false, false);
		map.put(hs1,"value 1");
		map.put(hs2,"value 2");
		log.info("{}",map);
	}
}
