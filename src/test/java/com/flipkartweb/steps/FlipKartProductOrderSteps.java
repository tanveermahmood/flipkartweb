package com.flipkartweb.steps;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.flipkartweb.bean.ProductInfoBean;
import com.flipkartweb.page.AddToCartPage;
import com.flipkartweb.page.FlipkarthomeTestPage;
import com.flipkartweb.page.ProductdetailTestPage;
import com.flipkartweb.page.SearchresultTestPage;
import com.flipkartweb.page.SelectproductTestPage;
import com.flipkartweb.utils.CommonUtils;

public class FlipKartProductOrderSteps {

	
	@Test
	public void checkTestOrderFlow()
	{
		FlipkarthomeTestPage flipkarthomeTestPage=new FlipkarthomeTestPage();
		flipkarthomeTestPage.launchSite();
		flipkarthomeTestPage.verifyFlipKartHomePage();
		flipkarthomeTestPage.selectCatogory("Electronics","Apple");
		
		SelectproductTestPage selectproductTestPage=new SelectproductTestPage();
		selectproductTestPage.verifySelectProductPage();
		selectproductTestPage.selectProduct("iPad");
		
		SearchresultTestPage searchresultTestPage=new SearchresultTestPage();
		searchresultTestPage.verifyProductList();
		searchresultTestPage.selectProductName(0);
		
		ProductdetailTestPage productdetailTestPage=new ProductdetailTestPage();
		productdetailTestPage.verifyProductOnDetailPage();
		
		productdetailTestPage.selectAddtoCartButton();
		AddToCartPage addToCartPage=new AddToCartPage();
		addToCartPage.verifyProductOnAddToCartPage();
		
	}
	
//	@Test
//	public void CheckTestProductInfoBean()
//	{
//		ProductInfoBean productInfoBean = new ProductInfoBean();
//		productInfoBean.setProductName("p1");
//		productInfoBean.setProductPrice("1000");
//		HashMap<String, ProductInfoBean> productInfo = new HashMap<String, ProductInfoBean>();
//		productInfo.put(productInfoBean.productName, productInfoBean);
//		CommonUtils.setProductItem(productInfo);
//		HashMap<String, ProductInfoBean> productInfo2 = CommonUtils.getProductItems();
//		for (String key : productInfo2.keySet()) {
//			ProductInfoBean details = productInfo2.get(key);
//			System.out.println("productNAme" + details.getProductName());
//			System.out.println("Product price" + details.getProductPrice());
//		}
//	}
//	
}
