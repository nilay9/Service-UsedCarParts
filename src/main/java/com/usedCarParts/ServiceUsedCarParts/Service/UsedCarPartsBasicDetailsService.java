package com.usedCarParts.ServiceUsedCarParts.Service;

import java.util.List;
import java.util.Optional;

import com.usedCarParts.ServiceUsedCarParts.pojo.UsedCarPartsBasicDetails;

public interface UsedCarPartsBasicDetailsService {

	UsedCarPartsBasicDetails addParts(UsedCarPartsBasicDetails usedCarPartsBasicDetails);

	Optional<UsedCarPartsBasicDetails> findPartsByid(String id);

	List<UsedCarPartsBasicDetails> findPartsByCarCompatibility(String carname);

	Optional<UsedCarPartsBasicDetails> findPartsByName(String name);

}
