package gradle.doma.configs;

import org.seasar.doma.jdbc.CommandImplementors;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.PreparedSql;
import org.seasar.doma.jdbc.command.*;
import org.seasar.doma.jdbc.query.*;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

public class AppCommandImplementors implements CommandImplementors {

    @Override
    public <RESULT> SelectCommand<RESULT> createSelectCommand(Method method, SelectQuery query, ResultSetHandler<RESULT> resultSetHandler) {
        return CommandImplementors.super.createSelectCommand(method, query, resultSetHandler);
    }

    @Override
    public DeleteCommand createDeleteCommand(Method method, DeleteQuery query) {
        return CommandImplementors.super.createDeleteCommand(method, query);
    }

    @Override
    public InsertCommand createInsertCommand(Method method, InsertQuery query) {
        return CommandImplementors.super.createInsertCommand(method, query);
    }

    @Override
    public UpdateCommand createUpdateCommand(Method method, UpdateQuery query) {
        return CommandImplementors.super.createUpdateCommand(method, query);
    }

    @Override
    public BatchDeleteCommand createBatchDeleteCommand(Method method, BatchDeleteQuery query) {
        return CommandImplementors.super.createBatchDeleteCommand(method, query);
    }

    @Override
    public BatchInsertCommand createBatchInsertCommand(Method method, BatchInsertQuery query) {
        return CommandImplementors.super.createBatchInsertCommand(method, query);
    }

    @Override
    public BatchUpdateCommand createBatchUpdateCommand(Method method, BatchUpdateQuery query) {
        return CommandImplementors.super.createBatchUpdateCommand(method, query);
    }

    @Override
    public <RESULT> FunctionCommand<RESULT> createFunctionCommand(Method method, FunctionQuery<RESULT> query) {
        return CommandImplementors.super.createFunctionCommand(method, query);
    }

    @Override
    public ProcedureCommand createProcedureCommand(Method method, ProcedureQuery query) {
        return CommandImplementors.super.createProcedureCommand(method, query);
    }

    @Override
    public <RESULT> CreateCommand<RESULT> createCreateCommand(Method method, CreateQuery<RESULT> query) {
        return CommandImplementors.super.createCreateCommand(method, query);
    }

    @Override
    public ScriptCommand createScriptCommand(Method method, ScriptQuery query) {
        return CommandImplementors.super.createScriptCommand(method, query);
    }

    @Override
    public <RESULT> SqlProcessorCommand<RESULT> createSqlProcessorCommand(Method method, SqlProcessorQuery query, BiFunction<Config, PreparedSql, RESULT> handler) {
        return CommandImplementors.super.createSqlProcessorCommand(method, query, handler);
    }
}
