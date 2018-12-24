import spittr.config.Controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.config.data.Spittle;
import spittr.config.data.SpittleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class HomeControllerTest {


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


    @Test
    public void shouldSHowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mockRepository =
                mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(expectedSpittles);

//        SpittleC

    }
}
