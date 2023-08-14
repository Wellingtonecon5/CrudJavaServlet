package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Professor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/Professor")
public class ProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProfessorServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Entrada
		String cmd = request.getParameter("botao");
		String codigo = request.getParameter("codigo");
		String nome = request.getParameter("nome");
		String titulacao = request.getParameter("titulacao");
		
		
		//Retorno
		String saida ="";
		String erro = "";
		Professor p = new Professor();
		List<Professor> professores = new ArrayList<>();
		
		if(!cmd.contains("Listar")) {
			p.setCodigo(Integer.parseInt(codigo));
	}
		if(cmd.contains("Cadastrar") || cmd.contains("Alterar")) {
			p.setNome(nome);
			p.setTitulacao(titulacao);
		
		       }
		try {
			if (cmd.contains("Cadastrar")) {
				cadastrarProfessor(p);
				saida = "Professor cadastrado com sucesso";
				p = null;
			}
			
			
			if (cmd.contains("Alterar")) {
				alterarProfessor(p);
				saida = "Professor alterado com sucesso";
				p = null;
			}
			
			if (cmd.contains("Excluir")) {
				excluirProfessor(p);
				saida = "Professor excluido com sucesso";
				p = null;
			}
			if (cmd.contains("Buscar")) {
				p = buscarProfessor(p);
				
			}
			
			if (cmd.contains("Listar")) {
				professores = listarProfessores();
				
				
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		
	           }
		}

	private Professor buscarProfessor(Professor p) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Professor> listarProfessores() {
		// TODO Auto-generated method stub
		return null;
	}

	private void excluirProfessor(Professor p) {
		// TODO Auto-generated method stub
		
	}

	private void alterarProfessor(Professor p) {
		// TODO Auto-generated method stub
		
	}

	private void cadastrarProfessor(Professor p) {
		// TODO Auto-generated method stub
		
	}

}
