import org.example.Pessoa;
import org.example.ServicoPessoa;
import org.junit.Assert;
import org.junit.Test;

public class TesteServicoPessoa {

    @Test
    public void testePessoaValida(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");

        Assert.assertEquals(1, ServicoPessoa.validarPessoa(pessoa));
    }

    @Test
    public void testePessoaInvalida(){
        Pessoa pessoa = new Pessoa();
        Assert.assertEquals(0, ServicoPessoa.validarPessoa(pessoa));
    }

    @Test
    public void testeCadastroPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");

        Assert.assertEquals(1, ServicoPessoa.validarPessoa(pessoa));

        Assert.assertEquals(1, ServicoPessoa.cadastrarPessoa(pessoa));
    }

    @Test
    public void testeEditarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");
        if(ServicoPessoa.validarPessoa(pessoa) == 1){
            if(ServicoPessoa.cadastrarPessoa(pessoa) == 1){
                pessoa.setIdPessoa(1);
                pessoa.setNome("Ageu");
                pessoa.setCpf("11111111111111");
                pessoa.setIdade(20);
                pessoa.setSexo('M');
                Assert.assertTrue(ServicoPessoa.editarPessoa(pessoa));
            }
        }
    }

    @Test
    public void testeExcluirPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");
        ServicoPessoa.cadastrarPessoa(pessoa);

        Assert.assertTrue(ServicoPessoa.excluirPessoa(1));
        Assert.assertEquals(0, ServicoPessoa.getListaPessoa().size());
    }

    @Test
    public void testeConsultarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(1);
        pessoa.setNome("Ageu");
        pessoa.setCpf("11111111111111");
        ServicoPessoa.cadastrarPessoa(pessoa);

        Assert.assertEquals("Ageu", ServicoPessoa.consultarPessoa(1).getNome());
    }

}
