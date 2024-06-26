package me.dio.domain.repository;


import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*Nesse trecho de código Java, temos a declaração de uma interface chamada UserRepository,
 que é anotada com a anotação @Repository.

Essa anotação geralmente é usada em classes que acessam o banco de dados ou executam
operações de persistência de dados. No contexto de frameworks como Spring, essa anotação
indica que a classe é responsável por acessar e gerenciar entidades no banco de dados.

Além disso, a interface UserRepository estende JpaRepository<User, Long>.
Isso significa que a interface UserRepository herda métodos que permitem acessar e
manipular entidades do tipo User (uma entidade de domínio que provavelmente representa
um usuário no sistema) com chaves primárias do tipo Long. JpaRepository é uma interface
do Spring Data JPA que fornece métodos prontos para realizar operações de
CRUD (Create, Read, Update, Delete) no banco de dados de forma simples e eficiente,
sem precisar escrever queries SQL manualmente.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}