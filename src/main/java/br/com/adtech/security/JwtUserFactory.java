package br.com.adtech.security;

import br.com.adtech.security.model.MasterUser;
import br.com.adtech.security.model.PerfilEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

    private JwtUserFactory() {
    }

    /**
     * Converte e gera um JwtUser com base nos dados de um funcionário.
     *
     * @return JwtUser
     */
    public static JwtUser create(MasterUser masterUser) {
        return new JwtUser(masterUser.getId(), masterUser.getEmail(), masterUser.getPassword(),
                mapToGrantedAuthorities(masterUser.getPerfilEnum()));
    }

    /**
     * Converte o perfil do usuário para o formato utilizado pelo Spring Security.
     *
     * @param perfilEnum
     * @return List<GrantedAuthority>
     */
    private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
        return authorities;
    }
}
