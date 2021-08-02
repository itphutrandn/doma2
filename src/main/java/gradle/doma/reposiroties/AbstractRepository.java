package gradle.doma.reposiroties;

import org.seasar.doma.jdbc.criteria.Entityql;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRepository {

    @Autowired
    protected Entityql entityql;
}
