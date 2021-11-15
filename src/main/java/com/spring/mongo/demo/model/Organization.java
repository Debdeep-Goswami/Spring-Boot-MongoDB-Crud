package com.spring.mongo.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Organization")
public class Organization {
   @Id
   private String id;
    private String name;
    private String state;
    private String country;

    public  enum CurrencyEnum{
        USD,INR
    }
    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;

    LocalDate last_modified_at;
    LocalDate last_modified_by;


}
