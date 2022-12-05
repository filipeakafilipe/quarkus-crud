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
}
