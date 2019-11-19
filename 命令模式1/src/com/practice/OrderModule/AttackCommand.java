package com.practice.OrderModule;

/*
 * �����ɫ��
 */

public class AttackCommand implements Command{
	private GameInform gameInform;
	
	public AttackCommand(GameInform gameInform) {
		this.gameInform = gameInform;
	}
	
	public String execute() {
		return gameInform.Attack();
	}
}
