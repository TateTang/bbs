package com.tmf.bbs.util;

import org.apache.ibatis.jdbc.SQL;

import com.tmf.bbs.entity.User;

public class UserSqlUtils {
    /**
     * 动态sql语句 查询 可以根据用户id和用户名查询
     *
     * @param param
     * @return
     */
    public String selectWithParamSql(final User param) {
        return new SQL() {
            {
                SELECT("*");
                FROM("t_user");
                if (param.getId() > 0) {
                    WHERE("id=#{id}");
                }
                if (param.getUsername() != null) {
                    WHERE("username=#{username}");
                }
            }
        }.toString();
    }

}
