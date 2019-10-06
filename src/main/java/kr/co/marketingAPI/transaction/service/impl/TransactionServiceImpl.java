package kr.co.marketingAPI.transaction.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kr.co.marketingAPI.advice.exception.CBrCodeNotFoundException;
import kr.co.marketingAPI.transaction.mapper.TransactionMapper;
import kr.co.marketingAPI.transaction.model.Result01;
import kr.co.marketingAPI.transaction.model.Result02;
import kr.co.marketingAPI.transaction.model.Result03;
import kr.co.marketingAPI.transaction.model.Result04;
import kr.co.marketingAPI.transaction.repo.TransactionRepo;
import kr.co.marketingAPI.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService{

	private final TransactionMapper transactionMapper;
	private final TransactionRepo transactionRepo;
	
	@Override
	public List<Result01> getYearSumAmtManyCustomList() {
		return transactionMapper.getYearSumAmtManyCustomList();
	}

	@Override
	public List<Result02> getYearNoTransactionCustomList() {
		return transactionMapper.getYearNoTransactionCustomList();
	}

	@Override
	public List<Result03> getYearBranchSumAmtList() {
		return transactionMapper.getYearBranchSumAmtList();
	}

	@Override
	public Result04 branchSumAmtBybranchName(String brName) throws CBrCodeNotFoundException{
		
		// 분당점과 판교점 통폐합(판교점으로 관리점 이관) 처리
		if("분당점".equals(brName)) {
			transactionRepo.saveByBrName(brName);
		}
		
		Result04 result = transactionMapper.branchSumAmtBybranchName(brName);
		Optional.ofNullable(result).orElseThrow(CBrCodeNotFoundException::new);
		
		return result;
	}

}
