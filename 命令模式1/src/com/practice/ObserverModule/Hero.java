package com.practice.ObserverModule;

/**
 * �۲���
 * ʵ����update����
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
		System.out.println(name + "�յ���Ϣ:" + message);
	}
}
