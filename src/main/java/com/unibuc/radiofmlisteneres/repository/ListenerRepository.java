package com.unibuc.radiofmlisteneres.repository;

import com.unibuc.radiofmlisteneres.model.Listener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenerRepository extends JpaRepository<Listener, Integer> {
}
