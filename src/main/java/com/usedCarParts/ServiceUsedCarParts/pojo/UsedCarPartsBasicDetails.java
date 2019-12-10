package com.usedCarParts.ServiceUsedCarParts.pojo;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class UsedCarPartsBasicDetails {
	
	@Id 
	private String id;
	@Field
	
	private String partname;
	@Field
	
	private int partprice;
	@Field
	
	private String parttype;
	@Field
	
	private String partmodel;
	@Field
	
	private String partcompany;
	@Field
	
	private List<String> partcompatibility;
	
	public UsedCarPartsBasicDetails() {}

	public UsedCarPartsBasicDetails(String id, String partname, int partprice, String parttype, String partmodel,
			String partcompany, List<String> partcompatibility) {
		this.id = id;
		this.partname = partname;
		this.partprice = partprice;
		this.parttype = parttype;
		this.partmodel = partmodel;
		this.partcompany = partcompany;
		this.partcompatibility = partcompatibility;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public int getPartprice() {
		return partprice;
	}

	public void setPartprice(int partprice) {
		this.partprice = partprice;
	}

	public String getParttype() {
		return parttype;
	}

	public void setParttype(String parttype) {
		this.parttype = parttype;
	}

	public String getPartmodel() {
		return partmodel;
	}

	public void setPartmodel(String partmodel) {
		this.partmodel = partmodel;
	}

	public String getPartcompany() {
		return partcompany;
	}

	public void setPartcompany(String partcompany) {
		this.partcompany = partcompany;
	}

	public List<String> getPartcompatibility() {
		return partcompatibility;
	}

	public void setPartcompatibility(List<String> partcompatibility) {
		this.partcompatibility = partcompatibility;
	}
	
	
	
	

	
}
