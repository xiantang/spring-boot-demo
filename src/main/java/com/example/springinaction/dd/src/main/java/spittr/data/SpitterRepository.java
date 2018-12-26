package spittr.config.data;

public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);


}
