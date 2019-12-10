package com.usedCarParts.ServiceUsedCarParts.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usedCarParts.ServiceUsedCarParts.Dao.UsedCarPartsBasicDetailsDao;
import com.usedCarParts.ServiceUsedCarParts.pojo.UsedCarPartsBasicDetails;

@Service
public class UsedCarPartsBasicDetailsServiceImpl implements UsedCarPartsBasicDetailsService{
	
	@Autowired
	UsedCarPartsBasicDetailsDao usedCarPartsDao;

	@Override
	public UsedCarPartsBasicDetails addParts(UsedCarPartsBasicDetails usedCarPartsBasicDetails) {
		usedCarPartsBasicDetails.setId(null);
		long count = usedCarPartsDao.count();
		usedCarPartsBasicDetails.setId(String.valueOf(count++));
		return usedCarPartsDao.save(usedCarPartsBasicDetails);
	}

	@Override
	public Optional<UsedCarPartsBasicDetails> findPartsByid(String id) {
		return usedCarPartsDao.findById(id);
	}

	@Override
	public List<UsedCarPartsBasicDetails> findPartsByCarCompatibility(String carname) {
		System.out.println(carname);
		return usedCarPartsDao.findByPartcompatibility(carname);
	}

	@Override
	public Optional<UsedCarPartsBasicDetails> findPartsByName(String name) {
		
		return usedCarPartsDao.findByPartname(name);
	}

}
