package puc.imoveis.services;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import javax.transaction.Transactional;

import puc.imoveis.entities.Movel;
import puc.imoveis.repositories.MovelRepository;

@ApplicationScoped
public class MovelService {
    @Inject
    MovelRepository movelRepository;

    @Transactional
    public void insert(Movel movelRequest) {
        Movel movel = new Movel();
        movel.setNome(movelRequest.getNome());
        movelRepository.persist(movel);
    }

    public Movel get(Long id) {
        return movelRepository.findById(id);
    }

    @Transactional
    public void delete(Long id) {
        movelRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, Movel movelRequest) {
        Movel movel = movelRepository.findById(id);
        movel.setNome(movelRequest.getNome());
        movelRepository.persist(movel);
    }
}
