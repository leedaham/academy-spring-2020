package kr.co.ch03;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.co.ch03.Speaker;

@Repository
public class SamsungTV implements TV{
	@Inject
	private Speaker spk;
	
	@Override
	public void power() {
		System.out.println("SamsungTV power...");
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTV chUp...");
	}

	@Override
	public void soundUp() {
		spk.soundUp();
	}

}
