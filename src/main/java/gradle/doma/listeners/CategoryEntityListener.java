package gradle.doma.listeners;

import gradle.doma.entity.Categories;
import org.seasar.doma.jdbc.entity.*;

public class CategoryEntityListener implements EntityListener<Categories> {

    @Override
    public void preInsert(Categories categories, PreInsertContext<Categories> context) {
        EntityListener.super.preInsert(categories, context);
    }

    @Override
    public void preUpdate(Categories categories, PreUpdateContext<Categories> context) {
        EntityListener.super.preUpdate(categories, context);
    }

    @Override
    public void preDelete(Categories categories, PreDeleteContext<Categories> context) {
        EntityListener.super.preDelete(categories, context);
    }

    @Override
    public void postInsert(Categories categories, PostInsertContext<Categories> context) {
        EntityListener.super.postInsert(categories, context);
    }

    @Override
    public void postUpdate(Categories categories, PostUpdateContext<Categories> context) {
        EntityListener.super.postUpdate(categories, context);
    }

    @Override
    public void postDelete(Categories categories, PostDeleteContext<Categories> context) {
        EntityListener.super.postDelete(categories, context);
    }
}
