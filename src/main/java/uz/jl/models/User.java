package uz.jl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jl.enums.Language;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Builder.Default
    private UUID id = UUID.randomUUID();

    private String username;
    private String password;

    @Builder.Default
    private Position position = Position.USER;

    @Builder.Default
    private Language language = Language.RU;

    private boolean locked;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;

    public enum Position {
        USER, TEACHER, ADMIN;
    }


}
