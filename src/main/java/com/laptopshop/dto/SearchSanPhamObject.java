package com.laptopshop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchSanPhamObject {

	private String danhMucId;
	private String hangSXId;
	private String donGia;
	
	// Sap xep theo gia
	private String sapXepTheoGia;
	private String[] keyword;
	private String sort;
	
	// Sap xep theo danhmuc va hangsx
	private String brand;
	private String manufactor;
	
	// Sx theo ram, pin, OS
	private String os;
	private String ram;
	private String pin;

	public SearchSanPhamObject() {
		danhMucId = "";
		hangSXId = "";
		donGia = "";
		sapXepTheoGia = "ASC";
	}

	@Override
	public String toString() {
		return "SearchObject [danhMucId=" + danhMucId + ", hangSXId=" + hangSXId + ", price=" + donGia + "]";
	}
}
