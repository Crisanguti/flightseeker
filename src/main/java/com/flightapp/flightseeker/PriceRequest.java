package com.flightapp.flightseeker;

import java.util.Scanner;

public class PriceRequest {

	Scanner myObj = new Scanner(System.in);
    
    String minPriceStr = myObj.nextLine();
    String maxPriceStr = myObj.nextLine();

    int minPrice = Integer.parseInt(minPriceStr);
    int maxPrice = Integer.parseInt(maxPriceStr);
	
}
