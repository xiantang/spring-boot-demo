package spittr.config.data;

import org.springframework.stereotype.Repository;

@Repository
public class FakeSpitterRepository implements SpitterRepository {
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }
}
