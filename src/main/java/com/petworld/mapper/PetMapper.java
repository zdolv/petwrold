package com.petworld.mapper;

import java.util.ArrayList;

import com.petworld.command.PetVO;


public interface PetMapper {

	public boolean petRegist(PetVO vo);
	public ArrayList<PetVO> getList();
	
}
