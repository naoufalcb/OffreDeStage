package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkillCertificateDTO
{
    private Long idCertificate;
    private Long idSkill;
}
