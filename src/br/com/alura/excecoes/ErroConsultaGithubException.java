package br.com.alura.excecoes;

public class ErroConsultaGithubException extends RuntimeException{

    public ErroConsultaGithubException(String mensagem) {
        super(mensagem);
    }
}
