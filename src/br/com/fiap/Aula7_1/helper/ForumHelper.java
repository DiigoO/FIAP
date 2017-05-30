package br.com.fiap.Aula7_1.helper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.fiap.Aula7_1.config.HibernateUtil;
import br.com.fiap.Aula7_1.entity.Forum;
import br.com.fiap.Aula7_1.entity.Usuario;

public class ForumHelper {

	Session session = null;
	Transaction transaction = null;

	public void encerrar(){
		session.close();
	}

	public String salvar(Forum forum){ 
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession(); 
			transaction = session.beginTransaction();
			session.save(forum);
			transaction.commit();
			return "Forum salvo"; 
		}catch(Exception e){
			return e.getMessage();
		} 
	}

	public String salvar(Usuario usuario){ 
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession(); 
			transaction = session.beginTransaction();
			session.save(usuario);
			transaction.commit();
			return "Usu�rio salvo"; 
		}catch(Exception e){
			return e.getMessage(); 
		}
	}

	public String adicionarUsuario(int idForum, int idUsuario){ 
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession(); 
			transaction = session.beginTransaction();
			Forum f = (Forum) session.load(Forum.class, idForum);
			Usuario u = (Usuario) session.load(Usuario.class, idUsuario);
			f.getUsuarios().add(u); 
			session.save(f);
			transaction.commit();

			return "Associa��o realizada";

		} catch(Exception e){ 
			return e.getMessage();
		} 
	}

	public String adicionarUsuario(int idForum, Usuario usuario){ 
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession(); 
			transaction = session.beginTransaction();
			Forum f = (Forum) session.load(Forum.class, idForum);
			usuario.setForum(f);
			f.getUsuarios().add(usuario); 
			session.update(f); 
			transaction.commit();

			return "Inclus�o realizada";

		} catch(Exception e){ 
			return e.getMessage();
		} 
	}

	public List<Usuario> listarUsuarios(int idForum){ 
		List<Usuario> usuarios = new ArrayList<Usuario>(); 
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			Forum f = (Forum) session.load(Forum.class, idForum);
			usuarios = f.getUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	} 

	@SuppressWarnings("unchecked")
	public List<Usuario> listarUsuariosCriteria(){ 
		List<Usuario> usuarios = new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			usuarios  = session.createCriteria(Usuario.class)
					.add( Restrictions.in( "nome", "paulo" ) )
					.add( Restrictions.disjunction()
							.add( Restrictions.isNotNull("email") )
							.add( Restrictions.like("email", "@", MatchMode.ANYWHERE ) )
							) 
					.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	} 

	@SuppressWarnings("unchecked")
	public List<Usuario> listarUsuariosHql(){ 
		List<Usuario> usuarios = new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query query = 
					session.createQuery("from Usuario where nome = :nome and (email is not null and email like :email) ");

			query.setParameter("nome", "paulo");
			query.setParameter("email", "%@%");

			usuarios = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	} 

	@SuppressWarnings("unchecked")
	public List<Usuario> listarUsuariosNative(){ 
		List<Usuario> usuarios = new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query queryN = session.createSQLQuery(
					"select * from usuario u where u.nome = :nome and u.email is not null and email like :email")
					.addEntity(Usuario.class)
					.setParameter("nome", "paulo")
					.setParameter("email", "%@%");
			usuarios = queryN.list();


		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	} 
}