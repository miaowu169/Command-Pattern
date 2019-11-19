package com.practice.ObserverModule;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 */

public interface Observerable {
	public void RegisterObserver(Observer o);
	public void RemoveObserver(Observer o);
	public void NotifyObserver();
}
