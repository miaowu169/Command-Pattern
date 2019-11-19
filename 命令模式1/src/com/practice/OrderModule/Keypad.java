package com.practice.OrderModule;

/*
 * ÇëÇó½ÇÉ«Àà
 */

public class Keypad {
	private Command AttackCommand;
	private Command RetreatCommand;
	private Command GatherCommand;
	
	public void setAttackCommand(Command AttackCommand) {
		this.AttackCommand = AttackCommand;
	}
	
	public void setRetreatCommand(Command RetreatCommand) {
		this.RetreatCommand = RetreatCommand;
	}
	
	public void setGatherCommand(Command GatherCommand) {
		this.GatherCommand = GatherCommand;
	}
	
	public String Attack() {
		return AttackCommand.execute();
	}
	
	public String Retreat() {
		return RetreatCommand.execute();
	}
	
	public String Gather() {
		return GatherCommand.execute();
	}
}
