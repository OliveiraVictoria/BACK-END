package br.edu.universidadedevassouras.SCP.service;


import br.edu.universidadedevassouras.SCP.Repository.PessoaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PessoaDAO pDAO;

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {

        return new User("admin",
                "$2a$12$quBEvrqR/VUAmQZfpuWLAe.sppOHLHQLkHILlbt0Uvs2Xrpae4rWy"
                ,new ArrayList<>());
    }
}