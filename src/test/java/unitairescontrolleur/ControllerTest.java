package unitairescontrolleur;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.architecture.logicielle.Application;
import com.architecture.logicielle.mvc.controller.WebController;

@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest(classes = Application.class)
public class ControllerTest {

	@Autowired
    private WebController controller;

	//@Ignore
    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
