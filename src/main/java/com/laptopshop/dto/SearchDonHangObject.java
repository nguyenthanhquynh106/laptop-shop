package com.laptopshop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDonHangObject {

	private String trangThaiDon;
	private String tuNgay;
	private String denNgay;

	public SearchDonHangObject() {
		trangThaiDon = "";
		tuNgay = "";
		denNgay = "";
	}

	@Override
	public String toString() {
		return "SearchDonHangObject [trangThaiDon=" + trangThaiDon + ", tuNgay=" + tuNgay + ", denNgay=" + denNgay
				+ "]";
	}
	
	
}
