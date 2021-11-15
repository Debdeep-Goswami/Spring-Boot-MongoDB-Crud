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
@Document(collection = "User")
public class User implements Serializable {

    public enum role{
        CONSUMER,ISP,OSP,SERVICE_PROVIDER,BO,ADMIN
        }

    public enum gender{
        M,F
     }
    public enum StatusEnum{
        ACTIVE,INACTIVE,LOCKED
    }

    @Enumerated(EnumType.STRING)
    private role role;

    @Enumerated(EnumType.STRING)
    private gender gender;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;


    @Id
   private String id;

    private String first_name;
    private String last_Name;
    private String Email;
    private String Phone;
    private String user_name;
    private char[] password_encrypted;
    private String state;
    private String country;
    LocalDate last_modified_at;
    LocalDate last_modified_by;

   // Constructor, Getter and Setter
}