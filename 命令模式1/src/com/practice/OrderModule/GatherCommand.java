package com.practice.OrderModule;

/*
 * 具体角色类
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
