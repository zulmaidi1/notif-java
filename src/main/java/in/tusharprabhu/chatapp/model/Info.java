package in.tusharprabhu.chatapp.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Info {
    private String message;
    private Boolean isMaintenance;
}
