package fr.dl3c01n.springsql;

import fr.dl3c01n.springsql.repositories.VideoGameRepository;
import fr.dl3c01n.springsql.services.VideoGamesService;
import fr.dl3c01n.springsql.services.VideoGamesServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public VideoGamesService videoGamesService(VideoGameRepository videoGameRepository){
        return new VideoGamesServiceImpl(videoGameRepository);
    }
}
