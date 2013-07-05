import com.stm.dao.impl.FilterDAOImpl
import com.stm.domain.Filter
import com.stm.services.impl.FilterServiceImpl
import org.springframework.beans.factory.annotation.Autowired

class FilterServiceImplTest extends GroovyTestCase {
    //   private FilterServiceImp
    @Autowired
    private FilterDAOImpl filterDAOimpl;
    @Autowired
    private FilterServiceImpl filterService;

    void testSortFilterByRank() {
        def data =
            [
                    [
                            isActive: true,
                            rank: 1,
                            color: "red",
                            filterID: 1,

                            name: "firstFilter"

                    ]as Filter,
                    [
                            filterID: 2,
                            name: "secondFilter",
                            color: "blue",
                            isActive: true,
                            rank: 3

                    ]as Filter,
                    [
                            filterID: 3,
                            name: "secondFilter",
                            color: "blue",
                            isActive: true,
                            rank: 2

                    ] as Filter
            ] as List<Filter>

        filterService = [:] as FilterServiceImpl
        filterService.sortFiltersByRank(data)
        assertTrue(data.get(0).getRank() == 1)
        assertTrue(data.get(1).getRank() == 2)
        assertTrue(data.get(2).getRank() == 3)
    }
}
