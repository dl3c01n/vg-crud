package fr.dl3c01n.springsql.repositories;

import fr.dl3c01n.springsql.models.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {
    @Query("SELECT vg FROM VideoGame vg WHERE vg.titre LIKE %:word%")
    public Set<VideoGame> findByNameContainingWord(@Param("word") String word);
}
