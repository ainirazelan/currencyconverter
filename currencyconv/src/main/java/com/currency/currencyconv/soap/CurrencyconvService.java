package com.currency.currencyconv.soap;

import com.currency.currencyconv.bus.ConvCurrency;
import com.currency.currencyconv.model.Convert;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CurrencyconvService {
	 ConvCurrency cc = new ConvCurrency();

		
		@WebMethod
		public ArrayList<Convert> getCurrencyResult (String denomination) {
			return cc.getCurrencyResult(denomination);
		}
}