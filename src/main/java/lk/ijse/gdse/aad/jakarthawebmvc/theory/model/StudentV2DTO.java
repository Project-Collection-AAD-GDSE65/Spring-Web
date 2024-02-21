package lk.ijse.gdse.aad.jakarthawebmvc.theory.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentV2DTO implements Serializable {
    List<String>[] name;
    List<String> [] city;
}
