package lab02;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

public class Janela extends Botoes {

	public static void main(String[] args) {
		
		//Botoes
				
		 JButton cadastrar = new JButton("CADASTRAR");
		 JButton listar = new JButton("LISTAR");
		 JButton atualizar = new JButton("ATUALIZAR");
		 JButton deletar = new JButton("DELETAR");
	     JButton cadastraraluno = new JButton("CADASTRAR ALUNO");
		 cadastraraluno.setBounds(50,200,150,30);
		
		 
	    //Campos de Texto
		
		
		JLabel labelNome = new JLabel("NOME : ");
        JLabel labelCpf = new JLabel("CPF : ");
        JLabel labelMatricula = new JLabel("MATRICULA : ");
        JLabel labelVertente = new JLabel("VERTENTE : ");
        labelNome.setBounds(50,40,100,20);
        labelCpf.setBounds(50,80,100,20);
        labelMatricula.setBounds(50,120,100,20);
        labelVertente.setBounds(50,160,100,20);
        	
		
	       JFormattedTextField nome = new JFormattedTextField();
           JFormattedTextField cpf = new JFormattedTextField();
           JFormattedTextField matricula = new JFormattedTextField();
           JFormattedTextField vertente = new JFormattedTextField();
           nome.setBounds(150,40,100,20);
           cpf.setBounds(150,80,100,20);
           matricula.setBounds(150,120,100,20);
           vertente.setBounds(150,160,100,20);
		
		
		//Paineis
           
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		painel1.setSize(600,50);
		painel1.setBounds(0, 50, 600, 550);
		painel1.setBackground(Color.WHITE);
		painel1.add(labelNome);
        painel1.add(labelCpf);
        painel1.add(labelMatricula);
        painel1.add(labelVertente);
	    painel1.add(nome);
        painel1.add(cpf);
        painel1.add(matricula);
        painel1.add(vertente);
		painel1.add(cadastraraluno);
		painel1.setVisible(true);
		
		//Painel03 (Listar)
		
		JPanel painel_listar = new JPanel();
		//painel_listar.setLayout(null);
		painel_listar.setSize(600,50);
		painel_listar.setBounds(0, 50, 600, 550);
		painel_listar.setBackground(Color.WHITE);
		painel_listar.setVisible(false);
		
		//Painel 02(Fixo)
		
		JPanel painel2 = new JPanel();
		painel2.setSize(600,30);
		painel2.setBorder(BorderFactory.createLineBorder(Color.black));
		painel2.setBackground(Color.GRAY);
		painel2.add(cadastrar);
		painel2.add(listar);
		painel2.add(atualizar);
		painel2.add(deletar);
		painel2.setVisible(true);
		
		
		//Minha Janela(Tela Principal)
		
		JFrame janela = new JFrame("Sistema de Matricula de Alunos");
		//janela.setLayout(null);
		//janela.setLayout(new GridLayout(2,1));
		janela.setSize(600,600);
		janela.add(painel1);
		janela.add(painel2);
		//janela.add(painel_listar);
		janela.setVisible(true);
	
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}
