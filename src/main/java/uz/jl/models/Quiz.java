package uz.jl.models;

import uz.jl.enums.Language;

import java.util.UUID;

public class Quiz {
    private UUID id;
    private UUID userId;
    private Question.Level level;
    private Language language;
    private UUID subjectID;
}
