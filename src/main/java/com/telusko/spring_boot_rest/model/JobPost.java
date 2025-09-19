package com.telusko.spring_boot_rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

//The below code is written so as to reduce the steps to write all getters/setters and all code
@Data
@NoArgsConstructor // for default constructor
@AllArgsConstructor // for constructor with arguments
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
