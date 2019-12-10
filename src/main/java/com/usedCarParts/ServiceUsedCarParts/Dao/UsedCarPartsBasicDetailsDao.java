package com.usedCarParts.ServiceUsedCarParts.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.usedCarParts.ServiceUsedCarParts.pojo.UsedCarPartsBasicDetails;


@Repository
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "usedCarPartsBasicDetails")
public interface UsedCarPartsBasicDetailsDao extends CouchbasePagingAndSortingRepository<UsedCarPartsBasicDetails, String> {

	@Query("#{#n1ql.selectEntity} where #{#n1ql.filter} AND ANY carnames IN partcompatibility SATISFIES carnames = $1 END")
	List<UsedCarPartsBasicDetails> findByPartcompatibility(String carname);

	@Query
	Optional<UsedCarPartsBasicDetails> findByPartname(String name);

	

}
