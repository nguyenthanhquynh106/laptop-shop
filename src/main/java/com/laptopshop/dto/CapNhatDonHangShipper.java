package com.laptopshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CapNhatDonHangShipper {
	
	private long idDonHang;

	private String ghiChuShipper;

	private List<CapNhatChiTietDon> danhSachCapNhatChiTietDon;

	public static class CapNhatChiTietDon {
		private long idChiTiet;

		private int soLuongNhanHang;

		public long getIdChiTiet() {
			return idChiTiet;
		}

		public void setIdChiTiet(long idChiTiet) {
			this.idChiTiet = idChiTiet;
		}

		public int getSoLuongNhanHang() {
			return soLuongNhanHang;
		}

		public void setSoLuongNhanHang(int soLuongNhanHang) {
			this.soLuongNhanHang = soLuongNhanHang;
		}
	}
}
