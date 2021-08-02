package gradle.doma.dao;

import gradle.doma.entity.Categories;
import org.seasar.doma.BatchInsert;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.SqlLogType;
import org.seasar.doma.jdbc.builder.SelectBuilder;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CategoriesDao {

    default int count() {
        Config config = Config.get(this);
        SelectBuilder builder = SelectBuilder.newInstance(config);
        builder.sql("select count(*) from categories");
        return builder.getScalarSingleResult(int.class);
    }

    @Select
    List<Categories> selectAll();

    @Select
    Categories getById(Integer cid);

    @Select
    List<Categories> search(Categories cat);

    @Select
    List<Categories> testSQL(Categories cat);

    @Insert(sqlFile = true)
    int insert(Categories cat);

    @Insert(sqlFile = true)
    int insertTypeDate(Categories cat);

    @Select
    List<Categories> findByUseIn(List<Integer> ids);

    @BatchInsert(sqlFile = true)
    int[] insertBatch(List<Categories> categories);

}
