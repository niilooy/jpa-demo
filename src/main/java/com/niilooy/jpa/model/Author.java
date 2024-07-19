package com.niilooy.jpa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends _BaseEntity {
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    @SequenceGenerator(
//            name = "author_sequence",
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.TABLE,
//            generator = "author_id_gen"
//    )
//    @TableGenerator(
//            name = "author_id_gen",
//            table = "id_generator",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            allocationSize = 1
//    )

    @Column(name = "f_name", length = 50)
    private String firstName;

    @Column(name = "l_name")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors") // many to many relationship owned by Course defined in authors list
    private List<Course> courses;

//    @Column(updatable = false, nullable = false)
//    private LocalDateTime createdAt;
//
//    @Column(insertable = false)
//    private LocalDateTime lastModified;

}
