package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentLanguageDTO {
    private Long idStudent;
    private Long idLanguage;
}
