package spittr.config.data;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

}
