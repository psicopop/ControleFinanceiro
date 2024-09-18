package com.ControleFinanceiro.demo.Meta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {

@Autowired
private MetaRepository metaRepository;

public List<Meta> findAll(){
return this.metaRepository.findAll();
}

public Meta findById(Long id){
    return this.metaRepository.findById(id).orElseThrow();
}

public Meta save(Meta meta){
if(meta.equals(new Meta())){
    try {
        throw new Exception("Meta nao encontrado");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

return this.metaRepository.save(meta);
}

public Meta update(Meta meta){
    return this.metaRepository.save(meta);
}


public void delete(Long id){
    this.metaRepository.deleteById(id);
}



}
