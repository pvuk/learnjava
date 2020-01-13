package com.practice.java.hashmap.examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper=false, includeFieldNames=true)
/**
 * update package from com.practice.java.hashmap.examples to com.java.hashmap.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @Date 04-Nov-2019 21:28
 */
public class HeadSetCompany {
	
	private String headSetName;
	private boolean isEnableMicrophone;
	private boolean isWired;
	private boolean isBluetoothAvailable;
	private boolean isVolumeControlAvailable;
	
	@Override
	public int hashCode(){
		return this.headSetName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		HeadSetCompany hs = (HeadSetCompany) obj;
		return this.getHeadSetName().equals(hs.getHeadSetName());
	}
}
