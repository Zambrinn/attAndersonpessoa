import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServicePersonTest {

    @Test
    public void findElderPerson() {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Tio Patinhas");
        pessoa.setAge(20);

        Pessoa pessoa2 = new Pessoa();
        pessoa.setName("Zambrin");
        pessoa.setAge(18);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);


        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(pessoa.getName(), servicoPessoa.identifyElderPerson(pessoas).getName());
    }

    @Test
    public void findNewestPerson() {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Tio Patinhas");
        pessoa.setAge(20);

        Pessoa pessoa2 = new Pessoa();
        pessoa.setName("Zambrin");
        pessoa.setAge(18);

        Pessoa pessoa3 = new Pessoa();
        pessoa.setName("Fernanda");
        pessoa.setAge(19);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(pessoa2, servicoPessoa.findNewestPerson(pessoas));
    }
}