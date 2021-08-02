package gradle.doma.entity;

import gradle.doma.embeddables.CategoryEmbeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.seasar.doma.*;

import java.util.List;

@Entity(metamodel = @Metamodel)
@ToString
@Getter
@Setter
@Table(name = "lands")
public class Land extends CommonEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lid;

    private String lname;

    private String description;

    private Double area;

    private String address;

    @Column(name = "count_views")
    private Integer countViews;

    @Column(name = "status")
    private StatusKbn statusKbn;

    private CategoryEmbeddable categoryEmbeddable;
}
