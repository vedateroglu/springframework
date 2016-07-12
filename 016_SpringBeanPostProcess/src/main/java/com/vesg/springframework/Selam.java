package com.vesg.springframework;

public class Selam {

	private String selam;

	public String getSelam() {
		return selam;
	}

	public void setSelam(String selam) {
		this.selam = selam;
	}
	public void goster(){
		System.out.println(getSelam());
	}
	public void init(){
		System.out.println("Bean başlatılıyor.");
	}
	public void destroy(){
		System.out.println("Bean sonlandırılıyor.");
	}
}
