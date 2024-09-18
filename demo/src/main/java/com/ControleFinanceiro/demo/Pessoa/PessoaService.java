package com.ControleFinanceiro.demo.Pessoa;

import com.ControleFinanceiro.demo.Meta.MetaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return this.pessoaRepository.findAll();
    }

    public Pessoa FindByid(Long id){
        return this.pessoaRepository.findById(id).orElseThrow();
    }

    public Pessoa save(Pessoa pessoa){
        if(pessoa.equals(new Pessoa())){
            try {
                throw new Exception("Pessoa nao encontrada");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return this.pessoaRepository.save(pessoa);
    }

    public Pessoa update(Pessoa pessoa){
        return this.pessoaRepository.save(pessoa);
    }

    public void delete(Long id){

        this.pessoaRepository.deleteById(id);
    }

}
