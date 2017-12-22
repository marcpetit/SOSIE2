package unitairesservices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.architecture.logicielle.Application;
import com.architecture.logicielle.mvc.data.StageView;
import com.architecture.logicielle.repository.StageRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.service.StageService;
import com.architecture.logicielle.service.StageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class StageImpTest {
	
	@Autowired
	private StageRepository stageRepository;
	private StageService stageService = new StageServiceImpl();
	
	@Autowired
	private UserRepository userRepository;
	
	private StageView stageView = new StageView();
	
	//@Ignore
	@Test
    public void testDeleteStage() throws Exception {
	
	}

}
