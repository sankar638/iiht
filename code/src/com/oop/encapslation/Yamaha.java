package com.oop.encapslation;

public class Yamaha {
	public static void main(String[] args) {
		
		Bike fz=new  Bike();
		fz.setName("YamahaFZ");
		fz.setCc(250);
		fz.setColor("blue");
		fz.setPrice(120000);
		
		Bike tvs=new Bike();
		tvs.setName("TVSUnicon");
		tvs.setCc(150);
		tvs.setColor("black");
		tvs.setPrice(120000);
		
		System.out.println(fz.getName()+" "+fz.getCc()+ " "+fz.getColor());
		System.out.println(tvs.getName()+" "+tvs.getCc()+ " "+tvs.getColor());
				
	
		}
}

