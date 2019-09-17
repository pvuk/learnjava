package com.java.designpatterns.strategy;

public class SocialMediaStrategyContext {
	
	private ISocialMediaStrategy iSocialMediaStrategy;

	public void setiSocialMediaStrategy(ISocialMediaStrategy iSocialMediaStrategy) {
		this.iSocialMediaStrategy = iSocialMediaStrategy;
	}
	
	public void connnect(String friendName) {
		iSocialMediaStrategy.connectTo(friendName);
	}
}
