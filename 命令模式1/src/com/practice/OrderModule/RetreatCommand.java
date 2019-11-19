package com.practice.OrderModule;

/*
 * �����ɫ��
 */

public class RetreatCommand implements Command{
	private GameInform gameInform;
	
	public RetreatCommand(GameInform gameInform) {
		this.gameInform = gameInform;
	}
	
	public String execute() {
	    return gameInform.Retreat();
	}

}
