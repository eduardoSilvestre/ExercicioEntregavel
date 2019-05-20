import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeALunos;
    private List<Professor> listaDeProfessores;
    private List<Curso> listaDeCursos;
    private List<Matricula> listaDeMatriculas;

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaxAlunos){

        Curso curso1 = new Curso(nome, codigoCurso, quantidadeMaxAlunos);
        listaDeCursos.add(curso1);
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(codigoCurso);
    }

    public void adicionarProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor,
                                          Integer codigoProfessor, Integer horasMonitoria){

        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto (nomeProfessor, sobrenomeProfessor, 0,
                                                            codigoProfessor, horasMonitoria);
        listaDeProfessores.add(professorAdjunto1);
    }

    public void adicionarProfessorTitular (String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor,
                                           String especialidade){

        ProfessorTitular professorTitular1 = new ProfessorTitular(nomeProfessor, sobrenomeProfessor, 0,codigoProfessor,
                                                                  especialidade);
        listaDeProfessores.add(professorTitular1);
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
    }

    public void registrarAluno (String nomeAluno, String sobrenomeAluno, Integer codigoAluno){
        Aluno aluno1 = new Aluno(nomeAluno, sobrenomeAluno, codigoAluno);
        listaDeALunos.add(aluno1);
    }
    public Aluno getAlunoPorCodigo(Integer codigoAluno){

        for (Aluno aluno : listaDeALunos) {
            if (aluno.getCodigoAluno() == codigoAluno){
                return aluno;
            }

        }
            return null;

    }

    public Curso getCursoPorCodigo(Integer codigoCurso){

        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoCurso() == codigoCurso){
                return curso;
            }
        }
            return null;
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

        Curso curso = getCursoPorCodigo(codigoCurso);
        Aluno aluno = getAlunoPorCodigo(codigoAluno);

        if (curso)

    }

}
