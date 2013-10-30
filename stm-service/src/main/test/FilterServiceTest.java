package main.test;

import com.stm.domain.Filter;
import com.stm.services.FilterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:../../../../stm-web/src/main/webapp/resources/springConfig/application-context.xml")
public class FilterServiceTest {
    @Autowired
    private FilterService filterService;

    @Test
    public void testGetAllActiveFilters() {
        List<Filter> activeFilters = this.filterService.getAllActiveFilters();
        assert (activeFilters.size() > 0);
        for(Filter filter: activeFilters){
            assert (filter.isActive());
            System.out.println("printing all filter data...");
            System.out.println("IS_ACTIVE NAME    COLOR FILTER_ID RANK");
            System.out.println(filter.isActive()+"     "+filter.getName()+" "+filter.getColor()+"  "+filter.getFilterID()
                    +"         "+filter.getRank());
        }
    }
}
