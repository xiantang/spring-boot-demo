package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class JdbcSpitterRepository implements SpitterRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcSpitterRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public JdbcSpitterRepository() {
//    }

    @Override
    public Spitter save(Spitter spitter) {
//        jdbcTemplate.update()
        return null;
    }
    private long insertSpitterAndReturnId(Spitter spitter) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("Spitter");
        jdbcInsert.setGeneratedKeyName("id");
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("username", spitter.getUsername());
        args.put("password", spitter.getPassword());

        args.put("email", spitter.getEmail());

        long spitterId = jdbcInsert.executeAndReturnKey(args).longValue();
        return spitterId;
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
        return null;
    }

    @Override
    public List<Spitter> findAll() {
        return null;
    }
}
