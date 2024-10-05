package com.spotifyclone.repository;

import com.spotifyclone.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {}

