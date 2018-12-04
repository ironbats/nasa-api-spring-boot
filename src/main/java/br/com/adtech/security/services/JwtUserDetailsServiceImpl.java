package br.com.adtech.security.services;

import br.com.adtech.security.JwtUserFactory;
import br.com.adtech.security.model.MasterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MasterUser masterUser = new MasterUser();

        if (masterUser  != null && !masterUser.getEmail().isEmpty() && masterUser.getEmail().equalsIgnoreCase(username)) {
            return JwtUserFactory.create(masterUser);
        }

        throw new UsernameNotFoundException("Auhentication failed , username not found .");
    }

}