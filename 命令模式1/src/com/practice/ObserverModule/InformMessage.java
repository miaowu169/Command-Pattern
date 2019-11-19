package com.practice.ObserverModule;

import java.util.ArrayList;
import java.util.List;

/*
 * 被观察者
*实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 *
 */
public class InformMessage implements Observerable {
	private String message;
	private String heroName;
	private List<Observer> list;
	
	public InformMessage() {
		list = new ArrayList<Observer>();
	}
	
	public void NotifyObserver() {
		for(int i = 0;i < list.size(); i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}

	public void RegisterObserver(Observer o) {
		list.add(o);
		
	}

	public void RemoveObserver(Observer o) {
		if(!list.isEmpty())
			list.remove(o);
	}

	public void setInformation(String name,Observer o,String message) {
		this.message = message;
		this.heroName = name;
		System.out.println("英雄[" + heroName + "]发出消息:" + message);
		RemoveObserver(o);
		NotifyObserver();
		list.add(o);
	}
}
