package fi.haagahelia.servercourse;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.servercourse.web.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServercourseApplicationTests {

	@Autowired 
	private HelloController controller;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
