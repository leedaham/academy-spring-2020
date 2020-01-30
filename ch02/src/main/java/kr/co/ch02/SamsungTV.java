package kr.co.ch02;

import kr.co.ch02.sub1.Speaker;

public class SamsungTV implements TV{
	private Speaker spk;
	
	public void setSpk(Speaker spk) {
		this.spk = spk;
	}
	
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
