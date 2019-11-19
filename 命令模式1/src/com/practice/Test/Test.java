package com.practice.Test;

import com.practice.ObserverModule.Hero;
import com.practice.ObserverModule.InformMessage;
import com.practice.ObserverModule.Observer;
import com.practice.OrderModule.AttackCommand;
import com.practice.OrderModule.Command;
import com.practice.OrderModule.GameInform;
import com.practice.OrderModule.GatherCommand;
import com.practice.OrderModule.Keypad;
import com.practice.OrderModule.RetreatCommand;

public class Test {
	public static void main(String [] args) {
		//首先创建被观察者对象
		InformMessage HeroGlory = new InformMessage();
		//创建接收者对象
		GameInform gameInform = new GameInform();
		
		//将接收者对象传入命令对象
		Command attackCommand = new AttackCommand(gameInform);
		Command retreatCommand = new RetreatCommand(gameInform);
		Command gatherCommand = new GatherCommand(gameInform);
		
		//创建请求者对象
		Keypad keypad = new Keypad();
		//把命令传给请求者
		keypad.setAttackCommand(attackCommand);
		keypad.setRetreatCommand(retreatCommand);
		keypad.setGatherCommand(gatherCommand);
		
		//创建观察者对象
		Observer HanXin = new Hero("韩信");
		Observer HouYi = new Hero("后羿");
		Observer DianWei = new Hero("典韦");
		Observer DaJi = new Hero("妲己");
		Observer LiuShan = new Hero("刘禅");
		
		//添加观察者
		HeroGlory.RegisterObserver(HanXin);
		HeroGlory.RegisterObserver(HouYi);
		HeroGlory.RegisterObserver(DianWei);
		HeroGlory.RegisterObserver(DaJi);
		HeroGlory.RegisterObserver(LiuShan);
		
		//1.更新消息 2.调用请求
		HeroGlory.setInformation("妲己",DaJi,keypad.Retreat());
		
		System.out.println("---------------------------------------------------");
		HeroGlory.setInformation("后羿",HouYi,keypad.Gather());
	}
}
