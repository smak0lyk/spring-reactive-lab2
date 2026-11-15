package org.example.lb2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {
    private Long id;
    private Client client;
    private ServiceCategory category;
    private String description;
}