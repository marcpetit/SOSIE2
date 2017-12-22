package unitairesservices;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.architecture.logicielle.Application;
import com.architecture.logicielle.mvc.data.UserView;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UserEntity;
import com.architecture.logicielle.service.UserService;
import com.architecture.logicielle.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@PropertySource("application.properties")
public class userImpTest {	
	
	@Autowired
    private UserRepository userRepo;
	
	private UserService userService = new UserServiceImpl();
	
	File file = null;
	Long id = (long) 1111;
	Long idTeacher = (long) 1234;
	private UserEntity userEnt =  new UserEntity("alexis","fiers","student","alexis.fiers@gmail.com","admin",file,id);
	private UserEntity userEntTeacher =  new UserEntity("Nicolas","Dos Santos","teacher","nicola@gmail.com","nico",file,idTeacher);
	private UserView userview =  new UserView("alexis","fiers","student","alexis.fiers@gmail.com","admin",file,id);

	//@Ignore
	@Test
    public void testparseUserViewToUserEntity() throws Exception {
		assertThat(userService.parseUserViewToUserEntity(userview)).isEqualTo(userEnt);
    }

	//@Ignore
	@Test
    public void testParseUserEntityToUserView() throws Exception {
		assertEquals(userService.parseUserEntityToUserView(userEnt), userview);
    }
	
	//@Ignore
	@Test
    public void testSaveUser() throws Exception {
		userService.saveUser(userEnt, userRepo);
		UserEntity newUser = userRepo.findOne(userEnt.getUsername());
		assertEquals(newUser, userEnt);
    }
	
	//@Ignore
	@Test
    public void testCheckUser() throws Exception {
		UserEntity userEntReturn = userService.checkUser(userEnt, userRepo);
		UserEntity newUser = userRepo.findOne(userEnt.getUsername());
		assertEquals(newUser, userEntReturn);
    }
	
	//@Ignore
	@Test
    public void testGetUserById() throws Exception {
		UserEntity userEntReturn = userService.GetUserById(id, userRepo);
		UserEntity newUser = userRepo.findOne(id);
		assertEquals(newUser, userEntReturn);
    }
	
	//@Ignore
	@Test
    public void testDeleteUser() throws Exception {

		userService.deleteUser(userEnt, userRepo);
		UserEntity newUser = userRepo.findOne(id);
		assertNull(newUser);
    }
	
    //@Ignore
	@Test
    public void testGetUserByNAme() throws Exception {
		userService.saveUser(userEnt, userRepo);
		UserEntity newUser = userService.getUserByNAme(userEnt.getFirstName(), userEnt.getLastName(), userRepo);
		assertEquals(newUser, userEnt);
		userRepo.delete(userEnt);
		assertNull(userService.getUserByNAme(userEnt.getFirstName(), userEnt.getLastName(), userRepo));
	}
	
	//@Ignore
	@Test
    public void testGetAllTeachers() throws Exception {
		userService.saveUser(userEntTeacher, userRepo);
		assertEquals(userRepo.findByStatut("teacher"), userService.getAllTeachers(userRepo));
	}
}
