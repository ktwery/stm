package com.stm.dao.rowMapper;

import com.stm.domain.Filter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilterRowMapper implements RowMapper<Filter>{
        @Override
        public Filter mapRow(ResultSet rs, int rowNum) throws SQLException {
            Filter filter = new Filter();
            filter.setFilterID(rs.getInt("FILTER_ID"));
            filter.setColor(rs.getString("COLOR"));
            filter.setActive(rs.getBoolean("IS_ACTIVE"));
            filter.setName(rs.getString("NAME"));
            filter.setRank(rs.getInt("RANK"));
            return filter;
        }
}

