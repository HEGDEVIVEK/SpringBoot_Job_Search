package com.code.SpringBoot_mongodb.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDetail {

    @Id
    private int id;
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;

}
