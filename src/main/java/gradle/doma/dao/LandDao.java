package gradle.doma.dao;

import gradle.doma.entity.Land;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SqlLogType;

import java.util.List;

@ConfigAutowireable
@Dao
public interface LandDao {

    @Select
    List<Land> selectAll();

    @Select(queryTimeout = 20, sqlLog = SqlLogType.RAW)
    List<Land> selectJoin();

}
