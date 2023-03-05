package com.laptopshop.service.impl;

import com.laptopshop.entities.VaiTro;
import com.laptopshop.repository.VaiTroRepository;
import com.laptopshop.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaiTroServiceImpl implements VaiTroService {


    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Override
    public VaiTro findByTenVaiTro(String tenVaiTro) {
        return vaiTroRepository.findByTenVaiTro(tenVaiTro);
    }

    @Override
    public List<VaiTro> findAllVaiTro() {
        return vaiTroRepository.findAll();
    }


}
