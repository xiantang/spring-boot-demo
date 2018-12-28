package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//@Repository
public class JdbcSpitterRepository implements SpitterRepository {
    private JdbcTemplate jdbcTemplate;
    private static final String SELECT_SPITTER = "select id, username, password, fullname, email, updateByEmail from spitter";
    @Autowired
    public JdbcSpitterRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public JdbcSpitterRepository() {
//    }

    @Override
    public Spitter save(Spitter spitter) {
//        jdbcTemplate.update()
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("spitter");
        jdbcInsert.setGeneratedKeyName("id");
        Map<String, Object> args = new HashMap<String, Object>();
//        args.put("id", spitter.getId());
        args.put("username", spitter.getUsername());
        args.put("password", spitter.getPassword());
        args.put("fullname", spitter.getFullName());
        args.put("email", spitter.getEmail());
        args.put("updateByEmail", spitter.isUpdateByEmail());
        long spitterId = jdbcInsert.executeAndReturnKey(args).longValue();

        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Spitter findOne(long id) {
//        return null;
        return jdbcTemplate.queryForObject(
                SELECT_SPITTER + " where id=?",
                // 将查询的结果映射到对象
                new SpitterRowMapper(), id
        );

        // Lambda表达式

    }
    private static final class SpitterRowMapper implements RowMapper<Spitter> {
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {

            // 绑定参数
            long id = rs.getLong("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String fullName = rs.getString("fullname");
            String email = rs.getString("email");
            boolean updateByEmail = rs.getBoolean("updateByEmail");
            return new Spitter(id, username, password, fullName, email, updateByEmail);
        }
    }

    @Override
    public List<Spitter> findAll() {
        return null;
    }
}
