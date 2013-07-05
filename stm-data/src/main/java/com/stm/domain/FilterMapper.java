package com.stm.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilterMapper implements RowMapper<Filter> {

    public Filter mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Filter(rs.getString("color"),rs.getInt("filterID"),rs.getBoolean("isActive"),rs.getString("name"),rs.getInt("rank"));
    }
}
