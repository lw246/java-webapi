package com.baseproject.repo;

import com.baseproject.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;


public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{
    Collection<Bookmark> findByAccountUsername(String username);
}
