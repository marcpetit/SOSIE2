package unitairesservices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.architecture.logicielle.Application;
import com.architecture.logicielle.mvc.data.UniteEnseignementView;
import com.architecture.logicielle.repository.UniteEnseignementRepository;
import com.architecture.logicielle.repository.UserRepository;
import com.architecture.logicielle.repository.entities.UniteEnseignementEntity;
import com.architecture.logicielle.repository.entities.UserEntity;
import com.architecture.logicielle.service.UniteEnseignementService;
import com.architecture.logicielle.service.UniteEnseignementServiceImpl;
import com.architecture.logicielle.mvc.data.UniteEnseignementView;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@PropertySource("application.properties")
public class UniteEnseignementImpTest {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UniteEnseignementRepository UniteEnRepository;
	private UniteEnseignementService ueService = new UniteEnseignementServiceImpl();
	
	private UniteEnseignementView ueview = new UniteEnseignementView("1234","nameUE1","Nicolas","Dos Santos","description UE1");
	private UniteEnseignementView ueviewTest = new UniteEnseignementView("1122","nameUE2","paul","lecompte","description UE2");
	private File file = null;
	private Long idTeacher = (long) 1234;
	private Long idTeacherTest = (long) 1122;
	private UserEntity userEntTeacher =  new UserEntity("Nicolas","Dos Santos","teacher","nicola@gmail.com","nico",file,idTeacher);
	private UserEntity userEntTeacherTest =  new UserEntity("Paul","lecompte","teacher","paul@gmail.com","paul",file,idTeacherTest);
	private UniteEnseignementEntity ueEntityTest = new UniteEnseignementEntity(ueviewTest.getIdentifiant(),ueviewTest.getNom(),userEntTeacher,ueviewTest.getDescription());
	private UniteEnseignementEntity ueEntity = new UniteEnseignementEntity(ueview.getIdentifiant(),ueview.getNom(),userEntTeacher,ueview.getDescription());
	
	@Ignore
	@Test
    public void testParseUniteEnseignementViewToUniteEnseignementEntityy() throws Exception {
		//UniteEnRepository.deleteAll();
		//userRepository.deleteAll();
		userRepository.save(userEntTeacher);
		assertEquals(ueEntity,ueService.parseUniteEnseignementViewToUniteEnseignementEntity(ueview, userRepository));
		userRepository.delete(userEntTeacher);
		assertNull(ueService.parseUniteEnseignementViewToUniteEnseignementEntity(ueview, userRepository));
    }
		
	//@Ignore	
	@Test
    public void testSaveUniteEnseignement() throws Exception {
		userRepository.save(userEntTeacherTest);
		ueService.saveUniteEnseignement(ueEntity, UniteEnRepository, userRepository);
	}
	
	//@Ignore
	@Test
    public void testCheckUniteEnseignement() throws Exception {
		//ueService.saveUniteEnseignement(ueEntity, UniteEnRepository, userRepository);
		//userRepository.deleteAll();
		UniteEnRepository.deleteAll();
		userRepository.save(userEntTeacher);
		UniteEnRepository.save(ueEntity);
		assertEquals(ueEntity, ueService.checkUniteEnseignement(ueEntity, UniteEnRepository));
	}
	
	//@Ignore
	@Test
    public void testGetUniteEnseignementById() throws Exception {
		userRepository.save(userEntTeacherTest);
		UniteEnRepository.save(ueEntityTest);
		assertEquals(ueEntity, ueService.GetUniteEnseignementById(ueEntity.getIdentifiant(), UniteEnRepository));
	}
	
	//@Ignore
	@Test
    public void testParseUserEntityToUniteEnseignementView() throws Exception {
		assertEquals(ueService.parseUserEntityToUniteEnseignementView(ueEntity),ueview);
	}
	
	//@Ignore
	@Test
    public void testdeleteUniteEnseignementw() throws Exception {
		//userRepository.deleteAll();
		//UniteEnRepository.deleteAll();
		userRepository.save(userEntTeacher);
		UniteEnRepository.save(ueEntity);
		ueService.deleteUniteEnseignement(ueEntity, UniteEnRepository);
		assertNull(UniteEnRepository.findOne("1234"));
	}
	
	//@Ignore
	@Test
    public void testgetListUE() throws Exception {
		userRepository.save(userEntTeacher);
		UniteEnRepository.save(ueEntity);
		assertEquals(UniteEnRepository.findAll(), ueService.getListUE(UniteEnRepository));
	}
}
