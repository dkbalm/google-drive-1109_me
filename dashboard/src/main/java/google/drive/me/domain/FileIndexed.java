package google.drive.me.domain;

import google.drive.me.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
