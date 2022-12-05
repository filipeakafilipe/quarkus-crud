package puc.imoveis.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import puc.imoveis.entities.Comodo;
import puc.imoveis.repositories.ComodoRepository;

@ApplicationScoped
public class ComodoService {
    @Inject
    ComodoRepository comodoRepository;

    @Transactional
    public void insert(Comodo comodoRequest) {
        Comodo comodo = new Comodo();
        comodo.setTamanho(comodoRequest.getTamanho());
        comodo.setImovelId(comodoRequest.getImovelId());
        comodoRepository.persist(comodo);
    }

    public Comodo get(Long id) {
        return comodoRepository.findById(id);
    }

    @Transactional
    public void delete(Long id) {
        comodoRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, Comodo comodoRequest) {
        Comodo comodo = comodoRepository.findById(id);
        comodo.setTamanho(comodoRequest.getTamanho());
        comodo.setImovelId(comodoRequest.getImovelId());
        comodoRepository.persist(comodo);
    }
}
