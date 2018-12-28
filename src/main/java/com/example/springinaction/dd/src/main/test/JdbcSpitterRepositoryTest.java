import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.config.JdbcConfig;
import spittr.data.JdbcSpitterRepository;
import spittr.data.Spitter;
import spittr.data.SpitterRepository;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= JdbcConfig.class)
public class JdbcSpitterRepositoryTest {
    @Autowired
    JdbcSpitterRepository spitterRepository;

    @Test
    public  void  assertisNotNull(){
       assertNotNull(spitterRepository);

    }

    @Test
    public void canSave(){
        spitterRepository.save(new Spitter((long)123123, "qqq", "dasd", "dsadas", "dasdas", false));

    }

    @Test
    public void canFindOne(){
        int id = 1;
        spitterRepository.findOne(id);
    }
}
