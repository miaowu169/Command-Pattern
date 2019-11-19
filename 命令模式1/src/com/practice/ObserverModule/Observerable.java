package com.practice.ObserverModule;

/***
 * ���󱻹۲��߽ӿ�
 * ��������ӡ�ɾ����֪ͨ�۲��߷���
 *
 */

public interface Observerable {
	public void RegisterObserver(Observer o);
	public void RemoveObserver(Observer o);
	public void NotifyObserver();
}
