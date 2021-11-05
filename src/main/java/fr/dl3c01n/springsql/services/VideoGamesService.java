package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.VideoGame;

import java.util.List;
import java.util.Set;

public interface VideoGamesService {
    List<VideoGame> findAll();
    void create(VideoGame videoGame);
    void delete(Long id);
    VideoGame findOne(Long id);
    Set<VideoGame> findByContain(String word);
}
