package com.hablu.jany;

public class Main {

	public static void main(String[] args) {
		
		InternetServiceProvider isp = new InternetServiceProvider("WBC ISP");
		
		isp.addPackage("1 Mbps", 500, 50);
		isp.addPackage("2 Mbps", 800, 30);
		isp.addPackage("4 Mbps", 1000, 20);
		isp.addPackage("5 Mbps", 1200, 10);
		
		isp.sellPackage("2 Mbps", 5);
		isp.sellPackage("2 Mbps", 5);
		isp.sellPackage("1 Mbps", 10);
		
		System.out.println("....................................................");
		
		System.out.println(isp.isAvailable("4 Mbps"));
		
		System.out.println("BW price: "+ isp.getBandwidthPrice("2 Mbps")+" Taka");
		
		System.out.println("Remaining Package Number: "+isp.getPackageNumber());
		
		System.out.println("Total Sell: "+ isp.getTotalSell()+" Taka");

	}

}
