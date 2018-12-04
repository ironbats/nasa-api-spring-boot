package br.com.adtech.security.model;

public class MasterUser {

    private Long id = 1l;
    private String email = "felipe.masterdeveloper@gmail.com";
    private String password = "7218694275905162237644315182889232904370297308549308135143446232159002679111710949916253034019999587";
    private  PerfilEnum perfilEnum  = PerfilEnum.ROLE_ADMIN;


    public void setPerfilEnum(PerfilEnum perfilEnum) {
        this.perfilEnum = perfilEnum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public PerfilEnum getPerfilEnum() {
        return perfilEnum;
    }
}
