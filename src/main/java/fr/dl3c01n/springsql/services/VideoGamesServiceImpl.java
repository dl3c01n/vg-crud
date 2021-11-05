package fr.dl3c01n.springsql.services;

import fr.dl3c01n.springsql.models.VideoGame;
import fr.dl3c01n.springsql.repositories.VideoGameRepository;

import java.util.List;
import java.util.Set;

public class VideoGamesServiceImpl implements VideoGamesService{

    private VideoGameRepository videoGamesRepository;

    public VideoGamesServiceImpl(VideoGameRepository videoGamesRepository){
        this.videoGamesRepository = videoGamesRepository;
    }

    public List<VideoGame> findAll() {
        return this.videoGamesRepository.findAll();
    }

    public void create(VideoGame videoGame){
        this.videoGamesRepository.save(videoGame);
    }

    public void delete(Long id){
        this.videoGamesRepository.deleteById(id);
    }

    public VideoGame findOne(Long id){
        return this.videoGamesRepository.findById(id).orElse(null);
    }

    public Set<VideoGame> findByContain(String word){
        return this.videoGamesRepository.findByNameContainingWord(word);
    }
}
