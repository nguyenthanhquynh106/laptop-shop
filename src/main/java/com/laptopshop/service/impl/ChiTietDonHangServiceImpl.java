package com.laptopshop.service.impl;

import com.laptopshop.entities.ChiTietDonHang;
import com.laptopshop.repository.ChiTietDonHangRepository;
import com.laptopshop.service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {

    @Autowired
    private ChiTietDonHangRepository chiTietDonHangRepository;

    @Override
    public List<ChiTietDonHang> save(List<ChiTietDonHang> list) {
        return chiTietDonHangRepository.saveAll(list);
    }
}
