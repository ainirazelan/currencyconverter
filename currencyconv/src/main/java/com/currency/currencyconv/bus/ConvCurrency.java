package com.currency.currencyconv.bus;

import com.currency.currencyconv.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;


public class ConvCurrency {
	
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvCurrency() {
		Convert currencyMalaysia0= new Convert( "YEN", 27.16);
		Convert currencyMalaysia1 = new Convert( "BAHT", 7.88);
		Convert currencyMalaysia2 = new Convert( "EURO", 0.21);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		currenciesMap.put("RM", list);
		
		Convert currencyJapan0= new Convert( "MYR", 0.037);
		Convert currencyJapan1 = new Convert( "BAHT", 0.29);
		Convert currencyJapan2 = new Convert( "EURO", 0.0078);
		
		list = new ArrayList<>();
		list.add(currencyJapan0);
		list.add(currencyJapan1);
		list.add(currencyJapan2);
		currenciesMap.put("YEN", list);
		
		Convert currencyThailand0= new Convert( "YEN", 3.44);
		Convert currencyThailand1 = new Convert( "MYR", 0.13);
		Convert currencyThailand2 = new Convert( "EURO", 0.027);
		
		list = new ArrayList<>();
		list.add(currencyThailand0);
		list.add(currencyThailand1);
		list.add(currencyThailand2);
		currenciesMap.put("BAHT", list);
		
		Convert currencyEurope0= new Convert( "YEN", 128.46);
		Convert currencyEurope1 = new Convert( "MYR", 4.73);
		Convert currencyEurope2 = new Convert( "BAHT", 37.31);
		
		list = new ArrayList<>();
		list.add(currencyEurope0);
		list.add(currencyEurope1);
		list.add(currencyEurope2);
		currenciesMap.put("EURO", list);
		
		
	}
	

	public ArrayList<Convert> getCurrencyResult(String denomination) {
		// TODO Auto-generated method stub
		return currenciesMap.get(denomination);
	}


}
