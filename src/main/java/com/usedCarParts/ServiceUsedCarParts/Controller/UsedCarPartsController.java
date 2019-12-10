package com.usedCarParts.ServiceUsedCarParts.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usedCarParts.ServiceUsedCarParts.Service.UsedCarPartsBasicDetailsService;
import com.usedCarParts.ServiceUsedCarParts.pojo.UsedCarPartsBasicDetails;

@RestController
@RequestMapping("/parts")
public class UsedCarPartsController {
	
	@Autowired
	UsedCarPartsBasicDetailsService usedCarPartsService;
	
	@PostMapping("/add")
	public UsedCarPartsBasicDetails addUsedCarPart(@RequestBody UsedCarPartsBasicDetails usedCarPartsBasicDetails) {
		return usedCarPartsService.addParts(usedCarPartsBasicDetails);
		
	} 
	
	@GetMapping("/partId/{id}")
	public Optional<UsedCarPartsBasicDetails> findUsedCarPart(@PathVariable String id) {
		return usedCarPartsService.findPartsByid(id);
	} 
	
	@GetMapping("/partBycar/{carname}")
	public List<UsedCarPartsBasicDetails> findUsedCarPartByCarCompatibility(@PathVariable String carname) {
		List<UsedCarPartsBasicDetails> list= usedCarPartsService.findPartsByCarCompatibility(carname);
		return list;
	} 
	
	@GetMapping("/partName/{name}")
	public Optional<UsedCarPartsBasicDetails> findUsedCarPartByPartName(@PathVariable String name) {
		return usedCarPartsService.findPartsByName(name);
	} 
	
	

}
