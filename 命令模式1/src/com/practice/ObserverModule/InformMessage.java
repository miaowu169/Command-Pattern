package com.practice.ObserverModule;

import java.util.ArrayList;
import java.util.List;

/*
 * ���۲���
*ʵ����Observerable�ӿڣ���Observerable�ӿڵ��������������˾���ʵ��
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
		System.out.println("Ӣ��[" + heroName + "]������Ϣ:" + message);
		RemoveObserver(o);
		NotifyObserver();
		list.add(o);
	}
}
