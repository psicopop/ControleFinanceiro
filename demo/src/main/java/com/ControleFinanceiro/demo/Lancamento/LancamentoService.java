package com.ControleFinanceiro.demo.Lancamento;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    private LancamentoRepository lancamentoRepository;


    public List<Lancamento> findAll(){
        return this.lancamentoRepository.findAll();
    }

    public Lancamento findById(Long id){
        return this.lancamentoRepository.findById(id).orElseThrow();
    }

    public Lancamento save(Lancamento lancamento){
        if(lancamento.equals(new Lancamento())){
            try {
                throw new Exception("lancamento errado");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return  this.lancamentoRepository.save(lancamento);
    }

    public Lancamento update(Lancamento lancamento){
        return this.lancamentoRepository.save(lancamento);
    }

    public void delete(Long id){
        this.lancamentoRepository.deleteById(id);
    }


}
