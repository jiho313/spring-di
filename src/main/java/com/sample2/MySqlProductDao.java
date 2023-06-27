package com.sample2;

public class MySqlProductDao implements ProductDao {

	@Override
	public void insertProduct() {
		System.out.println("MySql 데이터베이스에 신규 상품정보를 추가한다.");
	}
	
	@Override
	public void updateProduct() {
		System.out.println("MySql 데이터베이스에서 상품정보를 변경한다.");
	}
	
}
