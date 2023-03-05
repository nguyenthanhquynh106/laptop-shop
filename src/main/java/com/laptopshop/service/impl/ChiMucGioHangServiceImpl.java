package com.laptopshop.service.impl;

import com.laptopshop.entities.ChiMucGioHang;
import com.laptopshop.entities.GioHang;
import com.laptopshop.entities.SanPham;
import com.laptopshop.repository.ChiMucGioHangRepository;
import com.laptopshop.service.ChiMucGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiMucGioHangServiceImpl implements ChiMucGioHangService {

    @Autowired
    private ChiMucGioHangRepository chiMucGioHangRepository;

    @Override
    public ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g) {
        return chiMucGioHangRepository.findBySanPhamAndGioHang(sp, g);
    }

    @Override
    public ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c) {
        return chiMucGioHangRepository.save(c);
    }

    @Override
    public void deleteChiMucGiohang(ChiMucGioHang c) {
        chiMucGioHangRepository.delete(c);
    }

    @Override
    public List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g) {
        return chiMucGioHangRepository.findByGioHang(g);
    }

    @Override
    public void deleteAllChiMucGiohang(List<ChiMucGioHang> c) {
        chiMucGioHangRepository.deleteAll(c);
    }

}
