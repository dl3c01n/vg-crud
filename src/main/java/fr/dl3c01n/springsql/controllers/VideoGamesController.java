package fr.dl3c01n.springsql.controllers;

import fr.dl3c01n.springsql.services.VideoGamesService;
import fr.dl3c01n.springsql.models.VideoGame;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping
@CrossOrigin
public class VideoGamesController {

    private VideoGamesService videoGamesService;

    public VideoGamesController(VideoGamesService videoGamesService){
        this.videoGamesService = videoGamesService;
    }

    @GetMapping("/games")
    public List<VideoGame> findAll(){
        return this.videoGamesService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody VideoGame videoGame){
        this.videoGamesService.create(videoGame);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.videoGamesService.delete(id);
    }

    @GetMapping("/game/{id}")
    public VideoGame findOne(@PathVariable Long id){
        return this.videoGamesService.findOne(id);
    }

    @GetMapping("/game/contains/{word}")
    public Set<VideoGame> findByContain(@PathVariable String word){
        return this.videoGamesService.findByContain(word);
    }
}
