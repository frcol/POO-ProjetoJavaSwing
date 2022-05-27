package dao;

import entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario>{

    public Usuario selecionarPorUsuarioESenha(String usuario, String senha) {
        Usuario usu = super.getEntityManager()
                .createQuery("SELECT u FROM Usuario u WHERE u.username = :usuario AND u.senha = :senha", Usuario.class)
                .setParameter("usuario", usuario)
                .setParameter("senha", senha)
                .getSingleResult();
        
        return usu;
    }
}
