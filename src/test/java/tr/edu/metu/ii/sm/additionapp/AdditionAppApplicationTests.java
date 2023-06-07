package tr.edu.metu.ii.sm.additionapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tr.edu.metu.ii.sm.additionapp.model.AdditionModel;
import tr.edu.metu.ii.sm.additionapp.service.AdditionService;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class AdditionAppApplicationTests {

	@Autowired
	private AdditionService additionService;

	@Test
	void givenTwo_positive_numbers_return_correct_result() throws Exception {
		Assertions.assertEquals(additionService.addIntegers(1, 1), 2);
	}
}
