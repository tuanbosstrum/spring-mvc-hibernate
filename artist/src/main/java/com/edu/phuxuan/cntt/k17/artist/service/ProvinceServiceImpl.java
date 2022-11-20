package com.edu.phuxuan.cntt.k17.artist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.phuxuan.cntt.k17.artist.entity.Province;
import com.edu.phuxuan.cntt.k17.artist.repository.ProvinceRepository;


@Service
public class ProvinceServiceImpl implements BaseService<Province> {
	
	@Autowired
	private ProvinceRepository provinceRepository;

	@Override
	public List<Province> getAll() {
		// TODO Auto-generated method stub
		return provinceRepository.findAll();
	}

	@Override
	public void save(Province object) {
		// TODO Auto-generated method stub
		provinceRepository.save(object);
	}

	@Override
	public Province getByID(int id) {
		// TODO Auto-generated method stub
		return provinceRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		provinceRepository.deleteById(id);
		
	}

	

}
