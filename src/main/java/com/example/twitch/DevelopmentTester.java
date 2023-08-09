package com.example.twitch;


import com.example.twitch.db.FavoriteRecordRepository;
import com.example.twitch.db.ItemRepository;
import com.example.twitch.db.UserRepository;
import com.example.twitch.db.entity.FavoriteRecordEntity;
import com.example.twitch.db.entity.ItemEntity;
import com.example.twitch.db.entity.UserEntity;
import com.example.twitch.external.model.*;
import com.example.twitch.external.TwitchService;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.time.Instant;
import java.util.List;


@Component
public class DevelopmentTester implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(DevelopmentTester.class);

    private final UserRepository userRepository;
    private final ItemRepository itemRepository;
    private final FavoriteRecordRepository favoriteRecordRepository;

    public DevelopmentTester(UserRepository userRepository, ItemRepository itemRepository, FavoriteRecordRepository favoriteRecordRepository) {
        this.userRepository = userRepository;
        this.itemRepository = itemRepository;
        this.favoriteRecordRepository = favoriteRecordRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        UserEntity newUser = new UserEntity(null, "user0", "Foo", "Bar", "password");
        userRepository.save(newUser);
    }
}