package com.unibuc.radiofmlisteneres.service;

import com.unibuc.radiofmlisteneres.model.Listener;
import com.unibuc.radiofmlisteneres.repository.ListenerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListenerService {

    private final ListenerRepository listenerRepository;

    public ListenerService(ListenerRepository listenerRepository)
    {
        this.listenerRepository = listenerRepository;
    }

    public Listener save (Listener listener)
    {
        return listenerRepository.save(listener);
    }
    public List<Listener> getAll()
    {
        return listenerRepository.findAll();
    }
}
