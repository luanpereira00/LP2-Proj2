public class Main{
	public static void main(String[] args){
		System.out.println();
		ProfessorHorista professorHorista = new ProfessorHorista("Joao", "1234", 45, 10, "0");
		professorHorista.print();
		System.out.println();
		Professor professor = new Professor("Joao", "1234", 45);
		professor.print();
		System.out.println();
		ProfessorRegime professorRegime = new ProfessorRegime("Joao", "1234", 45, 10);
		professorRegime.print();
		
		System.out.println();
		ProfessorHorista professorHoristaStandard = new ProfessorHorista();
		professorHoristaStandard.print();
		System.out.println();
		Professor professorStandard = new Professor();
		professorStandard.print();
		System.out.println();
		ProfessorRegime professorRegimeStandard = new ProfessorRegime();
		professorRegimeStandard.print();
	}
}
