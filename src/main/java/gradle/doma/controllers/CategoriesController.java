package gradle.doma.controllers;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import gradle.doma.entity.Categories;
import gradle.doma.reposiroties.CategoryRepository;
import gradle.doma.services.CategoriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoriesController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("index")
    public List<Categories> index() {
        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        log.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return categoriesService.getAll();
    }

    @GetMapping("getById/{cid}")
    public Categories getById(@PathVariable Integer cid) {
        return categoriesService.getById(cid);
    }

    @GetMapping("search")
    public List<Categories> search(@RequestParam String cname, @RequestParam Integer cid) {
        Categories categories = new Categories();
        categories.setCid(cid);
        categories.setCname(cname);
        log.info("method search________________");
        return categoriesService.search(categories);
    }

    @GetMapping("testSQL")
    public List<Categories> testSQL(@RequestParam(required = false) String cname, @RequestParam Integer cid) {
        Categories categories = new Categories();
        categories.setCid(cid);
        categories.setCname(cname);
        return categoriesService.testSQL(categories);
    }

    @GetMapping("insert")
    public int testSQL(@RequestParam String cname) {
        Categories categories = new Categories();
        categories.setCname(cname);
        return categoriesService.insert(categories);
    }

    @GetMapping("insertTypeDate")
    public int insertTypeDate(@RequestParam String cname) {
        Categories categories = new Categories();
        categories.setCname(cname);
        System.out.println("createdAt:"+getCreatedAt(null));
        categories.setCreatedAt(getCreatedAt(null));
        return categoriesService.insertTypeDate(categories);
    }

    private Date getCreatedAt(String strDate) {
        return new Date();
    }

    @GetMapping("findByUseIn")
    public List<Categories> findByUseIn(@RequestParam String ids) {
        String[] arsInt =  ids.split(",");
        List<Integer> ids_ = new ArrayList<>();
        Arrays.stream(arsInt).forEach(e -> {
            ids_.add(Integer.valueOf(e));
        });
        return categoriesService.findByUseIn(ids_);
    }

    @GetMapping("insertBatch")
    public int[] insertBatch() {
        List<Categories> categories = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Categories cat = new Categories();
            cat.setCname("Category test "+i);
            cat.setCreatedAt(new Date());
            categories.add(cat);
        }
        return categoriesService.insertBatch(categories);
    }

    @GetMapping("test01-criteria")
    public void criteria01() {

        categoryRepository.getAll();
    }
}
