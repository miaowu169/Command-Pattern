package com.practice.OrderModule;

/*
 * �����ɫ��
 */

public class GatherCommand implements Command{
	private GameInform gameInform;
	
	public GatherCommand(GameInform gameInform) {
		this.gameInform = gameInform;
	}
	
	public String execute() {
		return gameInform.Gather();
	}
}
