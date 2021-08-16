package fr.dumernet.springboot.examples.one_to_many.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_phone")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_phone")
    @SequenceGenerator(name = "s_phone", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "number")
    private String number;

}
