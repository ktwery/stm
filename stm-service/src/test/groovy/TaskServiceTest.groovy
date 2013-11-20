package test.groovy

import com.stm.dao.impl.FilterDAOImpl
import com.stm.dao.impl.TaskDAOImpl
import com.stm.domain.Filter
import com.stm.domain.Task
import com.stm.services.FilterService
import com.stm.services.TaskService

class TaskServiceTest extends GroovyTestCase {
    def filters = [
            [getFilterID:{1}, getColor:{'blue'}, isActive:{1}, getName:{'myfilter'}, getRank:{1}] as Filter,
            [getFilterID:{2}, getColor:{'green'}, isActive:{1}, getName:{'myfilter2'}, getRank:{2}] as Filter,
    ]
    def storedTasks = [
            [getTaskID: {1}, getFilterID: {1}, getTitle: {'MPA-123'}, getRank: {1}, getContent: { 'hi' }] as Task,
            [getTaskID: {2}, getFilterID: {2}, getTitle: {'MPA-234'}, getRank: {2}, getContent: { null }] as Task,
            [getTaskID: {3}, getFilterID: {3}, getTitle: {'MPA-456'}, getRank: {3}, getContent: { ' ' }] as Task,
    ]

    void testGetAllActiveFilters() {
        def taskService = new TaskService()
        taskService.setTaskDAO([getAllTasks: {-> return storedTasks }] as TaskDAOImpl)
        def filterService = [:] as FilterService
        filterService.setActiveFilters(filters)
        taskService.setFilterService(filterService)

        def tasks = taskService.getAllActiveTasks()
        assert tasks.size() == 2
        assert tasks.get(0) == storedTasks.get(0)
        assert tasks.get(1) == storedTasks.get(1)
    }
}
