package gradle.doma.reposiroties;

import gradle.doma.entity.Categories;
import gradle.doma.entity.Categories_;
import gradle.doma.entity.Land_;
import gradle.doma.entity._Land;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.criteria.Entityql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Component
public class CategoryRepository extends AbstractRepository{

    public void getAll() {
        Categories_ categories = new Categories_();
        List<Categories> lists = entityql.from(categories).fetch();
        lists.forEach(e -> System.out.println(e));
    }

//    public void getJoin() {
//        Categories_ cat = new Categories_();
//        Land_ lands = new Land_();
//        List<Categories> lists = entityql.from(cat)
//                .innerJoin(lands, on -> on.eq(lands.ca.cid, cat.cid))
//                .associate(lands, cat, (l,c) -> {
//                    //employee.setDepartment(department);
//                    c.getLands().add(l);
//                }).fetch();
//        lists.forEach(e -> System.out.println(e));
//    }

}