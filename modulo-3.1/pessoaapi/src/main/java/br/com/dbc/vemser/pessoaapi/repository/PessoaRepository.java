package br.com.dbc.vemser.pessoaapi.repository;

import br.com.dbc.vemser.pessoaapi.dto.PessoaCreateDTO;
import br.com.dbc.vemser.pessoaapi.entity.Pessoa;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class PessoaRepository {
    private static List<Pessoa> listaPessoas = new ArrayList<>();
    private AtomicInteger COUNTER = new AtomicInteger();

    public PessoaRepository() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //18/10/2020

        listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() , "Maicon Gerardi", LocalDate.parse("10/10/1990", formatter),"jhennyfer.sobrinho@dbccompany.com", "12345678910"));
        listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*2*/, "Charles Pereira", LocalDate.parse("08/05/1985", formatter),"jhennyfer.sobrinho@dbccompany.com", "12345678911"));
        listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*3*/, "Marina Oliveira", LocalDate.parse("30/03/1970", formatter),"jhennyfer.sobrinho@dbccompany.com", "12345678912"));
        listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*4*/, "Rafael Lazzari", LocalDate.parse("01/07/1990", formatter),"jhennyfer.sobrinho@dbccompany.com", "12345678916"));
       listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*5*/, "Ana", LocalDate.parse("01/07/1990", formatter),"jhennyfer.sobrinho@dbccompany.com", "12345678917"));

    }

    public Pessoa create(Pessoa pessoa) {
        pessoa.setIdPessoa(COUNTER.incrementAndGet());
        listaPessoas.add(pessoa);
        return pessoa;
    }

    public List<Pessoa> list() {
        return listaPessoas;
    }

    public void delete(Pessoa pessoa) {
        listaPessoas.remove(pessoa);
    }

    public List<Pessoa> listByName(Integer idPessoa) {
        return listaPessoas.stream()
                .filter(pessoa -> pessoa.getIdPessoa().equals(idPessoa))
                .collect(Collectors.toList());
    }
}
