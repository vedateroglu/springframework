package com.vesg.springframework;

public class Ucgen {
	private  String cesit;
	private int yukseklik;
	public Ucgen(String cesit){
		this.cesit=cesit;
	}
	public Ucgen(int yukseklik){
		this.setYukseklik(yukseklik);
	}
	public Ucgen(String cesit,int yukseklik){
		this.setYukseklik(yukseklik);
		this.cesit=cesit;
	}
	public Ucgen(int yukseklik,String cesit){
		this.setYukseklik(yukseklik);
		this.cesit=cesit;
	}
	public void ciz(){
		System.out.println(getYukseklik()+" birim yüksekliğinde "+getCesit()+" üçgen çiz.");
	}
	public String getCesit() {
		return cesit;
	}
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

}
