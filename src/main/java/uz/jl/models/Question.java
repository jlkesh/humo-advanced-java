package uz.jl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.enums.Language;

import java.util.List;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {

    @Builder.Default
    private UUID id = UUID.randomUUID();

    private String title;

    @Builder.Default
    private Language language = Language.RU;

    @Builder.Default
    private Level level = Level.EASY;

    private List<QuestionItem> items;

    private Subject subject;

    public enum Level {
        EASY, MEDIUM, HARD
    }

}


