package uz.jl.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionItem {

    @Builder.Default
    private UUID id = UUID.randomUUID();

    private String answer;

    private boolean right;

}
