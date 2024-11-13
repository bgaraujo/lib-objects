package com.home.dtos.visitor;

import com.home.enums.AuthorizationStatusEnum;
import lombok.Data;

import javax.swing.text.Document;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class VisitorDTO {
    private UUID visitor;
    private UUID userId;
    private String fullName;
    private List<Document> documents;
    private LocalDateTime entryDateTime;
    private LocalDateTime exitDateTime;
    private Long unitId;
    private AuthorizationStatusEnum authorizationStatus;
    private String notes;
}
