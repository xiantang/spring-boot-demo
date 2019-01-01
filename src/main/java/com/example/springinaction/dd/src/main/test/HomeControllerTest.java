import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.view.InternalResourceView;
import spittr.Controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.Controller.SpitterContoller;
import spittr.Controller.SpittleController;
import spittr.config.JdbcConfig;
import spittr.config.RootConfig;
import spittr.config.WebConfig;
import spittr.data.JdbcSpitterRepository;
import spittr.data.SpitterRepository;
import spittr.data.Spittle;
import spittr.data.SpittleRepository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ContextConfiguration(classes = RootConfig.class)

public class HomeControllerTest {

    @Autowired
    private SpitterRepository jdbcSpitterRepository;

    @Autowired
    private JdbcTemplate template;
    // 测试POJO
    @Test
    public void testHomePage() throws Exception {
//        HomeController controller = new HomeController();
//        assertEquals("home",controller.home());
        HomeController controller = new HomeController();
        // 搭建MockMvc
        MockMvc mockMvc = standaloneSetup(controller).build();
        // 对'/' 执行GET请求
        mockMvc.perform(get("/"))
                // 预期得到的视图
                .andExpect(view().name("home"));

    }


    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }


    //测试Spittles
//    @Test
//    public void shouldSHowRecentSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository mockRepository =
//                mock(SpittleRepository.class);
//        when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
//                .thenReturn(expectedSpittles);
//
//        SpittleController controller = new SpittleController(mockRepository);
//
//        MockMvc mockMvc = standaloneSetup(controller)
//                .setSingleView(
//                        new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//
//        // 对"/spittles"发起GET请求
//        mockMvc.perform(get("/spittles"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittleList"));
////                .andExpect(model().attribute("spittleList",hasItems));
//    }


    // 测试分页
//    @Test
//    public void shouldShowPagedSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(50);
//        SpittleRepository mockRepository = mock(SpittleRepository.class);
//        when(mockRepository.findSpittles(238900, 50))
//                .thenReturn(expectedSpittles);
//        SpittleController controller =
//                new SpittleController(mockRepository);
//        MockMvc mockMvc = standaloneSetup(controller)
//                .setSingleView(
//                        new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//        mockMvc.perform(get("/spittles?max=238900&count=50"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittleList"));
//
//    }
//
//    // 测试单条评论
//    @Test
//    public void testSpittle() throws Exception {
//        Spittle expectedSpittle = new Spittle("Hello", new Date());
//        SpittleRepository mockRepository = mock(SpittleRepository.class);
//        when(mockRepository.findOne(12345))
//                .thenReturn(expectedSpittle);
//        SpittleController controller = new SpittleController(mockRepository);
//        MockMvc mockMvc = standaloneSetup(controller).build();
//        mockMvc.perform(get("/spittles/12345"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittle"));
//
//    }


    // 测试登陆页面
    @Test
    public void showShowRegistration() throws Exception{
        SpitterContoller controller = new SpitterContoller();
        // 构建MockMvc
        MockMvc mockMvc = standaloneSetup(controller).build();
        // 断言视图
        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }


    @Test
    public void shouldProcessRegistration() throws Exception{

        SpittleRepository spittleRepository =
                mock(SpittleRepository.class);
//        Spittle unsaved =
//                new Spittler("jbauer", "24hours"
//                        , "Jack", "Bauer");

    }

    @Test
    public void notNull(){
//        jdbcSpitterRepository.count();
        assertNotNull(jdbcSpitterRepository);

    }



}
