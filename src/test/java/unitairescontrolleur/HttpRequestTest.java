package unitairescontrolleur;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.io.File;

import org.hibernate.service.spi.InjectService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.architecture.logicielle.Application;
import com.architecture.logicielle.mvc.controller.WebController;
import com.architecture.logicielle.mvc.data.UserView;
import com.architecture.logicielle.repository.StageRepository;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UserEntity;
import com.architecture.logicielle.service.UserService;
import com.architecture.logicielle.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class HttpRequestTest {
	
    private MockMvc mockMvc;
    File file = new File("new folder");
	Long id = (long) 2222;
    
	@InjectMocks
    private WebController webController;
	
	@Mock
	private UserRepository userRepository;
	private UserService userService = new UserServiceImpl();
	

    private UserEntity userEntityStage =  new UserEntity("alexis","fiers","student","alexis@gmail.com","admin",file,id);
	private UserView userViewStage =  new UserView("alexis","fiers","student","alexis@gmail.com","admin",file,id);
	
    @Before
    public void setup() {
    		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".html");
        
    		MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(webController).setViewResolvers(viewResolver).build();
    }
    
    //@Ignore
    @Test
    public void testShowFromInscription() throws Exception {
        mockMvc.perform(get("/inscription"))
        	       .andExpect(status().isOk());
     }
    
    //@Ignore
    @Test
    public void testInscriptionSubmit() throws Exception {
    		userRepository.deleteAll();
        mockMvc.perform(post("/inscription")
        		.param("firstName", userViewStage.getFirstName())
    			.param("lastName", userViewStage.getLastName())
    			.param("username", userViewStage.getUsername().toString())
    			.param("statut", userViewStage.getStatut())
    			.param("mail", userViewStage.getMail())
    			.param("password", userViewStage.getPassword())
    			.param("photo", userViewStage.getPhoto().toString()))
        		.andExpect(redirectedUrl("/"));
        
        mockMvc.perform(post("/inscription")
        		.sessionAttr("user", new UserView()))
        		.andExpect(status().isOk()).andExpect(model().attribute("ErrorMessage", "Inalid from !"));
     }
    
    //@Ignore
    @Test
    public void testEditProfileSubmit() throws Exception {
    	mockMvc.perform(post("/edit")
        		.sessionAttr("user", new UserView()))
        		.andExpect(model().attribute("ErrorMessage", "Inalid from !"));
    	
    	mockMvc.perform(post("/edit")
        		.param("firstName", userViewStage.getFirstName())
    			.param("lastName", userViewStage.getLastName())
    			.param("username", userViewStage.getUsername().toString())
    			.param("statut", userViewStage.getStatut())
    			.param("mail", userViewStage.getMail())
    			.param("password", userViewStage.getPassword())
    			.param("photo", userViewStage.getPhoto().toString()))
        		.andExpect(redirectedUrl("/"));
      
    }

}
