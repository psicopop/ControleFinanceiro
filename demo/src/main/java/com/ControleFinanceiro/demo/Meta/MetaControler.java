package com.ControleFinanceiro.demo.Meta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/meta")
public class MetaControler {

@Autowired
private MetaService metaService;

@GetMapping()
public List<Meta> findAll(){
    return metaService.findAll();
}

@GetMapping(value = "/{id}")
public Meta findById(@PathVariable Long id){
    return metaService.findById(id);
}

@PostMapping
public Meta save(@RequestBody Meta meta){
    return this.metaService.save(meta);
}

@PutMapping
public Meta update(@RequestBody Meta meta){
    return this.metaService.save(meta);
}

@DeleteMapping(value = "/{id}")
public void deleteById(Long id){
    this.metaService.delete(id);
    }




































}
