package wijmotopping.domain;

import java.util.*;
import lombok.*;
import wijmotopping.domain.*;
import wijmotopping.infra.AbstractEvent;

@Data
@ToString
public class RankAdded extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdded(Rank aggregate) {
        super(aggregate);
    }

    public RankAdded() {
        super();
    }
}
