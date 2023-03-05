package com.laptopshop.service.impl;

import com.laptopshop.dto.TaiKhoanDTO;
import com.laptopshop.entities.NguoiDung;
import com.laptopshop.entities.VaiTro;
import com.laptopshop.repository.NguoiDungRepository;
import com.laptopshop.repository.VaiTroRepository;
import com.laptopshop.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class NguoiDungServiceImpl implements NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public NguoiDung findByEmail(String email) {
        return nguoiDungRepository.findByEmail(email);
    }

    @Override
    public NguoiDung findByConfirmationToken(String confirmationToken) {
        return null;
    }

    @Override
    public NguoiDung saveUserForMember(NguoiDung nd) {
        nd.setPassword(bCryptPasswordEncoder.encode(nd.getPassword()));
        Set<VaiTro> setVaiTro = new HashSet<>();
        setVaiTro.add(vaiTroRepository.findByTenVaiTro("ROLE_MEMBER"));
        nd.setVaiTro(setVaiTro);
        return nguoiDungRepository.save(nd);
    }

    @Override
    public NguoiDung findById(long id) {
        NguoiDung nguoiDung = nguoiDungRepository.findById(id).get();
        return nguoiDung;
    }

    @Override
    public NguoiDung updateUser(NguoiDung nguoiDung) {
        return nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public void changePass(NguoiDung nd, String newPass) {
        nd.setPassword(bCryptPasswordEncoder.encode(newPass));
        nguoiDungRepository.save(nd);
    }

    @Override
    public Page<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro, int page) {
        return nguoiDungRepository.findByVaiTro(vaiTro, PageRequest.of(page - 1, 6));
    }

    @Override
    public List<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro) {
        return nguoiDungRepository.findByVaiTro(vaiTro);
    }

    @Override
    public NguoiDung saveUserForAdmin(TaiKhoanDTO dto) {
        NguoiDung nd = new NguoiDung();
        nd.setHoTen(dto.getHoTen());
        nd.setDiaChi(dto.getDiaChi());
        nd.setEmail(dto.getEmail());
        nd.setSoDienThoai(dto.getSdt());
        nd.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));

        Set<VaiTro> vaiTro = new HashSet<>();
        vaiTro.add(vaiTroRepository.findByTenVaiTro(dto.getTenVaiTro()));
        nd.setVaiTro(vaiTro);

        return nguoiDungRepository.save(nd);
    }

    @Override
    public void deleteById(long id) {
        nguoiDungRepository.deleteById(id);
    }

}
