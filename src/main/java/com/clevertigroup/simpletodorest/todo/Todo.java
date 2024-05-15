package com.clevertigroup.simpletodorest.todo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public record Todo(@Id String id, String title, String description, Status status,
                   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
                   @CreatedDate LocalDateTime creationDate,
                   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
                   @LastModifiedDate LocalDateTime lastModifiedDate) {
}
