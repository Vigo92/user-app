package com.vigo.user.userapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author : Obia Ugochukwu Vigo
 * email : ugochukwu.obia@teamapt.com
 * date : 01/12/2022
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "intern")
public class Intern extends BaseEntity{


    private String details;
}
