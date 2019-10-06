package kr.co.marketingAPI.transaction.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@Slf4j
public class TransactionContollerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void api01Test() throws Exception{
		
		log.info("2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API");
		mockMvc.perform(MockMvcRequestBuilders
            .get("/api/1")
            .header("X-AUTH-TOKEN", ""))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect((ResultMatcher) jsonPath("$.success").value(true))
            .andExpect((ResultMatcher) jsonPath("$.list").exists());
	}
	@Test
	public void api02Test() throws Exception{
		log.info("2018년, 2019년에 거래가 없는 고객을 추출하는 API");
		mockMvc.perform(MockMvcRequestBuilders
				.get("/api/2")
				.header("X-AUTH-TOKEN", ""))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath("$.success").value(true))
				.andExpect((ResultMatcher) jsonPath("$.list").exists());
	}
	@Test
	public void api03Test() throws Exception{
		log.info("연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서대로 출력하는 API");
		mockMvc.perform(MockMvcRequestBuilders
				.get("/api/3")
				.header("X-AUTH-TOKEN", ""))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath("$.success").value(true))
				.andExpect((ResultMatcher) jsonPath("$.list").exists());
	}
	@Test
	public void api04Test() throws Exception{
		log.info("지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API");
		mockMvc.perform(MockMvcRequestBuilders
				.get("/api/4/안산점?lang=ko")
				.header("X-AUTH-TOKEN", ""))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath("$.success").value(true))
				.andExpect((ResultMatcher) jsonPath("$.data").exists());
	}

}
