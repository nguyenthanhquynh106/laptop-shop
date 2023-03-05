package com.laptopshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class VaiTro {

	@Id
	@GeneratedValue
	private long id;
	
	private String tenVaiTro;

	@JsonIgnore
	@ManyToMany(mappedBy = "vaiTro")
	private Set<NguoiDung> nguoiDung;

	public VaiTro(String tenVaiTro) {
		this.tenVaiTro = tenVaiTro;
	}

	public VaiTro() {
	}
}
