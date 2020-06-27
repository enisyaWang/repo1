import com.wyy.entity.WyyEntity;
import com.wyy.service.WyyService;
import config.WyyConf;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class testWyy {
    @Test
    public void findAll() throws SQLException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(WyyConf.class);
        WyyService ws = (WyyService) ac.getBean("wyyService");

        List<WyyEntity> lwe = ws.findAll();
        System.out.println(lwe);
    }


    @Test
    public void findOne() throws SQLException {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(WyyConf.class);
        WyyService wyyService = applicationContext.getBean("wyyService",WyyService.class);
        WyyEntity we = wyyService.findOneById(2);
        System.out.println(we);
    }
}
