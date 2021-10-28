package com.petworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petworld.command.PetVO;
import com.petworld.mapper.PetMapper;


@Service("petService")
public class PetServiceImpl implements PetService{

	@Autowired
	private PetMapper petmapper;
	
	@Override
	public boolean petRegist(PetVO vo) {
		return petmapper.petRegist(vo);
	}

}
