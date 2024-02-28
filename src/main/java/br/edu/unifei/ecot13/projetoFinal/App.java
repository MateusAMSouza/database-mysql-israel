package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("israelPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Pastor pastorEstrangeiro = new Pastor();
		Estrangeiro itai = new Estrangeiro(pastorEstrangeiro);
		itai.setNome("Itai");
		itai.setSexo("Masculino");
		itai.setOrigem("Giteu");
		em.persist(pastorEstrangeiro);
		em.persist(itai);
		
		Altar altarJerusalem = new Altar();
		altarJerusalem.setLocal("Jerusalem");
		em.persist(altarJerusalem);
		
		Santuario tenda = new Santuario();
		tenda.setNome("Tenda de Davi");
		tenda.setFixo(true);
		tenda.setDestruido(false);
		tenda.setAltarSacrificio(altarJerusalem);		
		em.persist(tenda);
		
		Cidade jerusalem = new Cidade();
		jerusalem.setNome("Jerusalem");
		jerusalem.setCapital(true);
		jerusalem.setAltar(altarJerusalem);
		em.persist(jerusalem);
		
		Tribo juda = new Tribo();
		juda.setNome("Juda");
		juda.setTamanho(470000);
		juda.setTerritorio("Sul");
		juda.getCidades().add(jerusalem);
		em.persist(juda);
		
		Rei rei = new Rei();
		Pessoa davi = new Israelita(rei, juda);
		davi.setNome("Davi");
		davi.setSexo("Masculino");
		davi.setIdade(38);
		rei.setReinadoAnos(40);
		em.persist(rei);
		em.persist(davi);
		
		Exercito exercito = new Exercito();
		exercito.getTribos().add(juda);
		em.persist(exercito);
		
		/*
		System.out.println("O Rei " + davi.getNome());
	
		rei.setExercito(exercito);
		rei.atividade();
		rei.atividade();
		*/
		
		Pastor pastor = new Pastor();
		Pessoa jesse = new Israelita(pastor, juda);
		jesse.setNome("Jesse");
		jesse.setSexo("Masculino");
		pastor.setTamanhoRebanho(80);
		em.persist(pastor);
		em.persist(jesse);
		
		System.out.println("\n" + jesse.getNome() + " eh um " + jesse.getOcupacao());
		pastor.atividade();
		
		Tribo efraim = new Tribo();
		efraim.setNome("Efraim");
		efraim.setTamanho(400000);
		efraim.setTerritorio("Oeste do Jordao");
		em.persist(efraim);
		exercito.getTribos().add(efraim);
		
		
		Profeta profetaSamuel = new Profeta();
		Pessoa samuel = new Israelita(profetaSamuel, efraim);
		samuel.setNome("Samuel");
		samuel.setSexo("Masculino");
		profetaSamuel.setMensagem(false);
		em.persist(profetaSamuel);
		em.persist(samuel);
		
		//System.out.println("\n" + samuel.getNome() + " eh um " + samuel.getOcupacao());
		
		Livro primeiroSamuel = new Livro();
		primeiroSamuel.setTitulo("1Samuel");
		primeiroSamuel.setProposito("Registro Historico");
		primeiroSamuel.setAutor(profetaSamuel);	
		em.persist(primeiroSamuel);
		
		//System.out.println("Escreveu livro " + primeiroSamuel.getTitulo() + " com proposito de " + primeiroSamuel.getProposito() + "\n");
		
		Tribo levi = new Tribo();
		levi.setNome("Levi");
		em.persist(levi);
		
		Sacerdote sumoSacerdote = new Sacerdote();
		Pessoa abiatar = new Israelita(sumoSacerdote, levi);
		abiatar.setNome("Abiatar");
		abiatar.setSexo("Masculino");
		sumoSacerdote.setSumoSacerdote(true);
		
		sumoSacerdote.setAltar(altarJerusalem);
		altarJerusalem.getSacerdotes().add(sumoSacerdote);
		
		em.persist(sumoSacerdote);
		em.persist(abiatar);
		
		//System.out.println(abiatar.getNome() + " eh um " + abiatar.getOcupacao());
		
		sumoSacerdote.atividade();
		
		Festa trombetas = new Festa();
		trombetas.setNome("Festa das Trombetas");
		trombetas.setDuracaoDias(1);
		trombetas.setMotivo("Ano-Novo");
		trombetas.setMes("Tisri");
		trombetas.getParticipantes().add(samuel);
		trombetas.getParticipantes().add(davi);
		trombetas.getParticipantes().add(abiatar);
		em.persist(trombetas);
		
		Oferta graos = new Oferta();
		graos.setProposito(propositoEnum.Comunhao);
		graos.setTipo(tipoEnum.Cereal);
		em.persist(graos);
		
		davi.getOfertas().add(graos);
				
		sumoSacerdote.getPessoas().add(davi);
		//sumoSacerdote.realizaSacrifiico();
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
