package com.baseproject.app;

import com.baseproject.domain.Account;
import com.baseproject.domain.Bookmark;
import com.baseproject.repo.AccountRepository;
import com.baseproject.repo.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "com.baseproject")
@EnableJpaRepositories(basePackages = "com.baseproject.repo")
@EntityScan(basePackages = "com.baseproject.domain")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner init(AccountRepository accountRepository,
//                           BookmarkRepository bookmarkRepository) {
//        return (evt) -> Arrays.asList(
//                "jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
//                .forEach(
//                        a -> {
//                            Account account = accountRepository.save(new Account(a,
//                                    "password"));
//                            bookmarkRepository.save(new Bookmark(account,
//                                    "http://bookmark.com/1/" + a, "A description"));
//                            bookmarkRepository.save(new Bookmark(account,
//                                    "http://bookmark.com/2/" + a, "A description"));
//                        });
//    }
}