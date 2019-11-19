package com.practice.ObserverModule;

/**
 * 观察者
 * 实现了update方法
 *
 */

public class Hero implements Observer{
	private String name;
	private String message;
	
	public Hero(String heroName) {
		this.name = heroName;
	}
	
	public void update(String message) {
		this.message = message;
		read();
	}
	
	public void read() {
		System.out.println(name + "收到消息:" + message);
	}
}
