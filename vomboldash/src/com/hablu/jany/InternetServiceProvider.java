package com.hablu.jany;

import java.util.HashMap;
import java.util.Map;

public class InternetServiceProvider {

	private String ispName;
	private double totalSell = 0;
	
	private Map<String, Double> bandWidthPackage=new HashMap<>();
	private Map<String, Integer> avaialablePackageNumber=new HashMap<>();
	

	public InternetServiceProvider(String ispName) {
		
		this.ispName = ispName;
	}
	
	public boolean isAvailable(String packName){
		
		boolean packageIndex = bandWidthPackage.containsKey(packName);
		
		
		return packageIndex;
		
		
	}	
	
	
	
	
	public void addPackage(String intPack, double price, int packageNum){
		
		bandWidthPackage.put(intPack, price);
		avaialablePackageNumber.put(intPack, packageNum);
		
		
	}
	
	public double getBandwidthPrice(String packName){
		
		boolean isPackageAvailable = isAvailable(packName);
		
		if (isPackageAvailable == true) {
			
			double bandWidthPrice = bandWidthPackage.get(packName);
			
			return bandWidthPrice;
		} else {
			
			System.out.print("Package not available. ");
			return 0;
		}
	
	}
	
	public Map<String, Integer> getPackageNumber() {
		return avaialablePackageNumber;
	}
	
	
	public void sellPackage(String packName, int packNumber){
		
		int available = avaialablePackageNumber.get(packName);
		
		if (available < packNumber) {
			
			System.out.println("Package not available enough");
		} else {
			double packagePrice = getBandwidthPrice(packName);
			double currentPackageSell = packagePrice*packNumber;
			totalSell = totalSell + currentPackageSell;
			avaialablePackageNumber.put(packName , available-packNumber);
			
			System.out.println("Purchase Completed");
		}
	}
	
	public double getTotalSell(){
		
		
		return this.totalSell;
		
		
	}
	
}
