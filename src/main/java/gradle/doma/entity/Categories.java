package gradle.doma.entity;

import gradle.doma.enums.CatStatus;
import gradle.doma.listeners.CategoryEntityListener;
import lombok.*;
import org.seasar.doma.*;

import java.util.List;

@Entity(listener = CategoryEntityListener.class, metamodel = @Metamodel)
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Categories extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    @Column(name = "cname")
    private String cname;

    @org.springframework.data.annotation.Transient
    @Column(name = "status")
    private CatStatus catStatus;

    @Transient
    private List<Land> lands;
}
