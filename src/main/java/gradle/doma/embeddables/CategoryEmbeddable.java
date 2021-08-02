package gradle.doma.embeddables;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.seasar.doma.Column;
import org.seasar.doma.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
public class CategoryEmbeddable {

    @Column(name = "cid")
    final int cid;

    @Column(name = "cname")
    final String cname;

    public CategoryEmbeddable(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
