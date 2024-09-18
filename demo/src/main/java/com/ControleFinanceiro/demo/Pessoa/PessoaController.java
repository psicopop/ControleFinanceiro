package com.ControleFinanceiro.demo.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @RequestMapping()
    public List<Pessoa> findAll(){
        return this.pessoaService.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Pessoa findById(@PathVariable Long id){
        return this.pessoaService.FindByid(id);
    }
    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa){
        return this.pessoaService.save(pessoa);
    }
    @PutMapping
    public Pessoa update(@RequestBody Pessoa pessoa){
        return this.pessoaService.save(pessoa);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        this.pessoaService.delete(id);
    }



}
