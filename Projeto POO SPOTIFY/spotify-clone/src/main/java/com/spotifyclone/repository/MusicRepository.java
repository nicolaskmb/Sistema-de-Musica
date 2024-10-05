package com.spotifyclone.repository;

import com.spotifyclone.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {}
