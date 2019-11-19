package com.practice.OrderModule;

/*
 * 具体角色类
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
