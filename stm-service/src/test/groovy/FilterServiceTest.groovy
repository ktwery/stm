package test.groovy

import com.stm.dao.impl.FilterDAOImpl
import com.stm.domain.Filter
import com.stm.services.FilterService
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:../../../../stm-web/src/main/webapp/resources/springConfig/main.xml")
public class FilterServiceTest extends GroovyTestCase {
    def filters = [
            [getFilterID:{1}, getColor:{'blue'}, isActive:{1}, getName:{'myfilter'}, getRank:{1}] as Filter,
            [getFilterID:{2}, getColor:{'green'}, isActive:{1}, getName:{'myfilter2'}, getRank:{2}] as Filter,
            [getFilterID:{3}, getColor:{'yellow'}, isActive:{0}, getName:{'notmyfilter'}, getRank:{3}] as Filter
    ]
    void testGetAllActiveFilters(){
        def filterService = new FilterService()
        filterService.setFilterDAO([getAllFilters:{ ->return filters}] as FilterDAOImpl)
        def claims = filterService.getAllActiveFilters();
        assert claims.size()==2
        assert claims.get(0) == filters.get(0)
        assert claims.get(1) == filters.get(1)
    }
}

