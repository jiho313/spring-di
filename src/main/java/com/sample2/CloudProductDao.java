package com.sample2;

public class CloudProductDao implements ProductDao {

	@Override
	public void insertProduct() {
		System.out.println("AWS 클라우드 데이터베이스에 새 상품정보를 등록한다.");
	}
	
	@Override
	public void updateProduct() {
		System.out.println("AWS 클라우드 데이터베이스에 저장된 상품정보를 변경한다.");
	}
}
