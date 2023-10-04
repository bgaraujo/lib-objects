package com.home.dtos.document;

import com.home.dtos.enums.DocumentType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DocumentDTO {
    private DocumentType documentType;
    private String number;
    private LocalDate expirationDate;
}
