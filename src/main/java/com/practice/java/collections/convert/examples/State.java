package com.practice.java.collections.convert.examples;

public class State {
	
	private Long stateId;
	private String code;
	private Long posotion;
	private String description;
	
	public State(Long stateId, String code, Long posotion, String description) {
		super();
		this.stateId = stateId;
		this.code = code;
		this.posotion = posotion;
		this.description = description;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getPosotion() {
		return posotion;
	}

	public void setPosotion(Long posotion) {
		this.posotion = posotion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", code=" + code + ", posotion=" + posotion + ", description="
				+ description + "]";
	}
}
