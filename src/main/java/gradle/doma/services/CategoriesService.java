package gradle.doma.services;

import gradle.doma.dao.CategoriesDao;
import gradle.doma.entity.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CategoriesService {

    @Autowired
    private CategoriesDao categoriesDao;

    public List<Categories> getAll() {
        Optional<List<Categories>> optional = Optional.of(categoriesDao.selectAll());
        return optional.isPresent() ? optional.get() : optional.orElse(new ArrayList<>());
    }

    public Categories getById(Integer cid) {
        return categoriesDao.getById(cid);
    }
    public List<Categories> search(Categories categories) {
        return categoriesDao.search(categories);
    }

    public List<Categories> testSQL(Categories categories) {
        return categoriesDao.testSQL(categories);
    }

    //@Transactional - Test Transactional for AOP
    public int insert(Categories categories) {
        categoriesDao.insert(categories);
        if (true) {
            throw new RuntimeException("★★★rollback ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        }
        return 1;
    }

    public int insertTypeDate(Categories categories) {
        return categoriesDao.insertTypeDate(categories);
    }

    public List<Categories> findByUseIn(List<Integer> ids) {
        return categoriesDao.findByUseIn(ids);
    }

    public int[] insertBatch(List<Categories> categories) {
        return categoriesDao.insertBatch(categories);
    }
}
