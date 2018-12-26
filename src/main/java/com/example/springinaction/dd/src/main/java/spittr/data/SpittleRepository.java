package spittr.data;

import java.util.List;
import java.util.Map;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
