package com.laptopshop.service.impl;

import com.laptopshop.entities.GioHang;
import com.laptopshop.entities.NguoiDung;
import com.laptopshop.repository.GioHangRepository;
import com.laptopshop.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GioHangServiceImpl implements GioHangService {

    @Autowired
    private GioHangRepository gioHangRepository;

    @Override
    public GioHang getGioHangByNguoiDung(NguoiDung n) {
        return gioHangRepository.findByNguoiDung(n);
    }

    @Override
    public GioHang save(GioHang g) {
        return gioHangRepository.save(g);
    }

}
