package gradle.doma.configs;

import org.seasar.doma.jdbc.command.ResultSetHandler;
import org.seasar.doma.jdbc.command.SelectCommand;
import org.seasar.doma.jdbc.query.SelectQuery;

public class AppSelectCommand<RESULT> extends SelectCommand<RESULT> {

    public AppSelectCommand(SelectQuery query, ResultSetHandler<RESULT> resultSetHandler) {
        super(query, resultSetHandler);
    }
}
