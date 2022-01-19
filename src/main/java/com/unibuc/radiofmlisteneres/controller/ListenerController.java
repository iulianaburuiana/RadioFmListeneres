package com.unibuc.radiofmlisteneres.controller;

import com.unibuc.radiofmlisteneres.model.Listener;
import com.unibuc.radiofmlisteneres.service.ListenerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/listener")
public class ListenerController {
    private  final ListenerService listenerService;

    public ListenerController(ListenerService listenerService)
    {
        this.listenerService = listenerService;
    }
    @PostMapping("/new")
    public ResponseEntity<Listener> saveListener(@RequestBody Listener listener){
        return ResponseEntity.ok()
                .body(listenerService.save(listener));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Listener>> retrieveListeners() {
        return ResponseEntity.ok().body(listenerService.getAll());
    }
}

    

