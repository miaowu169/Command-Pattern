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
		//���ȴ������۲��߶���
		InformMessage HeroGlory = new InformMessage();
		//���������߶���
		GameInform gameInform = new GameInform();
		
		//�������߶������������
		Command attackCommand = new AttackCommand(gameInform);
		Command retreatCommand = new RetreatCommand(gameInform);
		Command gatherCommand = new GatherCommand(gameInform);
		
		//���������߶���
		Keypad keypad = new Keypad();
		//�������������
		keypad.setAttackCommand(attackCommand);
		keypad.setRetreatCommand(retreatCommand);
		keypad.setGatherCommand(gatherCommand);
		
		//�����۲��߶���
		Observer HanXin = new Hero("����");
		Observer HouYi = new Hero("����");
		Observer DianWei = new Hero("��Τ");
		Observer DaJi = new Hero("槼�");
		Observer LiuShan = new Hero("����");
		
		//��ӹ۲���
		HeroGlory.RegisterObserver(HanXin);
		HeroGlory.RegisterObserver(HouYi);
		HeroGlory.RegisterObserver(DianWei);
		HeroGlory.RegisterObserver(DaJi);
		HeroGlory.RegisterObserver(LiuShan);
		
		//1.������Ϣ 2.��������
		HeroGlory.setInformation("槼�",DaJi,keypad.Retreat());
		
		System.out.println("---------------------------------------------------");
		HeroGlory.setInformation("����",HouYi,keypad.Gather());
	}
}
