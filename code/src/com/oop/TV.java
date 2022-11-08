package com.oop;


public class TV {
	String brand;
	String modelName;
	int screenSize;
	int Price;
	String color;
	String displayType;
	
	void insertData(String b, String mn, int ss, int p, String c, String dt) {
		brand=b;
	    modelName=mn;
			screenSize=ss;
			Price=p;
			color=c;
			displayType=dt;
		}
	
	void displayTV() {
		System.out.println(brand+" "+modelName);
	}
	
	public static void main(String args[]) {
		
		TV lgOled = new TV();
		TV samsungFrame = new TV();
		
		
		
//		lgOled.brand="LG";
//		lgOled.modelName=" 4K Oled 75 Tv";
//		lgOled.screenSize=75;
//		lgOled.Price=20000;
//		lgOled.color="red";
//		lgOled.displayType="OlED";
		
		//System.out.println("Brand:"+lgOled.brand+", ModelName:"+lgOled.modelName+", SceenSize:"+lgOled.screenSize+", Price:"+lgOled.Price+", Color: "+lgOled.color+", DisplayType:"+lgOled.displayType);
		
		lgOled.insertData("mg", "ss", 77,8773, "white", "3k");
		lgOled.displayTV();
		
		samsungFrame.brand="Samsung";
		samsungFrame.modelName="A52";
		samsungFrame.screenSize=103;
		samsungFrame.Price=35000;
		samsungFrame.color="blue";
		samsungFrame.displayType="4k HD";
		
		System.out.println("Brand:"+samsungFrame.brand);
		System.out.println("ModelName:"+samsungFrame.modelName);
		System.out.println("SceenSize:"+samsungFrame.screenSize);
		System.out.println("Price:"+samsungFrame.Price);
		System.out.println("Color: "+samsungFrame.color);
		System.out.println("DisplayType:"+samsungFrame.displayType);
	}


}
