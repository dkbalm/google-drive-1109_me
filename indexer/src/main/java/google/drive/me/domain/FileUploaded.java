package google.drive.me.domain;

import google.drive.me.domain.*;
import google.drive.me.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
}


