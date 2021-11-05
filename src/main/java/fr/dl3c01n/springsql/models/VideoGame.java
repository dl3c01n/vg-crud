package fr.dl3c01n.springsql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vg_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private Integer pegi;
    private Date releaseDate;
    @Transient
    private Integer seniority;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    private Review review;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "editor_id", referencedColumnName = "id")
    private Editor editor;

}
