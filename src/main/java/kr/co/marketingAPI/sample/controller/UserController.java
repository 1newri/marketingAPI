package kr.co.marketingAPI.sample.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.co.marketingAPI.advice.exception.CUserNotFoundException;
import kr.co.marketingAPI.model.response.CommonResult;
import kr.co.marketingAPI.model.response.ListResult;
import kr.co.marketingAPI.model.response.SingleResult;
import kr.co.marketingAPI.model.response.service.ResponseService;
import kr.co.marketingAPI.sample.User;
import kr.co.marketingAPI.sample.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;

@Api(tags = {"1. Sample User"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/sample")
public class UserController {

	private final UserJpaRepo userJpaRepo;
	private final ResponseService responseService;
	
	@ApiOperation(value = "회원 조회", notes = "모든 회원을 조회한다.")
	@GetMapping(value = "/users")
	public ListResult<User> findAllUser(){
		return responseService.getListResult(userJpaRepo.findAll());
	}
	
	@ApiOperation(value = "회원 단건 조회", notes = "userId로 회원을 조회한다.")
	@GetMapping(value = "/user/{msrl}")
	public SingleResult<User> findUserById(
				@ApiParam(value = "회원아이디", required = true) @PathVariable long msrl,
				@ApiParam(value = "언어", defaultValue = "ko") @RequestParam String lang
			){
		return responseService.getSingleResult(userJpaRepo.findById(msrl).orElseThrow(CUserNotFoundException::new));
	}
	
	@ApiOperation(value = "회원 등록", notes = "모든 회원을 등록한다.")
	@PostMapping(value = "/user")
	public SingleResult<User> save(
				@ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
				@ApiParam(value = "회원이름", required = true) @RequestParam String name
			) {
		User user = User.builder()
				.uid(uid)
				.name(name)
				.build();
		return responseService.getSingleResult(userJpaRepo.save(user));
	}
	
	@ApiOperation(value = "회원정보 수정", notes = "회원정보를 수정한다.")
	@PutMapping(value = "/user")
	public SingleResult<User> modify(
				@ApiParam(value = "회원번호", required = true) @RequestParam long msrl,
				@ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
				@ApiParam(value = "회원이름", required = true) @RequestParam String name
			){
		
		User user = User.builder()
				.msrl(msrl)
				.uid(uid)
				.name(name)
				.build();
		return responseService.getSingleResult(userJpaRepo.save(user));
	}
	
	@ApiOperation(value = "회원 삭제", notes = "userId로 회원정보를 삭제한다.")
	@DeleteMapping(value = "/user/{msrl}")
	public CommonResult delete(
				@ApiParam(value = "회원번호", required = true) @PathVariable long msrl
			) {
		userJpaRepo.deleteById(msrl);
		return responseService.getSuccessResult();
	}
	
}


