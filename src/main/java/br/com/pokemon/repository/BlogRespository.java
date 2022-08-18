package br.com.pokemon.repository;

import br.com.pokemon.modelo.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Post, Integer> {

    List<Post> findByTitleContainingOrContentContaining(String text, String textAgain);
}