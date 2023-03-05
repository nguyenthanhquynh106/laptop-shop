package com.laptopshop.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class SanPhamDto {

	private String id;
	private String tenSanPham;
	private String donGia;
	private String donViKho;
	private String thongTinBaoHanh;
	private String thongTinChung;
	private String manHinh;
	private String heDieuHanh;
	private String cpu;
	private String ram;
	private String thietKe;
	private String dungLuongPin;
	private long danhMucId;
	private long nhaSXId;
	private MultipartFile hinhAnh;

	@Override
	public String toString() {
		return "SanPhamDto [id=" + id + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", donViKho=" + donViKho
				+ ", thongTinBaoHanh=" + thongTinBaoHanh + ", thongTinChung=" + thongTinChung + ", manHinh=" + manHinh
				+ ", heDieuHanh=" + heDieuHanh + ", cpu=" + cpu + ", ram=" + ram + ", thietKe=" + thietKe
				+ ", dungLuongPin=" + dungLuongPin + ", danhMucId=" + danhMucId + ", nhaSXId=" + nhaSXId + ", hinhAnh="
				+ hinhAnh + "]";
	}
}
