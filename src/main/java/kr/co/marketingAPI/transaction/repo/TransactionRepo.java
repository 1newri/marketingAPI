package kr.co.marketingAPI.transaction.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.lettuce.core.dynamic.annotation.Param;
import kr.co.marketingAPI.transaction.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>{
	
	@Modifying
	@Transactional
	@Query("Update Branch br set"
			+ " br.brName = '판교점'"
			+ " where br.brName= :brName")
	void saveByBrName(@Param("brName") String brName);

}
