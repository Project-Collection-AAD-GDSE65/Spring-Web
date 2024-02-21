package lk.ijse.gdse.aad.jakarthawebmvc.theory.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO implements Serializable {
    private String id;
    private String name;
    private String city;
}
