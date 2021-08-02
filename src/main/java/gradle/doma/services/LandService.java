package gradle.doma.services;

import gradle.doma.dao.LandDao;
import gradle.doma.entity.Land;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class LandService {

    @Autowired
    private LandDao landDao;

    public List<Land> getAll() {
        System.out.println("The data of method getAll() is : "+landDao.selectAll());
        Optional<List<Land>> optional = Optional.of(landDao.selectAll());
        return optional.isPresent() ? optional.get() : optional.orElse(new ArrayList<>());
    }

    public List<Land> selectJoin() {
        return landDao.selectJoin();
    }
}
