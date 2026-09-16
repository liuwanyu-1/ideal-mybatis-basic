package edu.teaching.mybatis.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String create_time;

}
