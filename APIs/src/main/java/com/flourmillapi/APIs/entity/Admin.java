package com.flourmillapi.APIs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
    //it will automatically generate the Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    private String username;
    private String password;
    private boolean superAdmin=false;
    private boolean status=true;


}
