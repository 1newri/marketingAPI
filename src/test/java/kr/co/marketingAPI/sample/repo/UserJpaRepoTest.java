package kr.co.marketingAPI.sample.repo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.marketingAPI.sample.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserJpaRepoTest {
	
	@Autowired
	private UserJpaRepo userJpaRepo;

	@Test
	public void whenFindByUid_thenReturnUser() {
		String uid = "nuri.han92@gmail.com";
		String name = "Nuri Han";
		
		//given
		userJpaRepo.save(User.builder()
				.uid(uid)
				.name(name)
				.build());
	
		// when
		Optional<User> user = userJpaRepo.findByUid(uid);
		
		//then
		assertNotNull(user); 							// user 객체가 null이 아닌지 체크
		assertTrue(user.isPresent());					// user 객체 존재 여부 true/false 체크
		assertEquals(user.get().getName(), name);		// user 객체의 name과 name변수의 값이 같은지 체크
		//assertThat(user.get().getName(), is(name));		// user 객체의 name과 name변수의 값이 같은지 체크
	}
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
