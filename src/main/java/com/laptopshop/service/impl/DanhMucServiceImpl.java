package com.laptopshop.service.impl;

import com.laptopshop.entities.DanhMuc;
import com.laptopshop.repository.DanhMucRepository;
import com.laptopshop.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DanhMucServiceImpl implements DanhMucService {

    @Autowired
    private DanhMucRepository danhMucRepository;

    @Override
    public DanhMuc save(DanhMuc d) {
        return danhMucRepository.save(d);
    }

    @Override
    public DanhMuc update(DanhMuc d) {
        return danhMucRepository.save(d);
    }

    @Override
    public void deleteById(long id) {
        danhMucRepository.deleteById(id);
    }

    @Override
    public Page<DanhMuc> getAllDanhMucForPageable(int page, int size) {
        return danhMucRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public DanhMuc getDanhMucById(long id) {
        return danhMucRepository.findById(id).get();
    }

    @Override
    public List<DanhMuc> getAllDanhMuc() {
        return danhMucRepository.findAll();
    }

}
