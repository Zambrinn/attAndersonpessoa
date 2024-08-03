import java.util.List;

public class ServicoPessoa {

    public Pessoa identifyElderPerson(List<Pessoa> pessoas) {
        // return pessoas.get();
        Pessoa pessoaOld = new Pessoa();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getAge() > pessoaOld.getAge()) {
                pessoaOld = pessoas.get(i);
            }
        }
        return pessoaOld;
    }

    public Pessoa findNewestPerson(List<Pessoa> pessoas) {
        Pessoa newestPessoa = null;

        for (int i = 0; i < pessoas.size(); i++) {
            if(newestPessoa == null){
                newestPessoa = pessoas.get(i);
            } else if (pessoas.get(i).getAge()<newestPessoa.getAge()) {
                newestPessoa = pessoas.get(i);
            }
        }
        return newestPessoa;
    }
}