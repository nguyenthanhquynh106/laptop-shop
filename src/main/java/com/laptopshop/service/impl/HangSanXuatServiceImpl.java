package com.laptopshop.service.impl;

import com.laptopshop.entities.HangSanXuat;
import com.laptopshop.repository.HangSanXuatRepository;
import com.laptopshop.service.HangSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangSanXuatServiceImpl implements HangSanXuatService {

    @Autowired
    private HangSanXuatRepository hangSanXuatRepository;

    @Override
    public List<HangSanXuat> getALlHangSX() {
        return hangSanXuatRepository.findAll();
    }

    @Override
    public HangSanXuat getHSXById(long id) {
        return hangSanXuatRepository.findById(id).get();
    }

    @Override
    public HangSanXuat save(HangSanXuat h) {
        return hangSanXuatRepository.save(h);
    }

    @Override
    public HangSanXuat update(HangSanXuat h) {
        return hangSanXuatRepository.save(h);
    }

    @Override
    public void deleteById(long id) {
        hangSanXuatRepository.deleteById(id);
    }

    @Override
    public Page<HangSanXuat> getALlHangSX(int page, int size) {
        return hangSanXuatRepository.findAll(PageRequest.of(page, size));
    }

}
