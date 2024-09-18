package com.ControleFinanceiro.demo.Lancamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lancamento")
public class LancamentoControler {

    @Autowired
    private LancamentoService lancamentoService;

    public List<Lancamento> findAll(){
        return this.lancamentoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Lancamento findById(@PathVariable Long id){
        return this.lancamentoService.findById(id);
    }

    @PostMapping
    public Lancamento save(@RequestBody Lancamento lancamento){
        return  this.lancamentoService.save(lancamento);
    }

    @PutMapping
    public Lancamento update(@RequestBody Lancamento lancamento){
        return  this.lancamentoService.save(lancamento);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(Long id){
        this.lancamentoService.delete(id);
    }




}
